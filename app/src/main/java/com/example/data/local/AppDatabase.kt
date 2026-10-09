package com.example.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.data.model.ChallengeJournalEntry
import com.example.data.model.HabitCertificate
import com.example.data.model.HabitProgressEntity
import com.example.data.model.Verse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(
    entities = [Verse::class, HabitProgressEntity::class, ChallengeJournalEntry::class, HabitCertificate::class],
    version = 3,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun verseDao(): VerseDao
    abstract fun habitProgressDao(): HabitProgressDao
    abstract fun challengeJournalDao(): ChallengeJournalDao
    abstract fun habitCertificateDao(): HabitCertificateDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "proverbios_database"
                )
                .fallbackToDestructiveMigration()
                .addCallback(DatabaseCallback(context.applicationContext, scope))
                .build()
                INSTANCE = instance
                instance
            }
        }

        private class DatabaseCallback(
            private val appContext: Context,
            private val scope: CoroutineScope
        ) : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                        populateDatabase(appContext, database.verseDao())
                    }
                }
            }

            suspend fun populateDatabase(context: Context, verseDao: VerseDao) {
                if (verseDao.getVerseCount() < 900) {
                    verseDao.insertAll(ProverbsDataSeeder.loadAllVerses(context))
                }
            }
        }
    }
}

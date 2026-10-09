package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.model.Verse
import kotlinx.coroutines.flow.Flow

@Dao
interface VerseDao {

    @Query("SELECT * FROM verses ORDER BY chapter ASC, verseNumber ASC")
    fun getAllVerses(): Flow<List<Verse>>

    @Query("SELECT * FROM verses WHERE id = :id LIMIT 1")
    fun getVerseById(id: Int): Flow<Verse?>

    @Query("SELECT * FROM verses WHERE chapter = :chapter ORDER BY verseNumber ASC")
    fun getVersesByChapter(chapter: Int): Flow<List<Verse>>

    @Query("""
        SELECT * FROM verses 
        WHERE primaryCategory = :category OR tags LIKE '%' || :category || '%'
        ORDER BY chapter ASC, verseNumber ASC
    """)
    fun getVersesByCategory(category: String): Flow<List<Verse>>

    @Query("""
        SELECT * FROM verses 
        WHERE text LIKE '%' || :query || '%' 
           OR reference LIKE '%' || :query || '%' 
           OR tags LIKE '%' || :query || '%'
           OR practicalAdvice LIKE '%' || :query || '%'
        ORDER BY chapter ASC, verseNumber ASC
    """)
    fun searchVerses(query: String): Flow<List<Verse>>

    @Query("SELECT * FROM verses WHERE isFavorite = 1 ORDER BY favoriteTimestamp DESC")
    fun getFavoriteVerses(): Flow<List<Verse>>

    @Query("SELECT COUNT(*) FROM verses")
    suspend fun getVerseCount(): Int

    @Query("SELECT * FROM verses ORDER BY id ASC")
    suspend fun getAllVersesSnapshot(): List<Verse>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(verses: List<Verse>)

    @Query("UPDATE verses SET isFavorite = :isFavorite, favoriteTimestamp = :timestamp WHERE id = :id")
    suspend fun updateFavorite(id: Int, isFavorite: Boolean, timestamp: Long)

    @Query("UPDATE verses SET personalNote = :note WHERE id = :id")
    suspend fun updatePersonalNote(id: Int, note: String)
}

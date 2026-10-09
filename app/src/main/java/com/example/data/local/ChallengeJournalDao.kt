package com.example.data.local

import androidx.room.*
import com.example.data.model.ChallengeJournalEntry
import kotlinx.coroutines.flow.Flow

@Dao
interface ChallengeJournalDao {

    @Query("SELECT * FROM challenge_journal WHERE challengeId = :challengeId ORDER BY dateTimestamp DESC")
    fun getEntriesForChallenge(challengeId: String): Flow<List<ChallengeJournalEntry>>

    @Query("SELECT * FROM challenge_journal WHERE challengeId = :challengeId AND dayNumber = :dayNumber LIMIT 1")
    suspend fun getEntryForDay(challengeId: String, dayNumber: Int): ChallengeJournalEntry?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEntry(entry: ChallengeJournalEntry): Long

    @Delete
    suspend fun deleteEntry(entry: ChallengeJournalEntry)

    @Query("DELETE FROM challenge_journal WHERE id = :id")
    suspend fun deleteEntryById(id: Long)
}

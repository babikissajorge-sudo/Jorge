package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.model.HabitProgressEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitProgressDao {

    @Query("SELECT * FROM habit_progress WHERE challengeId = :challengeId")
    fun getProgressByChallenge(challengeId: String): Flow<List<HabitProgressEntity>>

    @Query("SELECT * FROM habit_progress")
    fun getAllProgress(): Flow<List<HabitProgressEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun markDayCompleted(progress: HabitProgressEntity)

    @Query("DELETE FROM habit_progress WHERE challengeId = :challengeId AND dayNumber = :dayNumber")
    suspend fun unmarkDay(challengeId: String, dayNumber: Int)
}

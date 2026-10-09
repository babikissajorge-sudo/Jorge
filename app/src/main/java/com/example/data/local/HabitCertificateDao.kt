package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.model.HabitCertificate
import kotlinx.coroutines.flow.Flow

@Dao
interface HabitCertificateDao {

    @Query("SELECT * FROM habit_certificates ORDER BY completionDate DESC")
    fun getAllCertificates(): Flow<List<HabitCertificate>>

    @Query("SELECT * FROM habit_certificates WHERE challengeId = :challengeId LIMIT 1")
    suspend fun getCertificateForChallenge(challengeId: String): HabitCertificate?

    @Query("SELECT * FROM habit_certificates WHERE challengeId = :challengeId LIMIT 1")
    fun observeCertificateForChallenge(challengeId: String): Flow<HabitCertificate?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCertificate(certificate: HabitCertificate): Long

    @Query("DELETE FROM habit_certificates WHERE challengeId = :challengeId")
    suspend fun deleteCertificate(challengeId: String)
}

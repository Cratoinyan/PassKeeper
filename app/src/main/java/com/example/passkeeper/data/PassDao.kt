package com.example.passkeeper.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PassDao {
    @Query("select * from pass")
    fun getAll():List<Pass>

    @Insert
    fun insert(pass:Pass)

    @Delete
    fun delete(pass: Pass)
}
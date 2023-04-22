package com.example.passkeeper.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Pass::class], version = 1, exportSchema = false)
abstract class PassDatabase:RoomDatabase() {
    abstract fun passDao():PassDao
}
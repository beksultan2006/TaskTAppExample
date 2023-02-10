package com.example.taskappexample.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.taskappexample.ui.new_task.TaskDao
import com.example.taskappexample.ui.new_task.TaskEntity

@Database(
    entities = [
        TaskEntity::class
    ],
    version = 2,
)
abstract class AppDataBase: RoomDatabase()  {
    abstract val taskDao: TaskDao

}

package com.alerecchi.baseproject.di.modules

import dagger.Module

@Module
abstract class DataBaseModule {

    /*@Singleton
    @Provides
    fun providesDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "app-database").build()
    }*/

    /*@Singleton
    @Provides
    fun providesSimplebaseDao(database: AppDatabase) = database.simpleDao()*/
}
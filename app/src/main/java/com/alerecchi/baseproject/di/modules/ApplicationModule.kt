package com.alerecchi.baseproject.di.modules

import android.content.Context
import com.alerecchi.baseproject.presentation.BaseApplication
import dagger.Binds
import dagger.Module

@Module
abstract class ApplicationModule {

    @Binds
    abstract fun bindContext(application: BaseApplication): Context

}
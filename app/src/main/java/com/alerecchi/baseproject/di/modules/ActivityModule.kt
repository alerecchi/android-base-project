package com.alerecchi.baseproject.di.modules

import com.alerecchi.baseproject.di.scope.ActivityScoped
import com.alerecchi.baseproject.presentation.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun mainActivity(): MainActivity

}
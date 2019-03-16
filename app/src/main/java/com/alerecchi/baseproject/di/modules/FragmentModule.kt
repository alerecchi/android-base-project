package com.alerecchi.baseproject.di.modules

import com.alerecchi.baseproject.MainFragment
import com.alerecchi.baseproject.di.scope.FragmentScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment
}
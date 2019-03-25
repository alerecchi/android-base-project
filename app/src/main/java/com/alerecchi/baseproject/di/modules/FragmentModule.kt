package com.alerecchi.baseproject.di.modules

import com.alerecchi.baseproject.di.scope.FragmentScoped
import com.alerecchi.baseproject.presentation.view.fragment.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment
}
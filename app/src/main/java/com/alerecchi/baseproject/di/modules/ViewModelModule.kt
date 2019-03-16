package com.alerecchi.baseproject.di.modules

import androidx.lifecycle.ViewModelProvider
import com.alerecchi.baseproject.di.provider.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    /*@Binds
    @IntoMap
    @ViewModelKey(SimpleViewModel::class)
    abstract fun bindSimpleViewModel(simpleViewModel: SimpleViewModel): ViewModel*/

}
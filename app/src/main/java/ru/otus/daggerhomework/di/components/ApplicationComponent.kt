package ru.otus.daggerhomework.di.components

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.otus.daggerhomework.di.AppContext

@Component
interface ApplicationComponent {

    @AppContext
    fun provideContext(): Context

    companion object {
        fun createComponent(@AppContext context: Context): ApplicationComponent {
            return DaggerApplicationComponent.factory().create(context)
        }
    }

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance @AppContext context: Context): ApplicationComponent
    }

}
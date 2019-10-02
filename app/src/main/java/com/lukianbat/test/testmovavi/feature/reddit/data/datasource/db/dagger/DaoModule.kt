package com.lukianbat.test.testmovavi.feature.reddit.data.datasource.db.dagger

import com.lukianbat.test.testmovavi.core.dagger.scope.ActivityScope
import com.lukianbat.test.testmovavi.core.data.AppDatabase
import com.lukianbat.test.testmovavi.feature.reddit.data.datasource.db.RedditPostDao
import dagger.Module
import dagger.Provides

@Module
class DaoModule {

    @Provides
    @ActivityScope
    fun provideDao(database: AppDatabase): RedditPostDao = database.redditEntryDao()

}
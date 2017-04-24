package com.lxr.perfectguangde.di.module;

import com.lxr.perfectguangde.app.App;
import com.lxr.perfectguangde.model.DataManager;
import com.lxr.perfectguangde.model.db.DBHelper;
import com.lxr.perfectguangde.model.db.RealmHelper;
import com.lxr.perfectguangde.model.http.HttpHelper;
import com.lxr.perfectguangde.model.http.RetrofitHelper;
import com.lxr.perfectguangde.model.sp.ImplSpHelper;
import com.lxr.perfectguangde.model.sp.SpHelper;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by Admin on 2017/4/24  13:33
 *
 * @desc
 */

public class AppModule {

    private final App application;

    public AppModule(App application) {
        this.application = application;
    }


    @Provides
    @Singleton
    App provideApplicationContext() {
        return application;
    }


    @Provides
    @Singleton
    HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper) {
        return retrofitHelper;
    }


    @Provides
    @Singleton
    DBHelper provideDBHelper(RealmHelper realmHelper) {
        return realmHelper;
    }


    @Provides
    @Singleton
    SpHelper providePreferencesHelper(ImplSpHelper implPreferencesHelper) {
        return implPreferencesHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(HttpHelper httpHelper, DBHelper DBHelper, SpHelper preferencesHelper) {
        return new DataManager(httpHelper, DBHelper, preferencesHelper);
    }

}

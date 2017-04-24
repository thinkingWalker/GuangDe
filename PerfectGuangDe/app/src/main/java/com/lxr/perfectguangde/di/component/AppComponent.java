package com.lxr.perfectguangde.di.component;

import com.lxr.perfectguangde.app.App;
import com.lxr.perfectguangde.di.module.AppModule;
import com.lxr.perfectguangde.di.module.HttpModule;
import com.lxr.perfectguangde.model.DataManager;
import com.lxr.perfectguangde.model.db.RealmHelper;
import com.lxr.perfectguangde.model.http.RetrofitHelper;
import com.lxr.perfectguangde.model.sp.SpHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Admin on 2017/4/24  13:33
 *
 * @desc
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
    App getContext();  // 提供App的Context

    DataManager getDataManager();//数据


    RetrofitHelper getRetrofitHelper();//拿到retrofit


    RealmHelper getRealmHelper();

    SpHelper getSpHelper();

}

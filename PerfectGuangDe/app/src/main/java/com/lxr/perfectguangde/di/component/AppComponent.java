package com.lxr.perfectguangde.di.component;

import com.lxr.perfectguangde.app.App;
import com.lxr.perfectguangde.di.module.AppModule;
import com.lxr.perfectguangde.di.module.HttpModule;
import com.lxr.perfectguangde.model.DataManager;

import dagger.Component;

/**
 * Created by Admin on 2017/4/24  13:33
 *
 * @desc
 */

@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
    App getContext();  // 提供App的Context

    DataManager getDataManager();//数据


}

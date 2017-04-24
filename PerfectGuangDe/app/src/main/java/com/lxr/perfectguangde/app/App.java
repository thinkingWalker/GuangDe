package com.lxr.perfectguangde.app;

import android.app.Application;

import com.lxr.perfectguangde.di.component.AppComponent;
import com.lxr.perfectguangde.di.component.DaggerAppComponent;
import com.lxr.perfectguangde.di.module.AppModule;
import com.lxr.perfectguangde.di.module.HttpModule;

/**
 * Created by Admin on 2017/4/24  13:32
 *
 * @desc
 */

public class App extends Application {

    private static App instance;

    public static synchronized App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

    }

    public static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        if (appComponent == null) {
            return DaggerAppComponent.builder().appModule(new AppModule(instance)).
                    httpModule(new HttpModule())
                    .build();
        }
        return appComponent;
    }

}

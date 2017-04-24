package com.lxr.perfectguangde.app;

import android.app.Application;

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


}

package com.lxr.perfectguangde.di.component;

import com.lxr.perfectguangde.di.module.ActivityModule;
import com.lxr.perfectguangde.di.scope.ActivityScope;
import com.lxr.perfectguangde.ui.activity.WelcomeActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/4/24 0024.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {


    void inject(WelcomeActivity welcomeActivity);
}

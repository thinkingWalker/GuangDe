package com.lxr.perfectguangde.di.component;

import com.lxr.perfectguangde.di.module.FragmentModule;
import com.lxr.perfectguangde.di.scope.FragmentScope;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/4/24 0024.
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    
    
}

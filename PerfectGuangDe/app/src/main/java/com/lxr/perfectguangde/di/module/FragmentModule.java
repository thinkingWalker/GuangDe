package com.lxr.perfectguangde.di.module;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/4/24 0024.
 */


@Module
public class FragmentModule {

    private Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    FragmentActivity provideActivity() {
        return fragment.getActivity();
    }
}

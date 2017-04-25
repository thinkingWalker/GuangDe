package com.lxr.perfectguangde.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import com.lxr.perfectguangde.app.App;
import com.lxr.perfectguangde.di.component.DaggerFragmentComponent;
import com.lxr.perfectguangde.di.component.FragmentComponent;
import com.lxr.perfectguangde.di.module.FragmentModule;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by Administrator on 2017/4/24 0024.
 */

public abstract class BaseFragment<T extends BasePresenter> extends SimpleFragment implements BaseView {

    @Inject
    protected T mPresenter;

    protected FragmentComponent getFragmentComponent() {
        return DaggerFragmentComponent.builder()
                .appComponent(App.getAppComponent())
                .fragmentModule(getFragmentModule())
                .build();
    }

    protected FragmentModule getFragmentModule() {
        return new FragmentModule(this);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initInject();
        mPresenter.attachView(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        if (mPresenter != null) mPresenter.detachView();
        super.onDestroyView();
    }



    protected abstract void initInject();

}

package com.lxr.perfectguangde.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.lxr.perfectguangde.app.AppManager;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by Admin on 2017/4/24  13:29
 * 不使用 mvp的activity基类
 *
 * @desc
 */

public abstract class SimpleActivity extends SupportActivity {


    private Unbinder mUnBinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        mUnBinder = ButterKnife.bind(this);
        onViewCreated();
        AppManager.getAppManager().addActivity(this);
        configView();
        initData();
    }

    protected void onViewCreated() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getAppManager().finishActivity(this);
        mUnBinder.unbind();
    }

    protected abstract void initData();

    protected abstract void configView();

    protected abstract int getLayoutId();

}

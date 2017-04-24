package com.lxr.perfectguangde.base;

import javax.inject.Inject;

/**
 * Created by Admin on 2017/4/24  13:28
 *
 * @desc
 */

public abstract class BaseActvity<T extends BasePresenter> extends SimpleActivity {

    @Inject
    protected T mPresenter;


    @Override
    protected void onViewCreated() {

    }
}

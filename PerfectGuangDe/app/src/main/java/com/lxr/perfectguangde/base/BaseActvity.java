package com.lxr.perfectguangde.base;

import javax.inject.Inject;

/**
 * Created by Admin on 2017/4/24  13:28
 *
 * @desc
 */

public abstract class BaseActvity<T extends BasePresenter> extends SimpleActivity implements BaseView{

    @Inject
    protected T mPresenter;

    
    
    @Override
    protected void onViewCreated() {
        
        initInject();
        
        if (mPresenter!=null)
            mPresenter.attachView(this);
        
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null)
            mPresenter.detachView();
    }

    protected abstract void initInject();
}

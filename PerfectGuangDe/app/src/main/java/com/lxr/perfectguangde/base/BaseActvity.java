package com.lxr.perfectguangde.base;

import com.lxr.perfectguangde.app.App;
import com.lxr.perfectguangde.di.component.ActivityComponent;
import com.lxr.perfectguangde.di.component.DaggerActivityComponent;
import com.lxr.perfectguangde.di.module.ActivityModule;

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

    protected ActivityComponent getActivityComponent(){
        return DaggerActivityComponent.builder().activityModule(new ActivityModule(this))
                .appComponent(App.getAppComponent())
                .build();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null)
            mPresenter.detachView();
    }

    protected abstract void initInject();
}

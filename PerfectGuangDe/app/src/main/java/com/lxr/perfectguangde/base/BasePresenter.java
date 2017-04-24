package com.lxr.perfectguangde.base;

/**
 * Created by Admin on 2017/4/24  13:24
 *
 * @desc
 */

public interface BasePresenter<T extends BaseView>  {

    void attachView(T view);

    void detachView();

}

package com.lxr.perfectguangde.base;

/**
 * Created by Admin on 2017/4/24  13:26
 *
 * @desc
 */

public interface BaseContract {

    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter<View> {

    }
}

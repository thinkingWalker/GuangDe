package com.lxr.perfectguangde.ui.presenter.contract;

import com.lxr.perfectguangde.base.BasePresenter;
import com.lxr.perfectguangde.base.BaseView;


/**
 * Created by Admin on 2017/4/25  17:04
 *
 * @desc
 */

public interface WelcomeContract {

    interface View extends BaseView {
        void showContent();

        void jumpToMain();
    }

    interface Presenter extends BasePresenter<View> {

    }
}

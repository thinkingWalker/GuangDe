package com.lxr.perfectguangde.ui.presenter;

import com.lxr.perfectguangde.base.RxPresenter;
import com.lxr.perfectguangde.ui.presenter.contract.WelcomeContract;
import com.lxr.perfectguangde.utils.CommonSubscriber;
import com.lxr.perfectguangde.utils.RxUtils;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * Created by Admin on 2017/4/25  17:04
 *
 * @desc
 */

public class WelcomePresenter extends RxPresenter<WelcomeContract.View> implements WelcomeContract.Presenter {


    private static final int COUNT_DOWN_TIME = 2200;

    @Inject
    public WelcomePresenter() {
        getWelcomeData();
    }

    private void getWelcomeData() {
        mView.showContent();
        startCountDown();
    }

    private void startCountDown() {
        Flowable.timer(COUNT_DOWN_TIME, TimeUnit.SECONDS)
                .compose(RxUtils.<Long>rxSchedulerHelper())
                .subscribe(new CommonSubscriber<Long>(mView) {
                    @Override
                    public void onNext(Long aLong) {
                        mView.jumpToMain();
                    }
                });

    }


}

package com.lxr.perfectguangde.ui.activity;

import android.content.Intent;
import android.widget.ImageView;

import com.lxr.perfectguangde.R;
import com.lxr.perfectguangde.base.BaseActvity;
import com.lxr.perfectguangde.di.component.DaggerActivityComponent;
import com.lxr.perfectguangde.ui.MainActivity;
import com.lxr.perfectguangde.ui.presenter.WelcomePresenter;
import com.lxr.perfectguangde.ui.presenter.contract.WelcomeContract;

import butterknife.BindView;

/**
 * Created by Admin on 2017/4/25  16:53
 *
 * @desc
 */

public class WelcomeActivity extends BaseActvity<WelcomePresenter> implements WelcomeContract.View {

    @BindView(R.id.iv_welcome)
    ImageView imageView;

    @Override
    protected void initData() {

    }

    @Override
    protected void configView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }


    @Override
    public void showErrorMsg(String mErrorMsg) {

    }

    @Override
    public void stateError() {

    }

    @Override
    public void showContent() {
        imageView.animate().scaleX(1.12f).scaleY(1.12f).setDuration(2000).setStartDelay(200).start();

    }

    @Override
    public void jumpToMain() {
        startActivity(new Intent(this, MainActivity.class));
    }
}

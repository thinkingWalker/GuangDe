package com.lxr.perfectguangde.model.sp;

import android.content.Context;
import android.content.SharedPreferences;

import com.lxr.perfectguangde.app.App;

import javax.inject.Inject;

/**
 * Created by Admin on 2017/4/24  15:17
 * sp接口的实现
 * @desc
 */

public class ImplSpHelper implements SpHelper{

    private static final String SHAREDPREFERENCES_NAME = "my_sp";
    private final SharedPreferences mSPrefs;


    @Inject
    public ImplSpHelper() {
        mSPrefs = App.getInstance().getSharedPreferences(SHAREDPREFERENCES_NAME, Context.MODE_PRIVATE);
    }


}

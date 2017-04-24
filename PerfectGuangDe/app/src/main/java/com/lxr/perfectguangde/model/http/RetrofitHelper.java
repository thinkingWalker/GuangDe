package com.lxr.perfectguangde.model.http;

import com.lxr.perfectguangde.model.http.api.BmobApi;

import javax.inject.Inject;

/**
 * Created by Admin on 2017/4/24  15:22
 * httphelper的实现类
 *
 * @desc
 */

public class RetrofitHelper implements HttpHelper {


    private  BmobApi bmobApi;

    @Inject
    public RetrofitHelper(BmobApi bmobApi) {
        this.bmobApi=bmobApi;
    }
}

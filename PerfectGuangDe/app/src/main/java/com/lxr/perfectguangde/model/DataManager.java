package com.lxr.perfectguangde.model;

import com.lxr.perfectguangde.model.db.DBHelper;
import com.lxr.perfectguangde.model.http.HttpHelper;
import com.lxr.perfectguangde.model.sp.SpHelper;

/**
 * Created by Admin on 2017/4/24  15:13
 *
 * @desc
 */

public class DataManager implements HttpHelper, DBHelper, SpHelper {
    HttpHelper mHttpHelper;
    DBHelper mDbHelper;
    SpHelper mPreferencesHelper;

    public DataManager(HttpHelper httpHelper, DBHelper dbHelper, SpHelper preferencesHelper) {
        mHttpHelper = httpHelper;
        mDbHelper = dbHelper;
        mPreferencesHelper = preferencesHelper;
    }
}

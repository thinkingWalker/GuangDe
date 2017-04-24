package com.lxr.perfectguangde.model.db;

import javax.inject.Inject;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Admin on 2017/4/24  15:19
 * dbhelper的实现类
 *
 * @desc
 */

public class RealmHelper implements DBHelper {
    private static final String DB_NAME = "myRealm.realm";
    private final Realm mRealm;

    @Inject
    public RealmHelper() {
        mRealm = Realm.getInstance(new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .name(DB_NAME)
                .build());
    }
}

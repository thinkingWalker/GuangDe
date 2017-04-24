package com.lxr.perfectguangde.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Admin on 2017/4/24  15:50
 *
 * @desc
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface BmobUrl {
}

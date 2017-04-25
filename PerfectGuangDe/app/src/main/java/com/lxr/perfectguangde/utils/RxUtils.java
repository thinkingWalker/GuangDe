package com.lxr.perfectguangde.utils;

import org.reactivestreams.Publisher;

import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Admin on 2017/4/25  17:16
 *
 * @desc
 */

public class RxUtils {

    public static<T> FlowableTransformer<T,T> rxSchedulerHelper(){ //简化线程
        return new FlowableTransformer<T, T>() {
            @Override
            public Publisher<T> apply(Flowable<T> observable) {
                return observable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }



}

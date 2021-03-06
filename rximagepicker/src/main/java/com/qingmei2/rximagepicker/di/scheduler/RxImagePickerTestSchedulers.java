package com.qingmei2.rximagepicker.di.scheduler;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * An extra layer of packaging, using {@link RxImagePickerTestSchedulers} for easier testing.
 */
public class RxImagePickerTestSchedulers implements IRxImagePickerSchedulers {

    @Override
    public Scheduler ui() {
        return Schedulers.io();
    }

    @Override
    public Scheduler io() {
        return Schedulers.io();
    }
}

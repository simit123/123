package com.example.administrator.qqdemo.mvp;

/**
 * Created by dell on 2017/7/18.
 */

public interface IPresent<V> {
    void attachV(V view);

    void detachV();
}

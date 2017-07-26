package com.example.administrator.qqdemo.mvp;

/**
 * Created by dell on 2017/7/18.
 */

public abstract class RecyclerItemCallback<T, F> {
    /**
     * 单击事件
     *
     * @param position 位置
     * @param model    实体
     * @param tag      标签
     * @param holder   控件
     */
    public void onItemClick(int position, T model, int tag, F holder) {
    }

    /**
     * 长按事件
     *
     * @param position 位置
     * @param model    实体
     * @param tag      标签
     * @param holder   控件
     */
    public void onItemLongClick(int position, T model, int tag, F holder) {
    }
}
package me.jessyan.mvparms.demo.utils;

import android.app.Activity;

import com.hjq.xtoast.XToast;

import me.jessyan.mvparms.demo.R;
/**
 *@作者：陈飞
 *@说明：大Toast的显示
 *@创建日期: 2019/10/23 15:44
 */
public class Toastoy {
    //设置显示时间
    private static final int TIME = 1500;

    public static void showSucceed(Activity activity, CharSequence text) {
        new XToast(activity)
                .setDuration(TIME)
                .setView(R.layout.toast_hint)
                .setAnimStyle(android.R.style.Animation_Dialog)
                .setImageDrawable(android.R.id.icon, R.mipmap.ic_dialog_tip_finish)
                .setText(android.R.id.message, text)
                .show();
    }

    public static void showFail(Activity activity, CharSequence text) {
        new XToast(activity)
                .setDuration(TIME)
                .setView(R.layout.toast_hint)
                .setAnimStyle(android.R.style.Animation_Dialog)
                .setImageDrawable(android.R.id.icon, R.mipmap.ic_dialog_tip_error)
                .setText(android.R.id.message, text)
                .show();
    }

    public static void showWarn(Activity activity, CharSequence text) {
        new XToast(activity)
                .setDuration(TIME)
                .setView(R.layout.toast_hint)
                .setAnimStyle(android.R.style.Animation_Dialog)
                .setImageDrawable(android.R.id.icon, R.mipmap.ic_dialog_tip_warning)
                .setText(android.R.id.message, text)
                .show();
    }
}

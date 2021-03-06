package com.yang.base.widget.dialog;

import android.view.View;

/***
 * @desc dialog点击监听
 * @author yangguoq
 */

public interface OnDialogClickListener {

    /**
     * 点击回调
     * @param view 控件
     * @param isConfirm 确认点击<true确认 false取消>
     */
    void onDialogClick(boolean isConfirm, View view);

}

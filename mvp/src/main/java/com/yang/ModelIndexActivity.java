package com.yang;


import android.content.Intent;
import android.view.View;

import com.yang.base.base.BaseActivity;
import com.yang.base.util.logger.Logger;
import com.yang.mvp.R;
import com.yang.mvp.aboutus.AboutUsActivity;


public class ModelIndexActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_mvp;
    }

    @Override
    protected void findViews() {

    }
    @Override
    protected void init() {

    }

    public void mvpTest(View view){
        Logger.d("logger.d");
        Logger.e("logger.e message","args1","args2","args3");
        startActivity(new Intent(this, AboutUsActivity.class));
    }

    public void Rxjava(View view){
        startActivity(new Intent(this, RxAndroidActivity.class));
    }

    public void Retrofit(View view){
        startActivity(new Intent(this, RetrofitActivity.class));
    }
}
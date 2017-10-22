package com.wh.living.ui.activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import butterknife.ButterKnife;

/*
 * @创建者 weiho
 * @创建时间 2017/10/22 0022 1:30
 */

public abstract class BaseActivity extends FragmentActivity {


    private int mLayoutId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);

        initView();
        initData();


    }



    public abstract int getLayoutId();

    protected abstract void initView();
    protected abstract void initData();


    public void startActivity(Class clazz, boolean isFinish) {
        startActivity(new Intent(this, clazz));
        if (isFinish) {
            finish();
        }

    }

}

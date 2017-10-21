package com.wh.living.ui.activity;

import android.view.View;
import android.widget.Button;

import com.wh.living.R;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.bt_java)
    Button mBtJava;
    @BindView(R.id.bt_android)
    Button mBtAndroid;
    @BindView(R.id.bt_md)
    Button mBtMd;
    @BindView(R.id.bt_view)
    Button mBtView;
    @BindView(R.id.bt_design)
    Button mBtDesign;
    @BindView(R.id.bt_open)
    Button mBtOpen;
    @BindView(R.id.bt_plugin)
    Button mBtPlugin;
    @BindView(R.id.bt_kotlin)
    Button mBtKotlin;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.bt_java, R.id.bt_android, R.id.bt_md, R.id.bt_view, R.id.bt_design, R.id.bt_open, R.id.bt_plugin, R.id.bt_kotlin})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_java:
                break;
            case R.id.bt_android:
                break;
            case R.id.bt_md:
                break;
            case R.id.bt_view:
                break;
            case R.id.bt_design:
                break;
            case R.id.bt_open:
                startActivity(OpenActivity.class, false);
                break;
            case R.id.bt_plugin:
                break;
            case R.id.bt_kotlin:
                break;
        }
    }
}

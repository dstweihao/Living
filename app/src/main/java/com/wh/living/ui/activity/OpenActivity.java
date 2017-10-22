package com.wh.living.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wh.living.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OpenActivity extends BaseActivity {


    @BindView(R.id.bt_net)
    Button mBtNet;
    @BindView(R.id.bt_image)
    Button mBtImage;
    @BindView(R.id.bt_db)
    Button mBtDb;

    @Override
    public int getLayoutId() {
        return R.layout.activity_open;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }



}

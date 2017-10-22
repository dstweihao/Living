package com.wh.living.ui.fragment;
/*
 * @创建者 weihao
 * @创建时间 2017/10/22 0022 20:04

 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(getFragmentLayoutId(), container, false);
        return view;
    }

    protected abstract int getFragmentLayoutId();


}
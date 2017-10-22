package com.wh.living.ui.activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.wh.living.R;
import com.wh.living.bean.Tab;
import com.wh.living.ui.fragment.BookFragment;
import com.wh.living.ui.fragment.FragmentTabHost;
import com.wh.living.ui.fragment.DemoFragment;
import com.wh.living.ui.fragment.JobFragment;
import com.wh.living.ui.fragment.MineFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class MainActivity extends BaseActivity {


    private List<Tab> mTabList = new ArrayList<>();


    @BindView(R.id.realtabcontent)
    FrameLayout     mRealtabcontent;
    @BindView(android.R.id.tabhost)
    FragmentTabHost mTabhost;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void initView() {


    }

    @Override
    protected void initData() {

        initTab();

    }

    private void initTab() {

        //设置fragment容器
        mTabhost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        //将fragment和底部菜单的图片和文字存入到List集合中。
        addToList(DemoFragment.class, R.drawable.selector_icon_home, R.string.demo);
        addToList(JobFragment.class, R.drawable.selector_icon_hot, R.string.job);
        addToList(BookFragment.class, R.drawable.selector_icon_category, R.string.book);
        addToList(MineFragment.class, R.drawable.selector_icon_mine, R.string.mine);


        //新建5个Tabspec，并且设置好它的Indicator
        for (Tab tab : mTabList) {
            TabHost.TabSpec tabSpec = mTabhost.newTabSpec(getString(tab.getTitle()));
            View view = LayoutInflater.from(this).inflate(R.layout.indicator, null);
            ImageView image_tab = view.findViewById(R.id.icon_indicator);
            TextView text_tab = view.findViewById(R.id.txt_indicator);
            image_tab.setImageResource(tab.getImage());
            text_tab.setText(tab.getTitle());

            //指定一个视图作为选项卡指示器。
            tabSpec.setIndicator(view);

            //把每个TabSpec添加到FragmentTabHost里面
            mTabhost.addTab(tabSpec, tab.getFragment(), null);

        }

        //去掉分割线
        mTabhost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);

        //设置当前默认的分页为第一页
        mTabhost.setCurrentTab(0);



    }

    private void addToList(Class frament, int image, int title) {
        Tab tab = new Tab(frament,image,title);
        mTabList.add(tab);

    }

}


//        setItemName("java基础");
//        setItemName("Android基础");
//        setItemName("Martial Design控件");
//        setItemName("自定义控件");
//        setItemName("设计模式");
//        setItemName("开源框架库");
//        setItemName("第三方插件");
//        setItemName("Kotlin");











package com.wh.living.bean;
/*
 * @创建者 韦豪
 * @创建时间 2017/10/22 0022 20:21
 * @描述 ${TODO}
 
 * @更新者 韦豪
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 * 
 */

public class Tab {
    private Class fragment;
    private int image;
    private int title;

    public Class getFragment() {
        return fragment;
    }

    public void setFragment(Class fragment) {
        this.fragment = fragment;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public Tab(Class fragment, int image, int title) {
        this.fragment = fragment;
        this.image = image;
        this.title = title;
    }
}

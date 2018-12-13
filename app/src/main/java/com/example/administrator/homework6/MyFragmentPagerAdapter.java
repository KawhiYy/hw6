package com.example.administrator.homework6;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> list;
    String[] s;

    public MyFragmentPagerAdapter(FragmentManager fm,List list,String[] s) {
        super(fm);
        this.list = list;
        this.s = s;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return s[position];

    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }
    @Override
    public int getCount() {
        return list.size();
    }
}

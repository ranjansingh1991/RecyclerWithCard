package com.semicolonindia.recyclerwithcard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RANJAN SINGH on 8/29/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    // 1. this code apply to fragment
    private final List<Fragment> mFragmentList = new ArrayList<>();
    // 2. applying for title of fragment
    private final List<String> mFragmentTitleList = new ArrayList<>();

    // String[] title = new String[]{"First", "Second", "Third"};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {

        return mFragmentList.size();
    }
    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
        // return title[position];
    }

}

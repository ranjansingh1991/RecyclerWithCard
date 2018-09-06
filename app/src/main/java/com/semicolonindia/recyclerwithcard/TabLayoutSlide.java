package com.semicolonindia.recyclerwithcard;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TabLayoutSlide extends AppCompatActivity {
    TabLayout tabLayout;
    //This is our viewPager
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout_slide);
        // Initializing Tab
        tabLayout = (TabLayout) findViewById(R.id.tabs);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1(), "First");
        adapter.addFragment(new Tab2(), "Second");
        adapter.addFragment(new Tab3(), "Third");
        viewPager.setAdapter(adapter);
    }
}
package com.example.administrator.homework6;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tb;
    static int position=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.vp);
        tb = (TabLayout)findViewById(R.id.tb);
        initViewPager();
    }
    private void initViewPager(){

        List<Fragment> fragments = new ArrayList<>();
        List<Bundle> list = new ArrayList<>();
       for(int j=0;j<8;j++){
           Bundle bundle = new Bundle();
           bundle.putInt("fruit",R.drawable.apple);
           bundle.putString("sg","我是苹果");
           bundle.putInt("position",j*4);
           list.add(bundle);

           Bundle bundle1 = new Bundle();
           bundle1.putInt("fruit",R.drawable.orange);
           bundle1.putString("sg","我是橘子");
           bundle1.putInt("position",j*4+1);
           list.add(bundle1);

           Bundle bundle2 = new Bundle();
           bundle2.putInt("fruit",R.drawable.banana);
           bundle2.putString("sg","我是香蕉");
           bundle2.putInt("position",j*4+2);
           list.add(bundle2);

           Bundle bundle3 = new Bundle();
           bundle3.putInt("fruit",R.drawable.pear);
           bundle3.putString("sg","我是梨子");
           bundle3.putInt("position",j*4+3);
           list.add(bundle3);
       }
        String Title[] = new String[30];
        for(int i = 0;i<30;i++){
            Title[i] = "TAB" + (i + 1);
            MyFragment mf = new MyFragment();
            Bundle bd = list.get(i);

            mf.setArguments(bd);
            fragments.add(mf);
        }


        MyFragmentPagerAdapter mfpa = new MyFragmentPagerAdapter(getSupportFragmentManager()
        ,fragments,Title);
        viewPager.setAdapter(mfpa);
        tb.setupWithViewPager(viewPager);

    }

}

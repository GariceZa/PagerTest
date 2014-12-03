package android.handyapps.gareth.pagertest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.astuetz.PagerSlidingTabStrip;


public class MainActivity extends FragmentActivity {

    private PagerSlidingTabStrip tabs;
    private ViewPager pager;
    private MyPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new MyPagerAdapter(getSupportFragmentManager());

        pager.setAdapter(adapter);
        tabs.setViewPager(pager);

    }

    public class MyPagerAdapter extends FragmentPagerAdapter {

        private final String[] TITLES = { "Page1", "Page 2", "Page 3", "Page 4", "Page 5", "Page 6"};

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }

        @Override
        public int getCount() {
            return TITLES.length;
        }

        @Override
        public Fragment getItem(int position) {

            switch(position){
                case 0 :
                    return new Page1();
                case 1 :
                    return new Page2();
                case 2 :
                    return new Page3();
                case 3 :
                    return new Page4();
                case 4 :
                    return new Page5();
                case 5 :
                    return new Page6();
            }

            return null;
        }

    }

}

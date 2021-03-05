package com.supertrident.launcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private VerticalViewPager viewPager;
    private androidx.viewpager.widget.PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // loadFragment(new HomeScreen());

        List<Fragment> list = new ArrayList<>();
        list.add(new HomeScreen());
        list.add(new AppDrawer());

        viewPager = findViewById(R.id.myviewpager);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(pagerAdapter);

    }

//    private boolean loadFragment(Fragment fragment) {
//        if (fragment != null) {
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .replace(R.id.container, fragment)
//                    .commit();
//            return true;
//        }
//        return false;
//    }
//    @Override
//    public void onBackPressed() {
//        //super.onBackPressed();
//        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeScreen()).commit();
//
//    }
}
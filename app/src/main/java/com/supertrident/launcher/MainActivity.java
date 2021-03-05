package com.supertrident.launcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // loadFragment(new HomeScreen());

        viewPager = findViewById(R.id.myviewpager);
        PagerAdapter myadapter = new PagerAdapter(getSupportFragmentManager());
        

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
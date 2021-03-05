package com.supertrident.launcher;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class PagerAdapter extends FragmentStatePagerAdapter {


    private List<Fragment> fragmentList;
    public PagerAdapter(FragmentManager fm, List<Fragment> fragmentList){
        super(fm);
        this.fragmentList = fragmentList;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
//        switch (position){
//            case 0:
//                return new HomeScreen();
//            case 1:
//                return new AppDrawer();
//            default:
//                return new HomeScreen();
//        }

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}

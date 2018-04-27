package com.nqt.linhtinh.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.nqt.linhtinh.fragment.AndroidFragment;
import com.nqt.linhtinh.fragment.IOSFragment;
import com.nqt.linhtinh.fragment.PHPFragment;

/**
 * Created by USER on 4/23/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 1:
                fragment = new AndroidFragment();
                break;
            case 0:
                fragment = new IOSFragment();
                break;
            case 2:
                fragment = new PHPFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 1:
                title = "Android";
                break;
            case 0:
                title = "IOS";
                break;
            case 2:
                title = "PHP";
                break;
        }
        return title;
    }
}

package com.nqt.linhtinh.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nqt.linhtinh.R;

/**
 * Created by USER on 4/23/2018.
 */

public class AndroidFragment extends Fragment {
    public AndroidFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }
}

package com.nqt.linhtinh.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nqt.linhtinh.R;
import com.nqt.linhtinh.adapter.IOSAdapter;
import com.nqt.linhtinh.model.IOS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 4/23/2018.
 */

public class IOSFragment extends Fragment {
    private static final String TAG = "IOSFragment";
    private RecyclerView recyclerIOS;
    private IOSAdapter iosAdapter;
    private List<IOS> ioes;
    private RecyclerView.LayoutManager mLayoutManager;

    public IOSFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeComponents();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ios, container, false);
        rootView.setTag(TAG);

        recyclerIOS = rootView.findViewById(R.id.rcv_ios);

        mLayoutManager = new LinearLayoutManager(getContext());

        iosAdapter = new IOSAdapter(getContext(), ioes);

        recyclerIOS.setAdapter(iosAdapter);

        recyclerIOS.setLayoutManager(mLayoutManager);

        return rootView;
    }

    private void initializeComponents() {
        ioes = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            IOS ios = new IOS();
            ios.setTitle("Title " + i);
            ios.setTitlePic("Pic " + i);
            ios.setAvatar("http://abc.com");
            ioes.add(ios);
        }
    }
}

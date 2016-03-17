package com.samset.bottombar.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.samset.bottombar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    TextView textView;
    View view;

    static HomeFragment fragment=new HomeFragment();
    public static HomeFragment getInstance()
    {
        return fragment;
    }
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_home, container, false);
        textView= (TextView) view.findViewById(R.id.home);
        return view;
    }

}

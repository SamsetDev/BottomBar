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
public class AndroidFragment extends Fragment {

    TextView textView;
    View view;

    static AndroidFragment fragment=new AndroidFragment();
    public static AndroidFragment getInstance()
    {
        return fragment;
    }
    public AndroidFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_android, container, false);
        textView= (TextView) view.findViewById(R.id.android);
        return view;
    }

}

package com.example.renhaojie.yora.fragments;

import android.app.Fragment;
import android.os.Bundle;

import com.example.renhaojie.yora.infrastructure.YoraApplication;

/**
 * Created by Ren Haojie on 2016/10/30.
 */

public abstract class BaseFragment extends Fragment {
    protected YoraApplication application;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application=(YoraApplication)getActivity().getApplication();
    }
}

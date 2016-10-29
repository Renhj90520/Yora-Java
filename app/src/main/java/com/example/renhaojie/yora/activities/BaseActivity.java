package com.example.renhaojie.yora.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.example.renhaojie.yora.infrastructure.YoraApplication;

/**
 * Created by Ren Haojie on 2016/10/28.
 */

public class BaseActivity extends AppCompatActivity {
    protected YoraApplication application;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        application=(YoraApplication)getApplication();
    }
}

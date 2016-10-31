package com.example.renhaojie.yora.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import com.example.renhaojie.yora.R;

/**
 * Created by Ren Haojie on 2016/10/28.
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener {
    private View btnLogin;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.activity_login);
        btnLogin=findViewById(R.id.activity_login_login);
        if(btnLogin!=null){

            btnLogin.setOnClickListener(this);
        }
    }
    @Override
    public void onClick(View view) {
        if(view==btnLogin){
            startActivity(new Intent(this,LoginNarrowActivity.class));
        }
    }
}

package com.example.renhaojie.yora.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * Created by Ren Haojie on 2016/10/28.
 */

public abstract class BaseAuthenticatedActivity extends BaseActivity {
    @Override
    public final void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        if (!application.getAuth().getUser().isLoggedin()) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }

        onYoraCreate( savedInstanceState, persistentState);
    }

    protected abstract void onYoraCreate(Bundle savedInstanceState, PersistableBundle persistentState);

}

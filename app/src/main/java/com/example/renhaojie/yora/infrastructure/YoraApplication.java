package com.example.renhaojie.yora.infrastructure;

import android.app.Application;

/**
 * Created by Ren Haojie on 2016/10/28.
 */

public class YoraApplication extends Application {
    private Auth auth;

    public Auth getAuth() {
        return auth;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        auth=new Auth(this);
    }
}

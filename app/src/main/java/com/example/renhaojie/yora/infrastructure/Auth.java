package com.example.renhaojie.yora.infrastructure;

import android.content.Context;

/**
 * Created by Ren Haojie on 2016/10/28.
 */

public class Auth {
    private final Context context;

    private User user;

    public Auth(Context context) {
        this.context = context;
        user=new User();
    }

    public User getUser() {
        return user;
    }

}

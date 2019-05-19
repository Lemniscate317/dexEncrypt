package com.l.origin;

import android.app.Application;
import android.util.Log;

/**
 * Created by Lemniscate on 2019/5/17.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("origin", "origin application oncreate");
    }
}

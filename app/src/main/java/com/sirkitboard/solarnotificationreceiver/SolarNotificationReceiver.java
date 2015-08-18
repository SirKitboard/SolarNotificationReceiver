package com.sirkitboard.solarnotificationreceiver;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Adi on 6/29/15.
 */
public class SolarNotificationReceiver extends Application {
    @Override
    public void onCreate() {
        Parse.initialize(this, getResources().getString(R.string.ApplicationKey), getResources().getString(R.string.ClientKey));
    }
}

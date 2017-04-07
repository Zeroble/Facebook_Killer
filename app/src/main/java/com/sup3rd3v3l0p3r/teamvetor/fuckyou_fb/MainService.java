package com.sup3rd3v3l0p3r.teamvetor.fuckyou_fb;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MainService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
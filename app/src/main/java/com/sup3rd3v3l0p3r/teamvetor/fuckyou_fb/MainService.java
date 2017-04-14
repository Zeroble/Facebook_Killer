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
        new Thread(task).start();
        return super.onStartCommand(intent, flags, startId);
    }
    Runnable task = new Runnable() {
        @Override
        public void run() {

        }
    };
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
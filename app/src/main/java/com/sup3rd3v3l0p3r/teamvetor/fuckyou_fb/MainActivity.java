package com.sup3rd3v3l0p3r.teamvetor.fuckyou_fb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends SetTime {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadSetDay(); //날자 저장정보를 불러옴
        loadSetTime();
        Intent Service = new Intent(this, MainService.class);
        startService(Service);
    }

    //    public void startService(View v){
//        EditText editText = (EditText) findViewById(R.id.editText);
//        Intent Service = new Intent(this, MainService.class);
//        Service.putExtra("FilePath", editText.getText().toString());
//        startService(Service);
//    }
    public void stopService(View v) {
        Intent Service = new Intent(this, MainService.class);
        stopService(Service);
    }
}


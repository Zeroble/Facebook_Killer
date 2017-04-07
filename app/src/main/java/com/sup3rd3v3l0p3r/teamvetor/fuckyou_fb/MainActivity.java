package com.sup3rd3v3l0p3r.teamvetor.fuckyou_fb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent Service = new Intent(this, MainService.class);
        startService(Service);
    }
//    public void startService(View v){
//        EditText editText = (EditText) findViewById(R.id.editText);
//        Intent Service = new Intent(this, MainService.class);
//        Service.putExtra("FilePath", editText.getText().toString());
//        startService(Service);
//    }
    public void stopService(View v){
        Intent Service = new Intent(this, MainService.class);
        stopService(Service);
    }
}


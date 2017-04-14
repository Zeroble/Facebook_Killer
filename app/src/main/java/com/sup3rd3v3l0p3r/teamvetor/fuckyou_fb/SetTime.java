package com.sup3rd3v3l0p3r.teamvetor.fuckyou_fb;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SetTime extends SetDay {
    public void OK(View v) {
        SharedPreferences daySetting = getSharedPreferences("daySetting", MODE_PRIVATE);
        SharedPreferences.Editor editor = daySetting.edit();

        EditText SetHour = (EditText) findViewById(R.id.hour);
        EditText SetMinute = (EditText) findViewById(R.id.minute);

        if (SetHour.getText().toString().equals("") || SetMinute.getText().toString().equals("")) {
            SetTimeColor();
            Toast.makeText(getApplicationContext(), "입력하지 않은 값이 있습니다.", Toast.LENGTH_SHORT).show();
        } else if (Integer.parseInt(SetHour.getText().toString()) > 23 || Integer.parseInt(SetMinute.getText().toString()) > 59) {
            SetTimeColor();
            editor.putInt("SetHour", Integer.parseInt(SetHour.getText().toString()));
            editor.putInt("SetMinute", Integer.parseInt(SetMinute.getText().toString()));
            editor.commit();
        } else {
            SetTimeColor();
            editor.putInt("SetHour", Integer.parseInt(SetHour.getText().toString()));
            editor.putInt("SetMinute", Integer.parseInt(SetMinute.getText().toString()));
            editor.commit();
            Toast.makeText(getApplicationContext(), "저장되었습니다", Toast.LENGTH_SHORT).show();
        }
    }

    public void loadSetTime() {
        SharedPreferences daySetting = getSharedPreferences("daySetting", MODE_PRIVATE);

        EditText SetHour = (EditText) findViewById(R.id.hour);
        EditText SetMinute = (EditText) findViewById(R.id.minute);
        SetHour.setText("" + daySetting.getInt("SetHour", 0));
        SetMinute.setText("" + daySetting.getInt("SetMinute", 0));
        Log.i("TAG", "" + daySetting.getInt("SetHour", 0));
        SetTimeColor();
    }

    public void SetTimeColor() {
        EditText SetHour = (EditText) findViewById(R.id.hour);
        EditText SetMinute = (EditText) findViewById(R.id.minute);
        if (SetHour.getText().toString().equals("") || SetMinute.getText().toString().equals("")) {
            if (SetHour.getText().toString().equals("")) ;//SetHour이 비었을 경우
            else if(Integer.parseInt(SetHour.getText().toString()) < 24)//비지 않고 안맞는경우
                SetHour.setTextColor(Color.BLACK);
            else//비지 않고 맞는 경우
                SetHour.setTextColor(Color.RED);

            if (SetMinute.getText().toString().equals("")) ;
            else if(Integer.parseInt(SetMinute.getText().toString()) < 24)//비지 않고 안맞는경우
                SetMinute.setTextColor(Color.BLACK);
            else//비지 않고 맞는 경우
                SetMinute.setTextColor(Color.RED);

        } else {
            if (Integer.parseInt(SetHour.getText().toString()) > 24 || Integer.parseInt(SetMinute.getText().toString()) < 60) {
                if (Integer.parseInt(SetHour.getText().toString()) < 24)
                    SetHour.setTextColor(Color.BLACK);
                if (Integer.parseInt(SetMinute.getText().toString()) < 60)
                    SetMinute.setTextColor(Color.BLACK);
            }
            if ((Integer.parseInt(SetHour.getText().toString()) > 23) || (Integer.parseInt(SetMinute.getText().toString()) > 59)) {
                Toast.makeText(getApplicationContext(), "시간은 23시간, 분은 59분 이하로 설정하여 주세요.", Toast.LENGTH_SHORT).show();
                if (Integer.parseInt(SetHour.getText().toString()) > 23)
                    SetHour.setTextColor(Color.RED);
                if (Integer.parseInt(SetMinute.getText().toString()) > 59)
                    SetMinute.setTextColor(Color.RED);
            }
        }
    }
}

package com.sup3rd3v3l0p3r.teamvetor.fuckyou_fb;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class SetDay extends AppCompatActivity{
    int checkCheck = 0;
    public void loadSetDay(){
        SharedPreferences daySetting = getSharedPreferences("daySetting", MODE_PRIVATE);
        for(int i = 0 ; i<7;i++){
            switch (i){
                case 0:
                    if(daySetting.getInt("mon", -1) == 1)
                        mon();
                    break;
                case 1:
                    if(daySetting.getInt("tue", -1) == 1)
                        tue();
                    break;
                case 2:
                    if(daySetting.getInt("wed", -1) == 1)
                       wed();
                    break;
                case 3:
                    if(daySetting.getInt("thu", -1) == 1)
                        thu();
                    break;
                case 4:
                    if(daySetting.getInt("fri", -1) == 1)
                        fri();
                    break;
                case 5:
                    if(daySetting.getInt("sat", -1) == 1)
                        sat();
                    break;
                case 6:
                    if(daySetting.getInt("sun", -1) == 1)
                        sun();
                    break;
            }
        }
    }

    public void mon (View v){
        checkCheck = 1;
        mon();
    }
    public void tue (View v) {
        checkCheck = 1;
        tue();
    }
    public void wed (View v){
        checkCheck = 1;
        wed();
    }
    public void thu (View v){
        checkCheck = 1;
        thu();
    }

    public void fri (View v){
        checkCheck = 1;
        fri();
    }

    public void sat (View v){
        checkCheck = 1;
        sat();
    }

    public void sun (View v){
        checkCheck = 1;
        sun();
    }
    public void mon(){
        SharedPreferences daySetting = getSharedPreferences("daySetting", MODE_PRIVATE);
        SharedPreferences.Editor editor = daySetting.edit();
        CheckBox mon = (CheckBox) findViewById(R.id.mon);
        if(checkCheck == 0)
            mon.setChecked(true);
        if(mon.isChecked()){
            mon.setTextColor(Color.WHITE);
            editor.putInt("mon",1);
            editor.commit();
        }
        else {
            mon.setTextColor(Color.BLACK);
            editor.putInt("mon",0);
            editor.commit();
        }
        checkCheck = 0;
    }
    public void tue(){
        SharedPreferences daySetting = getSharedPreferences("daySetting", MODE_PRIVATE);
        SharedPreferences.Editor editor = daySetting.edit();
        CheckBox tue = (CheckBox) findViewById(R.id.tue);
        if(checkCheck == 0)
            tue.setChecked(true);
        if(tue.isChecked()){
            tue.setTextColor(Color.WHITE);
            editor.putInt("tue",1);
            editor.commit();
        }
        else {
            tue.setTextColor(Color.BLACK);
            editor.putInt("tue",0);
            editor.commit();
        }
        checkCheck = 0;
    }
    public void wed(){
        SharedPreferences daySetting = getSharedPreferences("daySetting", MODE_PRIVATE);
        SharedPreferences.Editor editor = daySetting.edit();
        CheckBox wed = (CheckBox) findViewById(R.id.wed);
        if(checkCheck == 0)
            wed.setChecked(true);
        if(wed.isChecked()){
            wed.setTextColor(Color.WHITE);
            editor.putInt("wed",1);
            editor.commit();
        }
        else {
            wed.setTextColor(Color.BLACK);
            editor.putInt("wed",0);
            editor.commit();
        }
        checkCheck = 0;
    }
    public void thu(){
        SharedPreferences daySetting = getSharedPreferences("daySetting", MODE_PRIVATE);
        SharedPreferences.Editor editor = daySetting.edit();
        CheckBox thu = (CheckBox) findViewById(R.id.thu);
        if(checkCheck == 0)
            thu.setChecked(true);
        if(thu.isChecked()){
            thu.setTextColor(Color.WHITE);
            editor.putInt("thu",1);
            editor.commit();
        }
        else {
            thu.setTextColor(Color.BLACK);
            editor.putInt("thu",0);
            editor.commit();
        }
        checkCheck = 0;
    }
    public void fri(){
        SharedPreferences daySetting = getSharedPreferences("daySetting", MODE_PRIVATE);
        SharedPreferences.Editor editor = daySetting.edit();
        CheckBox fri = (CheckBox) findViewById(R.id.fri);
        if(checkCheck == 0)
            fri.setChecked(true);
        if(fri.isChecked()){
            fri.setTextColor(Color.WHITE);
            editor.putInt("fri",1);
            editor.commit();
        }
        else {
            fri.setTextColor(Color.BLACK);
            editor.putInt("fri",0);
            editor.commit();
        }
        checkCheck = 0;
    }
    public void sat(){
        SharedPreferences daySetting = getSharedPreferences("daySetting", MODE_PRIVATE);
        SharedPreferences.Editor editor = daySetting.edit();
        CheckBox sat = (CheckBox) findViewById(R.id.sat);
        if(checkCheck == 0)
            sat.setChecked(true);
        if(sat.isChecked()){
            sat.setTextColor(Color.WHITE);
            editor.putInt("sat",1);
            editor.commit();
        }
        else {
            sat.setTextColor(Color.BLACK);
            editor.putInt("sat",0);
            editor.commit();
        }
        checkCheck = 0;
    }
    public void sun(){
        SharedPreferences daySetting = getSharedPreferences("daySetting", MODE_PRIVATE);
        SharedPreferences.Editor editor = daySetting.edit();
        CheckBox sun = (CheckBox) findViewById(R.id.sun);
        if(checkCheck == 0)
            sun.setChecked(true);
        if(sun.isChecked()){
            sun.setTextColor(Color.WHITE);
            editor.putInt("sun",1);
            editor.commit();
        }
        else {
            sun.setTextColor(Color.BLACK);
            editor.putInt("sun",0);
            editor.commit();
        }
        checkCheck = 0;
    }
}
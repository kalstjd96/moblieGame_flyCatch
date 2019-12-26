package com.example.admin.sss7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by Admin on 2018-05-15.
 */

public class SplashActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        try {
            Thread.sleep(2000);  //대기초 설정
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent( getApplicationContext(), WarningActivity.class));
        finish();
    }
}

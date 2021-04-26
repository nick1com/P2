package com.example.thisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
public Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
 /*   public void launchSettings(View v) {
        //Launch new activity

        Intent i = new Intent(this,SettingsActivity.class);
        startActivity(i);
    } */

    public void focusNow(View v) {

        Intent i = new Intent(this,FocusNow.class);
        startActivity(i);

    }
    public void planFocus(View v) {

        Intent i = new Intent(this,PlanFocus.class);
        startActivity(i);
    }
    public void returnHome(View v) {

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
package com.example.thisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FocusNow extends AppCompatActivity {

    private TextView countdownText;
    private Button countdownButton;


    private CountDownTimer countdownTimer;
    private long timeLeftInMilliSeconds = 60000; // 10 min
    private boolean timeRunning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus_now);


        countdownText = findViewById(R.id.countdownText);
        countdownButton = findViewById(R.id.countdownButton);

         countdownButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startStop();

             }
         });
        updateTimer();

    }
    public void startStop() {
        if(timeRunning){
            stopTimer();
        } else {
            startTimer();
        }


    }
    public void startTimer() {
        countdownTimer = new CountDownTimer(timeLeftInMilliSeconds, 1000) {
            @Override
            public void onTick(long l) {
                timeLeftInMilliSeconds = l;
                updateTimer();

            }

            @Override
            public void onFinish() {

            }
        }.start();

        countdownButton.setText("Pause");
        timeRunning = true;

    }
    public void stopTimer() {
        countdownTimer.cancel();
        countdownButton.setText("Start");
        timeRunning = false;
    }
    public void updateTimer() {
        int minutes = (int) timeLeftInMilliSeconds/6000;
        int seconds = (int) timeLeftInMilliSeconds % 60000/1000;
        String timeLeftText;
        timeLeftText = "" + minutes;
        timeLeftText += ":";

        if(seconds<10) timeLeftText += "0";
        timeLeftText += seconds;
        countdownText.setText(timeLeftText);
    }

    public void returnHome(View v) {

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
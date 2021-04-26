package com.example.pointcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TextView points;
    private Button minus;
    private Button plus;
    private Button reset;
    private int counter = 10;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.minus:
                  minusCounter();
                  break;
                case R.id.plus:
                  plusCounter();
                  break;
                case R.id.reset:
                    initCounter();
                    break;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        points = (TextView) findViewById(R.id.points);
        minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(clickListener);
        plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(clickListener);
        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(clickListener);

        //points.setText(50);
        initCounter();
    }

    private void initCounter() {
        counter = 10;
        points.setText(Integer.toString(counter));

    }

    private void plusCounter() {
        counter++;
            points.setText(Integer.toString(counter));
        if(counter > 15) {
            points.setText(Integer.toString(counter = 10));
        }
    }

    private void minusCounter() {
        if(counter > 10) {
            counter--;
            points.setText(Integer.toString(counter));
        }
    }

    /*void giveAchievements(int counter) {
        if (counter == 10) {
            int xp = getXp();
            xp += 500;
            saveXp(xp);
            if(getApiClient().isConnected()) {
                Games.Achievements.unlock(getApiClient(), getString(R.string.achievement_first_10_clicks));
                Games.Leaderboards.submitScoreImmediate(getApiClient(), "CgkI-  eXOwZsFEAIQBg", counter);
            }
        }
    }

    private int getXp() {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        return sharedPref.getInt("xp", 0);
    }

    private void saveXp(int xp) {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("xp", xp);
        editor.apply();
    }*/
}
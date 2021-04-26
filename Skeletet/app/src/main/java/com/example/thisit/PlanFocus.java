package com.example.thisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlanFocus extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_focus);
    }
    public void returnHome(View v) {

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void createNewTask(View v) {

        Intent i = new Intent(this,CreateNewTask.class);
        startActivity(i);

    }
}
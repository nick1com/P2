package com.example.thisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateNewTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_task);
    }

    public void returnHome(View v) {

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
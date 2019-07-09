package com.example.androidhomework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    public void submitClick(View view) {
        EditText stuid = findViewById(R.id.stuidedit);
        String stuidText = stuid.getText().toString();
        EditText pwd = findViewById(R.id.passedit);
        String pwdText = pwd.getText().toString();
        if (stuidText.length() != 10) {
            Toast.makeText(MainActivity.this, "Invalid Student ID!", Toast.LENGTH_SHORT).show();
        } else if (pwdText.length() < 6) {
            Toast.makeText(MainActivity.this, "Password too short!", Toast.LENGTH_SHORT).show();
        } else {
            setContentView(R.layout.activity_info);
            findViewById(R.id.calendar).setVisibility(View.INVISIBLE);
        }
    }

    public void dateClick(View view) {
        CalendarView cal = findViewById(R.id.calendar);
        final int vis = cal.getVisibility();
        if (vis == View.VISIBLE) {
            cal.setVisibility(View.INVISIBLE);
            //findViewById(R.id.layout4).setVisibility(View.VISIBLE);
            //findViewById(R.id.layout5).setVisibility(View.VISIBLE);
        } else {
            cal.setVisibility(View.VISIBLE);
            //findViewById(R.id.layout4).setVisibility(View.INVISIBLE);
            //findViewById(R.id.layout5).setVisibility(View.INVISIBLE);
        }
    }

    public void genderClick(View view) {
        Switch sw = findViewById(R.id.gender);
        if (sw.isChecked()) {
            ((TextView)findViewById(R.id.gendertext)).setText(R.string.fm);
        } else {
            ((TextView)findViewById(R.id.gendertext)).setText(R.string.m);
        }
    }

    public void infoSubmit(View view) {
        Toast.makeText(MainActivity.this, "Information submitted!", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}


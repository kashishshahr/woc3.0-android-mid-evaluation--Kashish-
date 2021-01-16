package com.yoking.chatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TimeTableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
        Intent intent=getIntent();
        String day=intent.getStringExtra(MainActivity.WHICHDAY);
        TextView text=findViewById(R.id.which_day);
        text.setText(day);

    }

}
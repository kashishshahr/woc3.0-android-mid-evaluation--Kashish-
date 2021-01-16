package com.yoking.chatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        Intent intent=getIntent();

        //ListView faclist=findViewById(R.id.FacultyList);
        //ArrayList<String> faculties_abbr=new ArrayList<>();
        //faculties_abbr.add("MK");
        //faculties_abbr.add("AKM");
        //faculties_abbr.add("PKS");
        //faculties_abbr.add("SB");
        //faculties_abbr.add("LS");
        //ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,faculties_abbr);
        //faclist.setAdapter(arrayAdapter);
    }
}
package com.yoking.chatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TimeTableActivity extends AppCompatActivity {

    public static Integer[] img_ids={R.drawable.mon,R.drawable.tuesday,R.drawable.wednes,R.drawable.thursday,R.drawable.friday};
public static String[] days={"monday","tuesday","wednesday","thursday","friday"};
    public int getId(int index){
        return img_ids[index];
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
        Intent intent=getIntent();
        String day=intent.getStringExtra(MainActivity.WHICHDAY);
        int index=0;
        switch (day){
            case "Monday":index=0;break;
            case "Tuesday":index=1;break;
            case "Wednesday":index=2;break;
            case "Thursday":index=3;break;
            case "Friday":index=4;break;
        }
        TextView text=findViewById(R.id.which_day);
        text.setText(day);
        ImageView img=findViewById(R.id.tt_img);
        img.setImageResource(getId(index));
    }

}
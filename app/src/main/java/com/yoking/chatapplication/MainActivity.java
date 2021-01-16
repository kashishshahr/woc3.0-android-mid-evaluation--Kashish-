package com.yoking.chatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
public static String WHICHDAY="com.yoking.chatapplication.WHICHDAY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Start
    }
    public void onDayClick(View view){
        Intent intent=new Intent(this,TimeTableActivity.class);
        Button b=(Button)view;
        TextView text=findViewById(R.id.textView2);
        String day=b.getText().toString();
        text.setText(day);
        intent.putExtra(WHICHDAY,day);
        startActivity(intent);
    }
}
package com.example.jun.calorie_counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Calendar current;
    int d,m,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);

        d = current.get(Calendar.DAY_OF_MONTH);
        m = current.get(Calendar.MONTH);
        y = current.get(Calendar.YEAR);
    }
}

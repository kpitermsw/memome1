package com.example.admin.memome1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("aaa");
        LinearLayout lLayout = new LinearLayout(this);
        lLayout.addView(text);

        //setContentView(R.layout.activity_main);
        setContentView(lLayout);
    }
}

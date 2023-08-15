package com.swadeep.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button lengthbtn;
    Button weightbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lengthbtn = findViewById(R.id.lengthbtn);
        weightbtn = findViewById(R.id.weightbtn);

        lengthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LengthActivity.class);
                startActivity(intent);
            }
        });

        weightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),WeightActivity.class);
                startActivity(intent1);
            }
        });

    }
}
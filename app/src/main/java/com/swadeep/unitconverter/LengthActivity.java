package com.swadeep.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LengthActivity extends AppCompatActivity {

    Button mchangebtn;
    Button cmchangebtn;
    TextView result;
    EditText metreET, cmET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        mchangebtn = findViewById(R.id.mChangeBTN);
        cmchangebtn = findViewById(R.id.cmChangeBTN);
        result = findViewById(R.id.lengthresultTV);
        metreET = findViewById(R.id.metreET);
        cmET = findViewById(R.id.centimetreET);

        mchangebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = metreET.getText().toString();
                double centimetre = Double.parseDouble(res);
                double cmresult = 100*centimetre;
                result.setText("The Value in CentiMetre is "+cmresult);
            }
        });

        cmchangebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res1 = cmET.getText().toString();
                double metre = Double.parseDouble(res1);
                double mresult = metre/100;
                result.setText("The value in metre is "+mresult);
            }
        });
    }
}
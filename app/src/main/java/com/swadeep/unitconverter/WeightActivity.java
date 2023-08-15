package com.swadeep.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WeightActivity extends AppCompatActivity {

    Button kgChangeBtn;
    Button gramChangeBtn;
    TextView result;
    EditText kgET,gmET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        kgChangeBtn = findViewById(R.id.kgChangeBTN);
        gramChangeBtn = findViewById(R.id.gmChangeBTN);
        result = findViewById(R.id.weightresultTV);
        kgET = findViewById(R.id.kgET);
        gmET = findViewById(R.id.gramET);

        kgChangeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = kgET.getText().toString();
                double kg = Double.parseDouble(res);
                double gmresult = 1000 * kg;
                result.setText("The Value in gram is "+gmresult);
            }
        });

        gramChangeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res1 = gmET.getText().toString();
                double gram = Double.parseDouble(res1);
                double kgresult = gram / 1000;
                result.setText("The value in KG is "+kgresult);
            }
        });

    }
}
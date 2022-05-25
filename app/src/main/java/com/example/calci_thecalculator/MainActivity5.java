package com.example.calci_thecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
    EditText e1,e2,e3,answr;
    Button b;
    double Pri,rte,time,SI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        e1=(EditText) findViewById(R.id.editTextNumberDecimal2);
        e2=(EditText) findViewById(R.id.editTextNumberDecimal3);
        e3=(EditText) findViewById(R.id.editTextNumberDecimal);
        answr=(EditText) findViewById(R.id.editTextNumber6);
        b=(Button) findViewById(R.id.button6);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pri=Double.parseDouble(e1.getText().toString()+"");
                rte=Double.parseDouble(e2.getText().toString()+"");
                time=Double.parseDouble(e3.getText().toString()+"");
                SI=(Pri*rte*time)/100;
                answr.setText(SI+"");
            }
        });
    }
}
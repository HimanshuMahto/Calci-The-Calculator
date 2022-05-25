package com.example.calci_thecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    EditText p,r,t,answer;
    Button CI;
    double pri, rate,n, rat;
    double cmp,x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        p=findViewById(R.id.principle);
        r=findViewById(R.id.rate);
        t=findViewById(R.id.time);
        CI=findViewById(R.id.cal);
        answer=findViewById(R.id.answer);
        CI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pri=Double.parseDouble(p.getText().toString()+"");
                rate=Double.parseDouble(r.getText().toString()+"");
                n=Double.parseDouble(t.getText().toString()+"");
                rat=pri *(Math.pow((1+rate/100),n));
                cmp=rat-pri;
                answer.setText(cmp+"");
            }
        });
    }
}
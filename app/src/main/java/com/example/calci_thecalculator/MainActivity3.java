package com.example.calci_thecalculator;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button3);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(intent1);
            }
        });
    }
}
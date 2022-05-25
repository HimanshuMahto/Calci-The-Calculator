package com.example.calci_thecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, addition,
            subtract, multiply, divide, Equals, Decimal,
            Power, Clear, AC, Percentage;

    TextView edt1, edt2;
    int x, y = 0, c = 0, l = 0;
    Float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision, power, percent;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.Zero);
        button1 = findViewById(R.id.One);
        button2 = findViewById(R.id.Two);
        button3 = findViewById(R.id.Three);
        button4 = findViewById(R.id.Four);
        button5 = findViewById(R.id.Five);
        button6 = findViewById(R.id.Six);
        button7 = findViewById(R.id.Seven);
        button8 = findViewById(R.id.Eight);
        button9 = findViewById(R.id.Nine);
        addition = findViewById(R.id.Add);
        subtract = findViewById(R.id.Minus);
        multiply = findViewById(R.id.Multiply);
        divide = findViewById(R.id.Divide);
        Decimal = findViewById(R.id.Dot);
        Percentage = findViewById(R.id.Percentage);
        Power = findViewById(R.id.Power);
        Clear = findViewById(R.id.Clear);
        Equals = findViewById(R.id.Equals);
        AC = findViewById(R.id.AllClear);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
                l++;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
                l++;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
                l++;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
                l++;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
                l++;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
                l++;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
                l++;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
                l++;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
                l++;
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
                l++;
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    if (l >= 1) {
                        y++;
                        if (y == 1) {
                            mValueOne = Float.parseFloat(edt1.getText() + "");
                            mAddition = true;
                            x = edt1.getText().toString().length();
                            edt1.setText(edt1.getText() + "+");
                            edt2.setText(null);
                            c = 0;
                            l = 0;
                        } else {
                            Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                            y = 1;
                        }
                    } else
                        Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    if (l >= 1) {
                        y++;
                        if (y == 1) {
                            mValueOne = Float.parseFloat(edt1.getText() + "");
                            mSubtract = true;
                            x = edt1.getText().toString().length();
                            edt1.setText(edt1.getText() + "-");
                            edt2.setText(null);
                            c = 0;
                            l = 0;
                        } else {
                            Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                            y = 1;
                        }
                    } else
                        Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (l >= 1) {
                    y++;
                    if (y == 1) {
                        mValueOne = Float.parseFloat(edt1.getText() + "");
                        mMultiplication = true;
                        x = edt1.getText().toString().length();
                        edt1.setText(edt1.getText() + "x");
                        edt2.setText(null);
                        c = 0;
                        l = 0;
                    } else {
                        Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                        y = 1;
                    }
                } else
                    Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (l >= 1) {
                    y++;
                    if (y == 1) {
                        mValueOne = Float.parseFloat(edt1.getText() + "");
                        mDivision = true;
                        x = edt1.getText().toString().length();
                        edt1.setText(edt1.getText() + "÷");
                        edt2.setText(null);
                        c = 0;
                        l = 0;
                    } else {
                        Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                        y = 1;
                    }
                } else
                    Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
            }
        });
        Power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (l >= 1) {
                    y++;
                    if (y == 1) {
                        mValueOne = Float.parseFloat(edt1.getText() + "");
                        power = true;
                        x = edt1.getText().toString().length();
                        edt1.setText(edt1.getText() + "^");
                        edt2.setText(null);
                        c = 0;
                        l = 0;
                    } else {
                        Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                        y = 1;
                    }
                } else
                    Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
            }
        });
        Percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (l >= 1) {
                    y++;
                    if (y == 1) {
                        mValueOne = Float.parseFloat(edt1.getText() + "");
                        percent = true;
                        x = edt1.getText().toString().length();
                        edt1.setText(edt1.getText() + "%");
                        edt2.setText(null);
                        c = 0;
                        l = 0;
                    } else {
                        Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                        y = 1;
                    }
                } else
                    Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
            }
        });

        Equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (l >= 1) {
                    if (y == 1) {
                        String input2 = edt1.getText().toString().substring((x + 1), edt1.getText().toString().length());
                        mValueTwo = Float.parseFloat(input2 + "");

                        if (mAddition == true) {
                            edt2.setText(edt1.getText() + "");
                            edt1.setText(mValueOne + mValueTwo + "");
                            mAddition = false;
                            y = 0;
                        }


                        if (mSubtract == true) {
                            edt2.setText(edt1.getText() + "");
                            edt1.setText(mValueOne - mValueTwo + "");
                            mSubtract = false;
                            y = 0;
                        }

                        if (mMultiplication == true) {
                            edt2.setText(edt1.getText() + "");
                            edt1.setText(mValueOne * mValueTwo + "");
                            mMultiplication = false;
                            y = 0;
                        }

                        if (mDivision == true) {
                            edt2.setText(edt1.getText());
                            float div = mValueOne / mValueTwo;
                            edt1.setText(div + "");
                            y = 0;
                            mDivision = false;
                        }
                        if (percent == true) {
                            edt2.setText(edt1.getText() + "");
                            Float ab = (mValueOne * 100) / mValueTwo;
                            edt1.setText(ab + "");
                            y = 0;
                            percent = false;
                        }
                        if (power == true) {
                            edt2.setText(edt1.getText() + "");
                            Double op = Math.pow(mValueOne, mValueTwo);
                            Float op1 = op.floatValue();
                            edt1.setText(op1 + "");
                            power = false;
                            y = 0;
                        }
                    } else
                        Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
            }
        });

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = 0;
                x = 0;
                y = 0;
                l = 0;
                edt1.setText(null);
                edt2.setText(null);
            }
        });

        Decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                if (c > 1) {
                    Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                } else
                    edt1.setText(edt1.getText() + ".");
            }
        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edt1.getText().toString();
                int length = edt1.getText().toString().length();
                String a = edt1.getText().toString().substring(length - 1, length);
                char ch = a.charAt(0);
                if (ch == '+' || ch == '-' || ch == 'x' || ch == '^' || ch == '%' || ch == '÷') {
                    y = 0;
                    mAddition = false;
                    mSubtract = false;
                    mMultiplication = false;
                    mDivision = false;
                    power = false;
                    percent = false;
                    edt1.setText(edt1.getText().toString().substring(0, length - 1));
                    l = edt1.getText().toString().length();
                } else {
                    edt1.setText(edt1.getText().toString().substring(0, length - 1));
                    l = edt1.getText().toString().length();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.about:
                Intent my_int = new Intent(this, MainActivity2.class);
                startActivity(my_int);
                break;
            case R.id.more:
                Intent my_intent = new Intent(this, MainActivity3.class);
                startActivity(my_intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

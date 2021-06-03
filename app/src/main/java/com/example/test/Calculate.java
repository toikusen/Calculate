package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Calculate extends AppCompatActivity {

    TextView textView;
    String name;

    TextView number;
    double num;
    double num1;
    double num2 = 0;

    double tempplus;
    double tempminus;
    double temptimes;
    double tempdevide;
    double temp;

    double plus = 0;
    double minus = 0;
    double times = 1;
    double devide = 1;

    int record = 0;
    int recordplus = 1;
    int recordminus = 1;
    int recordtimes = 1;
    int recorddevide = 1;

    double current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        number = findViewById(R.id.number);

        textView = findViewById(R.id.textView_name);
        Intent intent = getIntent();
        name = intent.getStringExtra("Name");
        textView.setText(name);
    }


    public void count() {
        num = (num2 * 10) + num1;
        num2 = num;
    }

    public void one(View view) {
        num1 = 1;
        count();
        number.setText(num + "");
    }

    public void two(View view) {
        num1 = 2;
        count();
        number.setText(num + "");
    }

    public void three(View view) {
        num1 = 3;
        count();
        number.setText(num + "");
    }

    public void four(View view) {
        num1 = 4;
        count();
        number.setText(num + "");
    }

    public void five(View view) {
        num1 = 5;
        count();
        number.setText(num + "");
    }

    public void six(View view) {
        num1 = 6;
        count();
        number.setText(num + "");
    }

    public void seven(View view) {
        num1 = 7;
        count();
        number.setText(num + "");
    }

    public void eight(View view) {
        num1 = 8;
        count();
        number.setText(num + "");
    }

    public void nine(View view) {
        num1 = 9;
        count();
        number.setText(num + "");
    }

    public void zero(View view) {
        num1 = 0;
        count();
        number.setText(num + "");
    }

    public void think() {
        if (record == 0) {
            plus = temp;
            num = 0;
            tempplus = plus + num2;
            plus = tempplus;
            num2 = 0;
            temp = plus;
        } else if (record == 1) {
            if (temp == 0) {
                minus = temp;
                num = 0;
                tempminus = num2;
            } else {
                minus = temp;
                num = 0;
                tempminus = minus - num2;
            }
            minus = tempminus;
            num2 = 0;
            temp = minus;
        } else if (record == 2) {
            if (temp == 0 && num2 != 0) {
                temp = 1;
            }
            times = temp;
            num = 0;
            if (num2 != 0) {
                temptimes = times * num2;
            } else {
                temptimes = times;
            }
            times = temptimes;
            num2 = 0;
            temp = times;
        } else if (record == 3) {
            if (temp == 0) {
                temp = 1;
                devide = temp;
                num = 0;
                tempdevide = num2 / devide;
            } else {
                devide = temp;
                num = 0;
                tempdevide = devide / num2;
            }
            devide = tempdevide;
            num2 = 0;
            temp = devide;
        }
    }

    public void plus(View view) {
        if (record == 5) {
            record = 0;
        }
        think();
        recordplus = 0;
        record = 0;
        number.setText(temp + "+");

    }

    public void minus(View view) {
        if (record == 5) {
            record = 1;
        }
        think();
        recordminus = 0;
        record = 1;
        number.setText(temp + "-");

    }

    public void times(View view) {
        if (record == 5) {
            record = 2;
        }
        think();
        recordtimes = 0;
        record = 2;
        number.setText(temp + "×");

    }

    public void devide(View view) {
        if (record == 5) {
            record = 3;
        }
        think();
        recordtimes = 0;
        record = 3;
        number.setText(temp + "÷");

    }

    public void ac(View view) {
        number.setText("0");
        num = 0;
        num1 = 0;
        num2 = 0;
        temp = 0;
        record = 5;
        recordplus = 1;
        recordminus = 1;
        recordtimes = 1;
        recorddevide = 1;
        plus = 0;
        minus = 0;
        times = 0;
        devide = 0;
    }

    public void delete(View view) {
        if (num >= 10) {
            num = (num - num1) / 10;
            num2 = num;
            number.setText(num + "");
        } else if (num > 0) {
            num = 0;
            num2 = num;
            number.setText(num + "");
        }
    }

    public void equals(View view) {
        think();
        number.setText("" + temp);
    }

    public void factorial(View view) {
        current = Float.parseFloat((number.getText().toString()));
        Log.d("current",current+"");

        int n = 1;
        for(int i = 1;i <= current;i++){
            n *= i;
        }
        number.setText("" + n);
    }
}
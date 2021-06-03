package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed_name;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void change(View view){
        ed_name = findViewById(R.id.ed_name);
        name = ed_name.getText().toString();
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Calculate.class);
        intent.putExtra("Name",name);
        startActivity(intent);
    }
}

package com.example.puaninihesapla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button aytbtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aytbtn1=findViewById(R.id.aytbtn);

        aytbtn1.setOnClickListener(view -> {
            Intent sayfa2 = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(sayfa2);
            finish();

        });
    }
}
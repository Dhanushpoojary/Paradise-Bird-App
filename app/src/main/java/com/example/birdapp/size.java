package com.example.birdapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class size extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);
        RadioGroup radioGroup = findViewById(R.id.radiogp);
        RadioButton radioButton1 = findViewById(R.id.radioButton);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        RadioButton radioButton3 = findViewById(R.id.radioButton3);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton) {
                    Intent intent = new Intent(size.this, small.class);
                    startActivity(intent);
                } else if (checkedId == R.id.radioButton2) {
                    Intent intent = new Intent(size.this, medium.class);
                    startActivity(intent);
                }
                else if (checkedId == R.id.radioButton3) {
                    Intent intent = new Intent(size.this, large.class);
                    startActivity(intent);
                }
            }
        });
    }

}
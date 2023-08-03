package com.example.birdapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button2, button3, button10;
    private DatabaseHelper dbHelper;
    private SharedPreferences sharedPreferences;
    private String email;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.it, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DatabaseHelper(this);
        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        email = sharedPreferences.getString("email", "");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Paradise bird app");

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Explore.class);
                startActivity(intent);
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, info.class);
                startActivity(intent);
            }
        });
        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, size.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ab:
                startActivity(new Intent(this, Abtus.class));
                return true;
            case R.id.cnt:
                startActivity(new Intent(this, contc.class));
                return true;
            case R.id.logout:
                Log.d("MainActivity", "Logout option clicked"); // Add this line to check if the method is being called
                boolean result = DatabaseHelper.logout(email);
                if (result) {
                    Intent intent = new Intent(this, SignupActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(this, "Logout failed", Toast.LENGTH_SHORT).show();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

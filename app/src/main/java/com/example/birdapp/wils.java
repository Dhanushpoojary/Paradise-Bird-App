package com.example.birdapp;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class wils extends AppCompatActivity {
    private SQLiteDatabase db;

    private ScaleGestureDetector scaleGestureDetector;
    private float mScaleFactor = 1.0f;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wils);

        String fromActivity = getIntent().getStringExtra("FROM_ACTIVITY");
        Button activityButton = findViewById(R.id.button4);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String birdName = "Wilson's bird-of-paradise";
                String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());

                ContentValues values = new ContentValues();
                values.put("bird_name", birdName);
                values.put("time", currentTime);

                db.insert("bird_table", null, values);
                Toast.makeText(getApplicationContext(), "Thank you!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(wils.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }

        });
        DatabaseHelper1 dbHelper = new DatabaseHelper1(this);
        db = dbHelper.getWritableDatabase();

        if (fromActivity.equals("small")) {
            activityButton.setVisibility(View.VISIBLE);
        } else {
            activityButton.setVisibility(View.GONE);
        }

        imageView = findViewById(R.id.imageView9);
        TextView textView=findViewById(R.id.textView5);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        scaleGestureDetector = new ScaleGestureDetector(this, new wils.ScaleListener());

    }
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        scaleGestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private float scaleFactor = 1.0f;

        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            float scale = detector.getScaleFactor();
            scaleFactor *= scale;
            if (scaleFactor > 1.0f) {
                imageView.setScaleX(scaleFactor);
                imageView.setScaleY(scaleFactor);
            } else {
                scaleFactor = 1.0f;
                imageView.setScaleX(scaleFactor);
                imageView.setScaleY(scaleFactor);
            }
            return true;
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        db.close();
    }
}
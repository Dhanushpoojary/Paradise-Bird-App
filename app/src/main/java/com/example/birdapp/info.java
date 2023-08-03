package com.example.birdapp;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class info extends AppCompatActivity {

    WebView webview;

    private ImageView imageView;
    private ScaleGestureDetector scaleGestureDetector;
    private float scaleFactor = 1.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        webview=findViewById(R.id.webview);

        webview.loadUrl("file:///android_asset/lists.html");
        imageView = findViewById(R.id.imageView10);
        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());

        // Set an OnTouchListener for the ImageView
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Disable the scrolling for the ScrollView
                ScrollView scrollView = findViewById(R.id.scrollview);
                scrollView.requestDisallowInterceptTouchEvent(true);
                scaleGestureDetector.onTouchEvent(event);
                return true;
            }
        });
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
}

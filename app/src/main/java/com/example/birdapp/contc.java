package com.example.birdapp;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class contc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contc);
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},1);
        EditText msg=findViewById(R.id.editText2);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] phoneNumbers = {"9481146356"}; // add phone numbers here
                String mesg=msg.getText().toString();
                for (String phone : phoneNumbers) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("sms:"+phone));
                    i.putExtra("sms_body",mesg);
                    try {
                        startActivity(i);
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(contc.this, "Permission denied", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
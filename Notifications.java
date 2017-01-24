package com.appstone.www.securegateapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Notifications extends AppCompatActivity {
    ImageButton androidImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        androidImageButton = (ImageButton) findViewById(R.id.imageButton6);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Notifications.this, "View Notifications", Toast.LENGTH_LONG).show();
            }
        });
    }
}


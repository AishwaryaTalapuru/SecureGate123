package com.appstone.www.securegateapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Maintenance1 extends AppCompatActivity {
    ImageButton androidImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance1);
        androidImageButton = (ImageButton) findViewById(R.id.imageButton3);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Maintenance1.this, "Maintenance", Toast.LENGTH_LONG).show();
            }
        });
    }
}



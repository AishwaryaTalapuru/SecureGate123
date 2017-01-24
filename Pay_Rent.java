package com.appstone.www.securegateapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Pay_Rent extends AppCompatActivity {
    ImageButton androidImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay__rent);
        androidImageButton = (ImageButton) findViewById(R.id.imageButton7);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Pay_Rent.this, "Pay Rent", Toast.LENGTH_LONG).show();
            }
        });
    }
}



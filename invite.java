package com.appstone.www.securegateapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class invite extends AppCompatActivity {
    ImageButton androidImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite);
        androidImageButton = (ImageButton) findViewById(R.id.imageButton);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(invite.this, "Invite Friends", Toast.LENGTH_LONG).show();
            }
        });
    }
}

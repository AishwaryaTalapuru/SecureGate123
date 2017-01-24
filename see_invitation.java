package com.appstone.www.securegateapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class see_invitation extends AppCompatActivity {
    ImageButton androidImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_invitation);
        androidImageButton = (ImageButton) findViewById(R.id.imageButton5);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(see_invitation.this, "See Invitation", Toast.LENGTH_LONG).show();
            }
        });
    }
}



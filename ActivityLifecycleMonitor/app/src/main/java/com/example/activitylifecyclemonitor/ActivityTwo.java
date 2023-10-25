package com.example.activitylifecyclemonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    private static final String TAG = "ActivityTwoLifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.d(TAG, "onCreate called");

        Button startMainActivityButton = findViewById(R.id.startMainActivityButton);
        startMainActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivity();
            }
        });

        Button startActivityThreeButton = findViewById(R.id.startActivityThreeButton);
        startActivityThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityThree();
            }
        });
    }

    private void startMainActivity() {
        finish();
    }

    private void startActivityThree() {
        Intent intent = new Intent(this, ActivityThree.class);
        startActivity(intent);
    }
}

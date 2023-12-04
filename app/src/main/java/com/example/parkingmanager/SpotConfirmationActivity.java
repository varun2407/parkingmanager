package com.example.parkingmanager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SpotConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotconfirmation);

        // Find views by their IDs
        TextView titleTextView = findViewById(R.id.textView_title2);
        TextView spotNumberTextView = findViewById(R.id.textView_spot_num);
        TextView floorNumberTextView = findViewById(R.id.textView_floor_num);

        titleTextView.setText("YOU'VE PARKED AT:");

        // Get the spot number from the Intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("SPOT_NUMBER")) {
            String spotNumber = intent.getStringExtra("SPOT_NUMBER");
            spotNumberTextView.setText("#" + spotNumber);
            // You can set the floor number based on your logic or data source
            floorNumberTextView.setText("Floor: B2"); // Replace with actual floor logic
        }
    }
}
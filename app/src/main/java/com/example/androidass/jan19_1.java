package com.example.androidass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class jan19_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan191);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = (TextView) findViewById(R.id.textViewId);
        textViewId.setText("Name: " + Name + "\nPRN: " + PRN);
    }
}
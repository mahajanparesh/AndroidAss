package com.example.androidass.jan25;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidass.R;

public class jan25_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan252);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));
    }
}
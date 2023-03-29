package com.example.androidass.jan25;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.androidass.R;

public class jan25_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan251);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String PRN = intent.getStringExtra("PRN");

        TextView textViewId = findViewById(R.id.textViewId);
        textViewId.setText(String.format("%s %s%s %s", getString(R.string.name), Name, getString(R.string.prn), PRN));

        final LinearLayout ll = findViewById(R.id.LinearLayout);

        final RadioButton red = findViewById(R.id.red);
        final RadioButton cream = findViewById(R.id.cream);
        final RadioButton sky = findViewById(R.id.sky);
        final RadioButton navy = findViewById(R.id.navy);

        red.setOnClickListener(v -> ll.setBackgroundColor(ContextCompat.getColor(this, R.color.redd)));

        cream.setOnClickListener(v -> ll.setBackgroundColor(ContextCompat.getColor(this, R.color.cream)));

        sky.setOnClickListener(v -> ll.setBackgroundColor(ContextCompat.getColor(this, R.color.sky)));

        navy.setOnClickListener(v -> ll.setBackgroundColor(ContextCompat.getColor(this, R.color.navy)));
    }
}
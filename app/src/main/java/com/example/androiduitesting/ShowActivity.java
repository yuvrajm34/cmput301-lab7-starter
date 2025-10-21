package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent showCity = getIntent();
        String cityName = showCity.getStringExtra("city");

        TextView cityNameText = findViewById(R.id.text_cityName);
        Button backButton = findViewById(R.id.button_back);


        cityNameText.setText(cityName);

        backButton.setOnClickListener(view -> finish());

    }
}

package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstText = (TextView)findViewById(R.id.firstText);

        long factorial = calculateFactorial(20);
        firstText.setText(String.valueOf(factorial));
        firstText.setTextSize(30.0f);

        int color = ContextCompat.getColor(getApplicationContext(), R.color.colorTest);
        firstText.setTextColor(color);
    }

    private long calculateFactorial(int n) {
        long product = 1L;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

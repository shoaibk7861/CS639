package com.example.midterm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextLiters;
    private Button buttonConvert;
    private TextView textViewResult;
    private TextView textViewDeveloper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLiters = findViewById(R.id.editTextLiters);
        buttonConvert = findViewById(R.id.buttonConvert);
        textViewResult = findViewById(R.id.textViewResult);
        textViewDeveloper = findViewById(R.id.textViewDeveloper);

        // Set developer's name
        textViewDeveloper.setText("This app was developed by Shoaib Khan Patan");

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input liters
                String litersStr = editTextLiters.getText().toString().trim();

                // Check if input is not empty
                if (!litersStr.isEmpty()) {
                    // Convert input to double
                    double liters = Double.parseDouble(litersStr);

                    // Calculate cups (1 liter = 4.22 cups)
                    double cups = liters * 4.22;

                    // Display the result
                    textViewResult.setText(String.format("%.2f liters = %.2f cups", liters, cups));
                } else {
                    // If input is empty, show error
                    textViewResult.setText("Please enter liters.");
                }
            }
        });
    }
}
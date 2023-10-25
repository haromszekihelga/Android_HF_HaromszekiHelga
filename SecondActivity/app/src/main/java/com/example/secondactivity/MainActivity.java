package com.example.secondactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumber1, edtNumber2;
    private Button btnAdd;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber1 = findViewById(R.id.edtNumber1);
        edtNumber2 = findViewById(R.id.edtNumber2);
        btnAdd = findViewById(R.id.btnAdd);
        tvResult = findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAddition();
            }
        });
    }

    private void calculateAddition() {
        try {
            double num1 = Double.parseDouble(edtNumber1.getText().toString());
            double num2 = Double.parseDouble(edtNumber2.getText().toString());
            double result = num1 + num2;

            tvResult.setText("Eredmény: " + result);
        } catch (NumberFormatException e) {
            tvResult.setText("Hibás számformátum");
        }
    }
}
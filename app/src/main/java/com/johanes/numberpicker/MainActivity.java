package com.johanes.numberpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvNumber,tvResult;
    Button btnMinus, btnPlus,btnPrint;
   // int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int maksimum = 12;
        tvNumber = findViewById(R.id.number);
        btnMinus = findViewById(R.id.decrement);
        btnPlus = findViewById(R.id.increment);
        btnPrint = findViewById(R.id.btn_print);
        tvResult = findViewById(R.id.tv_result);

        btnMinus.setOnClickListener(v -> {

            String nomor = tvNumber.getText().toString();
            int number = Integer.parseInt(nomor);
            if(number > 0){
                number--;
            }
            tvNumber.setText(String.valueOf(number));

        });
        btnPlus.setOnClickListener(v -> {
            String nomor = tvNumber.getText().toString();
            int number = Integer.parseInt(nomor);
            if(number < maksimum){
                number++;
            }
            tvNumber.setText(String.valueOf(number));
        });
        btnPrint.setOnClickListener(v -> {
            String nomor = tvNumber.getText().toString();
            int number = Integer.parseInt(nomor);
            tvResult.setText(String.valueOf(number));
        });


    }
}
package com.eikmeng.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView displayResult = findViewById(R.id.textViewResult);

        Intent intent = getIntent();
        if(intent.hasExtra(MainActivity.BMI__RESULT)){
            String result = String.valueOf(intent.getDoubleExtra(MainActivity.BMI__RESULT, 0));
            double BMI = Double.parseDouble(result);
            if(BMI < 18.5){
                displayResult.setText("Under Weight");
            } else if(BMI > 18.5 && BMI < 25){
                displayResult.setText("Normal");
            } else if(BMI > 25 ){
                displayResult.setText("Over Weight");
            }
        }
    }
}

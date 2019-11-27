package com.example.calculatorexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText editText1;
private EditText editText2;
private TextView textViewResult;
private Calculator c = new Calculator();
private RadioButton radioButtonEven;
private RadioButton radioButtonOdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textViewResult = findViewById(R.id.textViewResult);
        radioButtonEven = findViewById(R.id.radioButtonEven);
        radioButtonOdd = findViewById(R.id.radioButtonOdd);

    }
    public void do_operationAdd(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        try {
            Double number1 = Double.valueOf(text1);
            Double number2 = Double.valueOf(text2);
            Double result = c.operationAdd(number1, number2);
            changeRadioButton(result);
            String resultString = String.valueOf(result);
            textViewResult.setText(resultString);
        } catch (NumberFormatException e) {
            Log.e("NotANumber", "Error: this is not a number", e);
        }


    }

    public void do_operationSub(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        try {
            Double number1 = Double.valueOf(text1);
            Double number2 = Double.valueOf(text2);
            Double result = c.operationSub(number1, number2);
            changeRadioButton(result);
            String resultString = String.valueOf(result);
            textViewResult.setText(resultString);
        } catch (NumberFormatException e) {
            Log.e("NotANumber", "Error: this is not a number", e);
        }
    }
    public void do_operationDiv(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        try {
            Double number1 = Double.valueOf(text1);
            Double number2 = Double.valueOf(text2);
            Double result = c.operationDiv(number1, number2);
            changeRadioButton(result);
            String resultString = String.valueOf(result);
            textViewResult.setText(resultString);
        } catch (NumberFormatException e) {
            Log.e("NotANumber", "Error: this is not a number", e);
        }
    }
    public void do_operationMul(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        try {
            Double number1 = Double.valueOf(text1);
            Double number2 = Double.valueOf(text2);
            Double result = c.operationMul(number1, number2);
            changeRadioButton(result);
            String resultString = String.valueOf(result);
            textViewResult.setText(resultString);
        } catch (NumberFormatException e) {
            Log.e("NotANumber", "Error: this is not a number", e);
        }
    }
    public void changeRadioButton(double result){
        if((result%2)==0){
            radioButtonEven.toggle();
        }else{
            radioButtonOdd.toggle();
        }
    }
}

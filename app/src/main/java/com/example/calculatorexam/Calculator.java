package com.example.calculatorexam;

import android.util.Log;
import android.view.View;

public class Calculator {
    public double operationAdd(double a, double b){
        return a+b;
    }
    public double operationSub(double a, double b){
        return b-a;
    }
    public double operationDiv(double a, double b){
        double result = 0;
        try {
            result=b/a;
        } catch (IllegalArgumentException e) {
            Log.e("DividedBy0", "Error: divided by zero", e);
        }
        return result;
    }
    public double operationMul(double a, double b){
        return a*b;
    }
}

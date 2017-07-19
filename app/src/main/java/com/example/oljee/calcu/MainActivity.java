package com.example.oljee.calcu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private double finalAnswer=0;
    private double numF=0;
    private double numS=0;
    private DecimalFormat temp = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void plus(View view){

        TextView answer = (TextView) findViewById(R.id.answer);
        EditText firstNum = (EditText) findViewById(R.id.num1);
        EditText secondNum = (EditText) findViewById(R.id.num2);
        if(firstNum.getText().toString().trim().equals("")) {
            firstNum.setError( "First Number Required" );
        }
        if(secondNum.getText().toString().trim().equals("")) {
            secondNum.setError( "Second Number Required" );
        }

        else{
            numF = Double.parseDouble(firstNum.getText().toString());
            numS = Double.parseDouble(secondNum.getText().toString());
            finalAnswer = numF + numS;
            answer.setText(temp.format(finalAnswer));
        }
    }

    public void minus(View view){
        TextView answer = (TextView) findViewById(R.id.answer);
        EditText firstNum = (EditText) findViewById(R.id.num1);
        EditText secondNum = (EditText) findViewById(R.id.num2);
        if(firstNum.getText().toString().trim().equals("")) {
            firstNum.setError( "First Number Required" );

        }
        if(secondNum.getText().toString().trim().equals("")) {
            secondNum.setError( "Second Number Required" );
        }

        else{
            numF = Double.parseDouble(firstNum.getText().toString());
            numS = Double.parseDouble(secondNum.getText().toString());
            finalAnswer = numF - numS;
            answer.setText(temp.format(finalAnswer));
        }
    }

    public void product(View view){

        TextView answer = (TextView) findViewById(R.id.answer);
        EditText firstNum = (EditText) findViewById(R.id.num1);
        EditText secondNum = (EditText) findViewById(R.id.num2);
        if(firstNum.getText().toString().trim().equals("")) {
            firstNum.setError( "First Number Required" );
        }
        if(secondNum.getText().toString().trim().equals("")) {
            secondNum.setError( "Second Number Required" );
        }

        else{
            numF = Double.parseDouble(firstNum.getText().toString());
            numS = Double.parseDouble(secondNum.getText().toString());
            finalAnswer = numF * numS;
            answer.setText(temp.format(finalAnswer));
        }
    }

    public void devide(View view){
        TextView answer = (TextView) findViewById(R.id.answer);
        EditText firstNum = (EditText) findViewById(R.id.num1);
        EditText secondNum = (EditText) findViewById(R.id.num2);
        if(firstNum.getText().toString().trim().equals("")) {
            firstNum.setError( "First Number Required" );
        }
        if(secondNum.getText().toString().trim().equals("")) {
            secondNum.setError( "Second Number Required" );
        }

        else{
            numF = Double.parseDouble(firstNum.getText().toString());
            numS = Double.parseDouble(secondNum.getText().toString());
            finalAnswer = numF / numS;
            answer.setText(temp.format(finalAnswer));
        }
    }
    public void clear(View view){
        TextView answer = (TextView) findViewById(R.id.answer);
        EditText firstNum = (EditText) findViewById(R.id.num1);
        EditText secondNum = (EditText) findViewById(R.id.num2);
        answer.setText("");
        firstNum.setText("");
        secondNum.setText("");
        answer.setHint("0");
        firstNum.setHint("Enter First Number");
        secondNum.setHint("Enter Second Number");
    }

    public void exit(View view){
        finish();

    }






}

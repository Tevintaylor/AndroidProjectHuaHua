package com.example.paintart.views;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.paintart.R;

import static android.view.View.VISIBLE;

public class CalculatorClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);

//      Buttons
        final  Button divide = findViewById(R.id.DivBtn);
        final  Button FloorDiv = findViewById(R.id.FloorDivBtn);
        final  Button Add = findViewById(R.id.addBtn);
        final  Button Mult = findViewById(R.id.MultBtn);
        final  Button Sub = findViewById(R.id.SubBtn);
        final Button modo = findViewById(R.id.ModBtn);
        final Button power = findViewById(R.id.PowBtn);
        final Button clear = findViewById(R.id.clearBtn);
        final Button backSpace = findViewById(R.id.BackSpaceBtn);

//      Text boxes
        final EditText firstNumber = findViewById(R.id.firstNumber);
        firstNumber.setText("0");
        final EditText SecondNumber = findViewById(R.id.SecondNumber);
        SecondNumber.setText("0");

//      Text Labels
        final TextView AnswerLabel = findViewById(R.id.labelAnswer);
        final TextView answer = findViewById(R.id.answer);
        final TextView extraAnswer = findViewById(R.id.extraAnswer);

//      action Listener for text box



//      action listener for the divide button
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//              gets the text that is enter and stores it in variables
                Float firstNum = Float.valueOf(String.valueOf(firstNumber.getText()));
                Float secNum = Float.valueOf(String.valueOf(SecondNumber.getText()));

//              calculation for the app
                Float ans = firstNum/secNum;
                Float extra = secNum/firstNum;

//              sets the text area to answer
                answer.setText(String.valueOf(ans));
                extraAnswer.setVisibility(VISIBLE);
                extraAnswer.setText(String.valueOf(extra));
            }
        });

        //       action listener for the FloorDiv button
        FloorDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//              gets the text that is enter and stores it in variables
                Float firstNum = Float.valueOf(String.valueOf(firstNumber.getText()));
                Float secNum = Float.valueOf(String.valueOf(SecondNumber.getText()));

//              calculation for the app
                double ans = firstNum/secNum;
                double nans = Math.floor(ans);
                double extra = Math.floor(secNum/firstNum);



//              sets the text area to answer
                answer.setText(String.valueOf(nans));
                extraAnswer.setVisibility(VISIBLE);
                extraAnswer.setText(String.valueOf(extra));
            }
        });

        //       action listener for the Add button
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//              gets the text that is enter and stores it in variables
                Float firstNum = Float.valueOf(String.valueOf(firstNumber.getText()));
                Float secNum = Float.valueOf(String.valueOf(SecondNumber.getText()));

//              calculation for the app
                Float ans = firstNum+secNum;

//              sets the text area to answer
                answer.setText(String.valueOf(ans));
                extraAnswer.setVisibility(View.INVISIBLE);
            }
        });

        //       action listener for the Mult button
        Mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//              gets the text that is enter and stores it in variables
                Float firstNum = Float.valueOf(String.valueOf(firstNumber.getText()));
                Float secNum = Float.valueOf(String.valueOf(SecondNumber.getText()));

//              calculation for the app
                Float ans = firstNum*secNum;

//              sets the text area to answer
                answer.setText(String.valueOf(ans));
                extraAnswer.setVisibility(View.INVISIBLE);
            }
        });

        //       action listener for the sub button
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//              gets the text that is enter and stores it in variables
                Float firstNum = Float.valueOf(String.valueOf(firstNumber.getText()));
                Float secNum = Float.valueOf(String.valueOf(SecondNumber.getText()));

//              calculation for the app
                Float ans = firstNum-secNum;
                Float extra = secNum - firstNum;

//              sets the text area to answer
                answer.setText(String.valueOf(ans));
                extraAnswer.setVisibility(VISIBLE);
                extraAnswer.setText(String.valueOf(extra));
            }
        });

        //       action listener for the mod button
        modo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//              gets the text that is enter and stores it in variables
                Float firstNum = Float.valueOf(String.valueOf(firstNumber.getText()));
                Float secNum = Float.valueOf(String.valueOf(SecondNumber.getText()));

//              calculation for the app
                Float ans = firstNum%secNum;
                Float extra = secNum%firstNum;

//              sets the text area to answer
                answer.setText(String.valueOf(ans));
                extraAnswer.setVisibility(VISIBLE);
                extraAnswer.setText(String.valueOf(extra));
            }
        });

        //       action listener for the power button
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//              gets the text that is enter and stores it in variables
                Float firstNum = Float.valueOf(String.valueOf(firstNumber.getText()));
                Float secNum = Float.valueOf(String.valueOf(SecondNumber.getText()));

//              calculation for the app
                double ans = Math.pow(firstNum,secNum);
                double extra = Math.pow(secNum,firstNum);

//              sets the text area to answer
                answer.setText(String.valueOf(ans));
                extraAnswer.setVisibility(VISIBLE);
                extraAnswer.setText(String.valueOf(extra));
            }
        });

        //       action listener for the clear button
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//              sets the text area to blank
                answer.setText("");
                answer.setText("Answer will be displayed here");
                extraAnswer.setVisibility(View.INVISIBLE);
            }
        });

        //       action listener for the back Space button
        backSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//              sets the text area to blank
                firstNumber.setText("0");
                SecondNumber.setText("0");
                extraAnswer.setVisibility(View.INVISIBLE);
            }
        });




    }



}

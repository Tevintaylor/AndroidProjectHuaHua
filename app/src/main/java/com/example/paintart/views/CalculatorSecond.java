package com.example.paintart.views;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.paintart.R;

public class CalculatorSecond extends AppCompatActivity {

    TextView calculatorScreen;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnDot, btnC, btnBrc, btnMod, btnDiv, btnMulti, btnMinus,
            btnPlus, btnBackSpace, btnEqual;

    boolean isOpPressed;
    private double firstNumber = 0;
    private int secondtNumberIndex = 0;

    private char currentOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_second_layout);

//      the widgets for the layout class
        calculatorScreen = findViewById(R.id.input);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDot = findViewById(R.id.btnDot);
        btnC = findViewById(R.id.btnC);
        btnBrc = findViewById(R.id.btnBrc);
        btnMod = findViewById(R.id.btnMod);
        btnDiv = findViewById(R.id.btnDiv);
        btnMulti = findViewById(R.id.btnMulti);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnBackSpace = findViewById(R.id.btnBackSpace);
        btnEqual = findViewById(R.id.btnEqual);


        isOpPressed = false;
        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int id = view.getId();

                switch (id) {
                    case R.id.btn0:
                        calculatorScreen.append("0");
                        break;
                    case R.id.btn1:
                        calculatorScreen.append("1");
                        break;
                    case R.id.btn2:
                        calculatorScreen.append("2");
                        break;
                    case R.id.btn3:
                        calculatorScreen.append("3");
                        break;
                    case R.id.btn4:
                        calculatorScreen.append("4");
                        break;
                    case R.id.btn5:
                        calculatorScreen.append("5");
                        break;
                    case R.id.btn6:
                        calculatorScreen.append("6");
                        break;
                    case R.id.btn7:
                        calculatorScreen.append("7");
                        break;
                    case R.id.btn8:
                        calculatorScreen.append("8");
                        break;
                    case R.id.btn9:
                        calculatorScreen.append("9");
                        break;
                    case R.id.btnDot:
                        calculatorScreen.append(".");
                        isOpPressed = true;
                        break;

                    case R.id.btnMinus:
                        String screenContent = calculatorScreen.getText().toString();
                        secondtNumberIndex = screenContent.length() + 1;
                        firstNumber = Double.parseDouble(screenContent);
                        isOpPressed = true;
                        currentOp = '-';

                        calculatorScreen.append("-");
                        isOpPressed = true;
                        break;

                    case R.id.btnMod:
                        String screenContent1 = calculatorScreen.getText().toString();
                        secondtNumberIndex = screenContent1.length() + 1;
                        firstNumber = Double.parseDouble(screenContent1);
                        isOpPressed = true;
                        currentOp = '%';

                        calculatorScreen.append("%");
                        isOpPressed = true;
                        break;

                    case R.id.btnMulti:
                        String screenContent2 = calculatorScreen.getText().toString();
                        secondtNumberIndex = screenContent2.length() + 1;
                        firstNumber = Double.parseDouble(screenContent2);
                        isOpPressed = true;
                        currentOp = 'X';

                        calculatorScreen.append("X");
                        isOpPressed = true;
                        break;

                    case R.id.btnDiv:
                        String screenContent3 = calculatorScreen.getText().toString();
                        secondtNumberIndex = screenContent3.length() + 1;
                        firstNumber = Double.parseDouble(screenContent3);
                        isOpPressed = true;
                        currentOp = '÷';

                        calculatorScreen.append("÷");
                        isOpPressed = true;
                        break;

                    case R.id.btnPlus:
                        String screenContent4 = calculatorScreen.getText().toString();
                        secondtNumberIndex = screenContent4.length() + 1;
                        firstNumber = Double.parseDouble(screenContent4);
                        calculatorScreen.append("+");
                        isOpPressed = true;
                        currentOp = '+';
                        break;

                    case R.id.btnEqual:
                        if (isOpPressed) {
                            if (currentOp == '+') {
                                String screenContents = calculatorScreen.getText().toString();
                                double secondNumber = Double.parseDouble(screenContents.substring(secondtNumberIndex, screenContents.length()));
                                secondNumber += firstNumber;
                                calculatorScreen.setText(String.valueOf(secondNumber));
                            }

                            if (currentOp == '-') {
                                String screenContents = calculatorScreen.getText().toString();
                                double secondNumber = Double.parseDouble(screenContents.substring(secondtNumberIndex, screenContents.length()));
                                double answer= secondNumber - firstNumber;
                                calculatorScreen.setText(String.valueOf(answer));
                            }

                            if (currentOp == '÷') {
                                String screenContents = calculatorScreen.getText().toString();
                                double secondNumber = Double.parseDouble(screenContents.substring(secondtNumberIndex, screenContents.length()));
                                double answer= secondNumber /firstNumber;
                                calculatorScreen.setText(String.valueOf(answer));
                            }

                            if (currentOp == 'X') {
                                String screenContents = calculatorScreen.getText().toString();
                                double secondNumber = Double.parseDouble(screenContents.substring(secondtNumberIndex, screenContents.length()));
                                double answer= secondNumber * firstNumber;
                                calculatorScreen.setText(String.valueOf(answer));
                            }

                            if (currentOp == '%') {
                                String screenContents = calculatorScreen.getText().toString();
                                double secondNumber = Double.parseDouble(screenContents.substring(secondtNumberIndex, screenContents.length()));
                                double answer= secondNumber % firstNumber;
                                calculatorScreen.setText(String.valueOf(answer));
                            }

                        }

                        break;


                }
            }
        };
        btn0.setOnClickListener(calculatorListener);
        btn1.setOnClickListener(calculatorListener);
        btn2.setOnClickListener(calculatorListener);
        btn3.setOnClickListener(calculatorListener);
        btn4.setOnClickListener(calculatorListener);
        btn5.setOnClickListener(calculatorListener);
        btn6.setOnClickListener(calculatorListener);
        btn7.setOnClickListener(calculatorListener);
        btn8.setOnClickListener(calculatorListener);
        btn9.setOnClickListener(calculatorListener);
        btnDot.setOnClickListener(calculatorListener);
        btnMod.setOnClickListener(calculatorListener);
        btnDiv.setOnClickListener(calculatorListener);
        btnMulti.setOnClickListener(calculatorListener);
        btnMinus.setOnClickListener(calculatorListener);
        btnPlus.setOnClickListener(calculatorListener);
        btnEqual.setOnClickListener(calculatorListener);

        btnBackSpace.setOnClickListener(calculatorListener);
        btnC.setOnClickListener(calculatorListener);
        btnBrc.setOnClickListener(calculatorListener);

        btnBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String displayedEmlemnt = calculatorScreen.getText().toString();

                int strLen = displayedEmlemnt.length();
                if (strLen > 0) {
                    displayedEmlemnt = displayedEmlemnt.substring(0, strLen - 1);
                    calculatorScreen.setText(displayedEmlemnt);
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("");
            }
        });
    }

//    public Double accuMulator (boolean isOp,Double firstNumber,String currOp,Double lastNumber){
//        Double result;
//        if (isOp = true){
//            if (currentOp == '%') {
//                String screenContents = calculatorScreen.getText().toString();
//                double secondNumber = Double.parseDouble(screenContents.substring(secondtNumberIndex, screenContents.length()));
//                double result= secondNumber % firstNumber);
//                calculatorScreen.setText(String.valueOf(answer));
//        }
//
//        return result;
//    }


}

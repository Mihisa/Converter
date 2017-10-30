package com.mihisa.miconverter;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private Button zero, one, two, three, four, five, six, seven, eight, nine;
    private Button dot, multiply, divide, percent, clear;
    private ImageButton back, minus, result, plus;
    private TextView outputResult, showInput, previousText;
    private static String currentDisplayedInput = "";
    private static float inputToBeParsed = 0;
    private static float resultOfEverything = 0;
    private boolean plusAction, minusAction, divideAction, multiplyAction, percentAction,
        clearAction, backAction, negativeNumber;
    private static char sign;
    private static String x = "";
    private static String showInputString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);

        plus = (ImageButton)findViewById(R.id.plus);

        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        dot = (Button)findViewById(R.id.dot);
        percent = (Button)findViewById(R.id.percent);
        result = (ImageButton)findViewById(R.id.result);

        minus = (ImageButton)findViewById(R.id.minus);
        back = (ImageButton)findViewById(R.id.backspace);
        clear = (Button)findViewById(R.id.clear);

        previousText = (TextView) findViewById(R.id.previousText);
        outputResult = (TextView) findViewById(R.id.textView);
        showInput = (TextView) findViewById(R.id.textView1);
        outputResult.setText("0");
        outputResult.setTextSize(32);
        showInput.setText("0");
        showInput.setTextSize(42);


    }

    public void onClickZero(View view) {
        if (sign == '\u0000') {
            currentDisplayedInput = currentDisplayedInput + "0";
            showInputString = sign + currentDisplayedInput;
            showInput.setText(showInputString);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);

        } else {
            currentDisplayedInput = currentDisplayedInput + "0";
            showInputString = sign + currentDisplayedInput;
            showInput.setText(showInputString);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        }
    }

    public void onClickOne(View view) {

        if (sign == '\u0000') {
            currentDisplayedInput = currentDisplayedInput + "1";
            showInput.setText(currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        } else {
            currentDisplayedInput = currentDisplayedInput + "1";
            showInput.setText(sign + currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        }

    }

    public void onClickTwo(View view) {
        if (sign == '\u0000') {
            currentDisplayedInput = currentDisplayedInput + "2";
            showInput.setText(currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        } else {
            currentDisplayedInput = currentDisplayedInput + "2";
            showInput.setText(sign + currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        }
    }

    public void onClickThree(View view) {
        if (sign == '\u0000') {
            currentDisplayedInput = currentDisplayedInput + "3";
            showInput.setText(currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        } else {
            currentDisplayedInput = currentDisplayedInput + "3";
            showInput.setText(sign + currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        }
    }

    public void onClickFour(View view) {
        if (sign == '\u0000') {
            currentDisplayedInput = currentDisplayedInput + "4";
            showInput.setText(currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        } else {
            currentDisplayedInput = currentDisplayedInput + "4";
            showInput.setText(sign + currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        }
    }

    public void onClickFive(View view) {
        if (sign == '\u0000') {
            currentDisplayedInput = currentDisplayedInput + "5";
            showInput.setText(currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        } else {
            currentDisplayedInput = currentDisplayedInput + "5";
            showInput.setText(sign + currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        }
    }

    public void onClickSix(View view) {
        if (sign == '\u0000') {
            currentDisplayedInput = currentDisplayedInput + "6";
            showInput.setText(currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        } else {
            currentDisplayedInput = currentDisplayedInput + "6";
            showInput.setText(sign + currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        }
    }

    public void onClickSeven(View view) {
        if (sign == '\u0000') {
            currentDisplayedInput = currentDisplayedInput + "7";
            showInput.setText(currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        } else {
            currentDisplayedInput = currentDisplayedInput + "7";
            showInput.setText(sign + currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        }
    }

    public void onClickEight(View view) {
        if (sign == '\u0000') {
            currentDisplayedInput = currentDisplayedInput + "8";
            showInput.setText(currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        } else {
            currentDisplayedInput = currentDisplayedInput + "8";
            showInput.setText(sign + currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        }
    }

    public void onClickNine(View view) {
        if (sign == '\u0000') {
            currentDisplayedInput = currentDisplayedInput + "9";
            showInput.setText(currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        } else {
            currentDisplayedInput = currentDisplayedInput + "9";
            showInput.setText(sign + currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            }

        }


    public void onClickDot(View view) {
        if (currentDisplayedInput.contains(".")) {

        } else {
            if (currentDisplayedInput == "") {
            currentDisplayedInput = "0";
            }
            currentDisplayedInput = currentDisplayedInput + ".";
            showInput.setText(sign + currentDisplayedInput);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);

        }
    }

    public void onClickPlus(View view) {
        if (currentDisplayedInput == "") {
            previousText.setText(removeZero(String.valueOf(resultOfEverything)));
            showInput.setText("+");
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            plusAction = true;
            minusAction = false;
            multiplyAction = false;
            divideAction = false;
            sign = '+';
        } else if(currentDisplayedInput == "-") {
            showInput.setText("+");
            previousText.setText(removeZero(String.valueOf(resultOfEverything)));
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            plusAction = true;
            minusAction = false;
            multiplyAction = false;
            divideAction = false;
            sign = '+';
        } else {
            previousText.setText(removeZero(currentDisplayedInput));
            resultOfEverything += Float.parseFloat(currentDisplayedInput);
            currentDisplayedInput = "";
            showInput.setText("+");
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            plusAction = true;
            minusAction = false;
            multiplyAction = false;
            divideAction = false;
            sign = '+';
        }
    }

    public void onClickMinus(View view) {
        if (currentDisplayedInput == "") {
            previousText.setText(removeZero(String.valueOf(resultOfEverything)));
            currentDisplayedInput = "-";
            showInput.setText("-");
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            minusAction = true;
            plusAction = false;
            multiplyAction = false;
            divideAction = false;
            sign = '\u0000';
        } else if(currentDisplayedInput == "-") {
            previousText.setText(removeZero(String.valueOf(resultOfEverything)));
            showInput.setText("-");
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            minusAction = true;
            plusAction = false;
            multiplyAction = false;
            divideAction = false;
            sign = '\u0000';
        } else {
            previousText.setText(removeZero(currentDisplayedInput));
            resultOfEverything += Float.parseFloat(currentDisplayedInput);
            currentDisplayedInput = "";
            showInput.setText("-");
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            minusAction = true;
            plusAction = false;
            multiplyAction = false;
            divideAction = false;
            sign = '-';
        }
    }



    public void onClickMultiply(View view) {
        if (currentDisplayedInput == "") {
            previousText.setText(removeZero(String.valueOf(resultOfEverything)));
            showInput.setText("x");
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            multiplyAction = true;
            minusAction = false;
            plusAction = false;
            divideAction = false;
            sign = 'x';
        } else if(currentDisplayedInput == "-") {
            previousText.setText(removeZero(String.valueOf(resultOfEverything)));
            showInput.setText("x");
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            multiplyAction = true;
            minusAction = false;
            plusAction = false;
            divideAction = false;
            sign = 'x';
        } else {
            previousText.setText(removeZero(currentDisplayedInput));
            resultOfEverything += Float.parseFloat(currentDisplayedInput);
            currentDisplayedInput = "";
            showInput.setText("x");
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            multiplyAction = true;
            minusAction = false;
            plusAction = false;
            divideAction = false;
            sign = 'x';
        }
    }

    public void onClickDivide(View view) {
        if (currentDisplayedInput == "") {
            previousText.setText(removeZero(String.valueOf(resultOfEverything)));
            showInput.setText("/");
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            divideAction = true;
            minusAction = false;
            multiplyAction = false;
            plusAction = false;
            sign = '/';
        }else if(currentDisplayedInput == "-") {
            previousText.setText(removeZero(String.valueOf(resultOfEverything)));
            showInput.setText("/");
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            divideAction = true;
            minusAction = false;
            multiplyAction = false;
            plusAction = false;
            sign = '/';
        } else {
            previousText.setText(removeZero(currentDisplayedInput));
            resultOfEverything += Float.parseFloat(currentDisplayedInput);
            currentDisplayedInput = "";
            showInput.setText("/");
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
            divideAction = true;
            minusAction = false;
            multiplyAction = false;
            plusAction = false;
            sign = '/';
        }
    }

    public void onClickPercent(View view) {
        if (sign == '\u0000') {
            currentDisplayedInput = currentDisplayedInput + "000";
            showInputString = sign + currentDisplayedInput;
            showInput.setText(showInputString);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        } else {
            currentDisplayedInput = currentDisplayedInput + "000";
            showInputString = sign + currentDisplayedInput;
            showInput.setText(showInputString);
            outputResult.setTextSize(32);
            showInput.setTextSize(42);
        }
    }

    public void onClickResult(View view) {
        if (currentDisplayedInput == "" | currentDisplayedInput == "-") {
        }
        else {

            inputToBeParsed = Float.parseFloat(currentDisplayedInput);

            if (plusAction) {
                resultOfEverything += inputToBeParsed;
                x = String.valueOf(resultOfEverything);
                x = removeZero(x);
                currentDisplayedInput = "";
                outputResult.setText(x);
                outputResult.setTextSize(42);
                showInput.setTextSize(32);
                plusAction = false;
            }
            if (minusAction) {
                if (inputToBeParsed < 0) {
                    inputToBeParsed = Math.abs(inputToBeParsed);
                }
                resultOfEverything -= inputToBeParsed;
                x = String.valueOf(resultOfEverything);
                x = removeZero(x);
                currentDisplayedInput = "";
                outputResult.setText(x);
                outputResult.setTextSize(42);
                showInput.setTextSize(32);
                minusAction = false;
            }
            if (multiplyAction) {
                resultOfEverything *= inputToBeParsed;
                x = String.valueOf(resultOfEverything);
                x = removeZero(x);
                currentDisplayedInput = "";
                outputResult.setText(x);
                outputResult.setTextSize(42);
                showInput.setTextSize(32);
                multiplyAction = false;
            }
            if (divideAction) {
                resultOfEverything /= inputToBeParsed;
                currentDisplayedInput = "";
                x = String.valueOf(resultOfEverything);
                x = removeZero(x);
                outputResult.setText(x);
                outputResult.setTextSize(42);
                showInput.setTextSize(32);
                divideAction = false;
            }
        }
    }

    public void onClickBack(View view) {
        int length = currentDisplayedInput.length();
        if (currentDisplayedInput.length() == 1) {
            currentDisplayedInput = "";
            showInput.setText(sign + "0");
        } else if(currentDisplayedInput.length() == 0) {
            currentDisplayedInput = "";
            showInput.setText("0");
            sign = '\u0000';
        } else {
            currentDisplayedInput = currentDisplayedInput.substring(0, length - 1);
            showInput.setText(sign + currentDisplayedInput);
        }
    }

    public void onClickClear(View view) {
        currentDisplayedInput = "";
        resultOfEverything = 0;
        sign = '\u0000';
        previousText.setText("");
        outputResult.setText("0");
        showInput.setText("0");
    }

    public String removeZero(String s) {
        if (!s.contains(".")) {
            return s;
        }
        int dotPosition = s.indexOf(".");
        String newValue = s.substring(dotPosition, s.length());
        if (newValue.equals(".0")) {
            return s.substring(0, dotPosition);
        }
        return s;
    }

}

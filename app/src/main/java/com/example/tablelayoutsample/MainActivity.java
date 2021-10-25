package com.example.tablelayoutsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonC, buttonEqual, buttonSquare, buttonBack, buttonPlusMinus;
    TextView display;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision, crunchifySquare;
    int mValueOne, mValueTwo;
    float rootThing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.n9);
        button1 = (Button) findViewById(R.id.nx);
        button2 = (Button) findViewById(R.id.n8);
        button3 = (Button) findViewById(R.id.n7);
        button4 = (Button) findViewById(R.id.n4);
        button5 = (Button) findViewById(R.id.n5);
        button6 = (Button) findViewById(R.id.n6);
        button7 = (Button) findViewById(R.id.n);
        button8 = (Button) findViewById(R.id.n2);
        button9 = (Button) findViewById(R.id.n3);
        buttonAdd = (Button) findViewById(R.id.nxxx);
        buttonSub = (Button) findViewById(R.id.nxx);
        buttonMul = (Button) findViewById(R.id.multiplication);
        buttonDivision = (Button) findViewById(R.id.division);
        buttonC = (Button) findViewById(R.id.clearEverything);
        buttonEqual = (Button) findViewById(R.id.nr);
        buttonSquare = (Button) findViewById(R.id.oneDevidedByX);
        buttonBack = (Button) findViewById(R.id.del);
        buttonPlusMinus = (Button) findViewById(R.id.MC);
        display = (TextView) findViewById(R.id.calculatorScreen);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"1");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display.setText("");
                } else {
                    mValueOne = Integer.parseInt(display.getText() + "");
                    crunchifyAddition = true;
                    display.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Integer.parseInt(display.getText() + "");
                mSubtract = true;
                display.setText(null);
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Integer.parseInt(display.getText() + "");
                crunchifyMultiplication = true;
                display.setText(null);
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Integer.parseInt(display.getText() + "");
                crunchifyDivision = true;
                display.setText(null);
            }
        });
        buttonPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Integer.parseInt(display.getText() + "");
                int getPlus = mValueOne * (-1);
                display.setText(getPlus +"");
            }
        });
        buttonSquare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                rootThing = Float.parseFloat(display.getText() + "");
                crunchifySquare = true;
                if (crunchifySquare == true) {
                    Double root = Math.pow(rootThing,0.5);
                    display.setText(root + "");
                    crunchifySquare = false;
                }
            }
        });
        buttonEqual.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Integer.parseInt(display.getText() + "");

                if (crunchifyAddition == true) {
                    display.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    display.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    display.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    display.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String back = (String) display.getText();
                if(back.isEmpty()){
                    display.setText("");
                }
                else{
                    display.setText(back.substring(0, back.length()-1) +"");
                }
            }
        });

    }


}
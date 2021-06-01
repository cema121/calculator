package com.hungryshark.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText text;

    float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.answer);


        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "1");
            }
        });

        findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "2");
            }
        });

        findViewById(R.id.button_3).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "3");
            }
        });

        findViewById(R.id.button_4).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "4");
            }
        });

        findViewById(R.id.button_5).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "5");
            }
        });

        findViewById(R.id.button_6).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "6");
            }
        });

        findViewById(R.id.button_7).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "7");
            }
        });

        findViewById(R.id.button_8).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "8");
            }
        });

        findViewById(R.id.button_9).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "9");
            }
        });

        findViewById(R.id.button_0).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "0");
            }
        });

        findViewById(R.id.button_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (text == null) {
                    text.setText("0");
                } else {
                    mValueOne = Float.parseFloat(text.getText() + "");
                    mAddition = true;
                    text.setText(null);
                }
            }
        });

        findViewById(R.id.button_minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(text.getText() + "");
                mSubtract = true;
                text.setText(null);
            }
        });

        findViewById(R.id.button_multiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(text.getText() + "");
                mMultiplication = true;
                text.setText(null);
            }
        });

        findViewById(R.id.button_division).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(text.getText() + "");
                mDivision = true;
                text.setText(null);
            }
        });

        findViewById(R.id.button_equals).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(text.getText() + "");

                if (mAddition) {
                    text.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }

                if (mSubtract) {
                    text.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication) {
                    text.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision) {
                    text.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });

        findViewById(R.id.button_reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });

        findViewById(R.id.button_dot).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + ".");
            }
        });
    }
}
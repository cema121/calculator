package com.hungryshark.calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private static final int REQUEST_CODE_SETTING_ACTIVITY = 99;

    private final int[] numberButtonIds = new int[]{R.id.button_0, R.id.button_1, R.id.button_2, R.id.button_3,
            R.id.button_4, R.id.button_5, R.id.button_6, R.id.button_7, R.id.button_8, R.id.button_9};

    Button btnPlus, btnMinus, btnDiv, btnMul, btnC, btnEq;
    ImageButton btnSet;
    TextView inputBox, resultBox;
    float mValueOne, mValueTwo;
    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getAppTheme(getChooseTheme()));
        setContentView(R.layout.activity_main);

        btnPlus = findViewById(R.id.button_plus);
        btnMinus = findViewById(R.id.button_minus);
        btnMul = findViewById(R.id.button_multiply);
        btnDiv = findViewById(R.id.button_division);
        btnC = findViewById(R.id.button_reset);
        btnEq = findViewById(R.id.button_equals);
        btnSet = findViewById(R.id.button_setting);

        inputBox = findViewById(R.id.input_box);
        resultBox = findViewById(R.id.result_box);

        setNumberButtonListeners();

        btnPlus.setOnClickListener(v -> {

            if (inputBox == null) {
                inputBox.setText("");
            } else {
                resultBox.setText(resultBox.getText() + "+");
                mValueOne = Float.parseFloat(inputBox.getText() + "");
                mAddition = true;
                inputBox.setText(null);
            }
        });

        btnMinus.setOnClickListener(v -> {
            resultBox.setText(resultBox.getText() + "-");
            mValueOne = Float.parseFloat(inputBox.getText() + "");
            mSubtract = true;
            inputBox.setText(null);
        });

        btnMul.setOnClickListener(v -> {
            resultBox.setText(resultBox.getText() + "*");
            mValueOne = Float.parseFloat(inputBox.getText() + "");
            mMultiplication = true;
            inputBox.setText(null);
        });

        btnDiv.setOnClickListener(v -> {
            resultBox.setText(resultBox.getText() + "/");
            mValueOne = Float.parseFloat(inputBox.getText() + "");
            mDivision = true;
            inputBox.setText(null);
        });

        btnEq.setOnClickListener(v -> {
            mValueTwo = Float.parseFloat(inputBox.getText() + "");

            if (mAddition) {
                inputBox.setText(mValueOne + mValueTwo + "");
                mAddition = false;
            }

            if (mSubtract) {
                inputBox.setText(mValueOne - mValueTwo + "");
                mSubtract = false;
            }

            if (mMultiplication) {
                inputBox.setText(mValueOne * mValueTwo + "");
                mMultiplication = false;
            }

            if (mDivision) {
                inputBox.setText(mValueOne / mValueTwo + "");
                mDivision = false;
            }
        });

        btnC.setOnClickListener(v -> {
            inputBox.setText("");
            resultBox.setText("");
        });

        btnSet.setOnClickListener(v -> {
            Intent runSettings = new Intent(MainActivity.this, SettingActivity.class);
            startActivityForResult(runSettings, REQUEST_CODE_SETTING_ACTIVITY);
        });
    }

    @SuppressLint("SetTextI18n")
    private void setNumberButtonListeners() {
        for (int numberButtonId : numberButtonIds) {
            findViewById(numberButtonId).setOnClickListener(v -> {
                Button btn = (Button) v;
                inputBox.setText(inputBox.getText() + btn.getText().toString());
                resultBox.setText(resultBox.getText() + btn.getText().toString());
            });
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != REQUEST_CODE_SETTING_ACTIVITY) {
            super.onActivityResult(requestCode, resultCode, data);
        }
        if (resultCode == RESULT_OK) {
            recreate();
        }
    }}
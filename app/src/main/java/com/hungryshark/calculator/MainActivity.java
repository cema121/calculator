package com.hungryshark.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.radiobutton.MaterialRadioButton;

public class MainActivity extends BaseActivity {

    Button btn0 , btn1 , btn2 , btn3 , btn4 , btn5 , btn6 ,
            btn7 , btn8 , btn9 , btnPlus , btnMinus , btnDiv ,
            btnMul , btnC , btnEq ;

    TextView inputBox, resultBox;

    float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initThemeChooser();

        btn0 = (Button) findViewById(R.id.button_0);
        btn1 = (Button) findViewById(R.id.button_1);
        btn2 = (Button) findViewById(R.id.button_2);
        btn3 = (Button) findViewById(R.id.button_3);
        btn4 = (Button) findViewById(R.id.button_4);
        btn5 = (Button) findViewById(R.id.button_5);
        btn6 = (Button) findViewById(R.id.button_6);
        btn7 = (Button) findViewById(R.id.button_7);
        btn8 = (Button) findViewById(R.id.button_8);
        btn9 = (Button) findViewById(R.id.button_9);
        btnPlus = (Button) findViewById(R.id.button_plus);
        btnMinus = (Button) findViewById(R.id.button_minus);
        btnMul = (Button) findViewById(R.id.button_multiply);
        btnDiv = (Button) findViewById(R.id.button_division);
        btnC = (Button) findViewById(R.id.button_reset);
        btnEq = (Button) findViewById(R.id.button_equals);

        inputBox = (TextView) findViewById(R.id.input_box);
        resultBox = (TextView) findViewById(R.id.result_box);

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                inputBox.setText(inputBox.getText()+"1");
                resultBox.setText(resultBox.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                inputBox.setText(inputBox.getText()+"2");
                resultBox.setText(resultBox.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                inputBox.setText(inputBox.getText()+"3");
                resultBox.setText(resultBox.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                inputBox.setText(inputBox.getText()+"4");
                resultBox.setText(resultBox.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                inputBox.setText(inputBox.getText()+"5");
                resultBox.setText(resultBox.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                inputBox.setText(inputBox.getText()+"6");
                resultBox.setText(resultBox.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                inputBox.setText(inputBox.getText()+"7");
                resultBox.setText(resultBox.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                inputBox.setText(inputBox.getText()+"8");
                resultBox.setText(resultBox.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                inputBox.setText(inputBox.getText()+"9");
                resultBox.setText(resultBox.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                inputBox.setText(inputBox.getText()+"0");
                resultBox.setText(resultBox.getText()+"0");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if (inputBox == null){
                    inputBox.setText("");
                }else {
                    resultBox.setText(resultBox.getText()+"+");
                    mValueOne = Float.parseFloat(inputBox.getText() + "");
                    mAddition = true;
                    inputBox.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultBox.setText(resultBox.getText()+"-");
                mValueOne = Float.parseFloat(inputBox.getText() + "");
                mSubtract = true ;
                inputBox.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultBox.setText(resultBox.getText()+"*");
                mValueOne = Float.parseFloat(inputBox.getText() + "");
                mMultiplication = true ;
                inputBox.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resultBox.setText(resultBox.getText()+"/");
                mValueOne = Float.parseFloat(inputBox.getText()+"");
                mDivision = true ;
                inputBox.setText(null);
            }
        });

        btnEq.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(inputBox.getText() + "");

                if (mAddition){

                    inputBox.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }


                if (mSubtract){
                    inputBox.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication){
                    inputBox.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision){
                    inputBox.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputBox.setText("");
                resultBox.setText("");
            }
        });
    }

    // Инициализация радиокнопок
    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radioButtonMyCoolStyle), MyCoolCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialDark), AppThemeDarkCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialLight), AppThemeLightCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialLightDarkAction), AppThemeCodeStyle);

        RadioGroup rg = findViewById(R.id.radioButtons);
        ((MaterialRadioButton) rg.getChildAt(getCodeStyle(MyCoolCodeStyle))).setChecked(true);
    }

    // Все инициализации кнопок очень похожи, поэтому создадим метод дляпереиспользования
    private void initRadioButton(View button, final int codeStyle) {
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

// сохраним настройки
                setAppTheme(codeStyle);

// пересоздадим активити, чтобы тема применилась
                recreate();
            }
        });
    }
}
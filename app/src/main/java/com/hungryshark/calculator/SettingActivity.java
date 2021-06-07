package com.hungryshark.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.google.android.material.radiobutton.MaterialRadioButton;

public class SettingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getAppTheme(getChooseTheme()));
        setContentView(R.layout.activity_setting);
        initThemeChooser();
        initButtonBack();
    }

    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radioButtonMyCoolStyle), MyCoolCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialDark), AppThemeDarkCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialLight), AppThemeLightCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialLightDarkAction), AppThemeCodeStyle);

        RadioGroup rg = findViewById(R.id.radioButtons);
        ((MaterialRadioButton) rg.getChildAt(getCodeStyle(MyCoolCodeStyle))).setChecked(true);
    }

    private void initRadioButton(View button, final int code) {
        button.setOnClickListener(v -> {
            setSaveTheme(getChooseTheme());
            setAppTheme(code);
            recreate();
        });
    }

    private void initButtonBack() {
        Button butBack = findViewById(R.id.button_return);
        butBack.setOnClickListener(v -> {
            Intent intentResult = new Intent();
            setResult(RESULT_OK, intentResult);
            finish();
        });
    }
}

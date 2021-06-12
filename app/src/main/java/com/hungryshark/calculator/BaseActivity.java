package com.hungryshark.calculator;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    protected static final int MyCoolCodeStyle = 0;
    protected static final int AppThemeLightCodeStyle = 1;
    protected static final int AppThemeCodeStyle = 2;
    protected static final int AppThemeDarkCodeStyle = 3;

    private static final String NameSharedPreference = "CALCULATOR";

    static final String themeSaved = "THEME_SAVED";
    static final String themeChoose = "THEME_CHOOSE";

    protected int saveTheme;
    protected int chooseTheme;

    public int getSaveTheme() {
        return saveTheme;
    }

    public void setChooseTheme(int chooseTheme) {
        this.chooseTheme = chooseTheme;
    }

    public int getChooseTheme() {
        return chooseTheme;
    }

    public void setSaveTheme(int saveTheme) {
        this.saveTheme = saveTheme;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Устанавливать тему надо только до установки макета активити
        setTheme(getAppTheme(R.style.MyCoolStyle));
    }

    public int getAppTheme(int codeStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    // Чтение настроек, параметр «тема»
    protected int getCodeStyle(int codeStyle) {

        // Работаем через специальный класс сохранения и чтения настроек
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);

        //Прочитать тему, если настройка не найдена - взять по умолчанию
        return sharedPref.getInt(themeSaved, codeStyle);
    }

    // Сохранение настроек
    protected void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);

        // Настройки сохраняются посредством специального класса editor.
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(themeSaved, codeStyle);
        editor.putInt(themeChoose, codeStyle);
        editor.apply();
    }

    private int codeStyleToStyleId(int codeStyle) {
        switch (codeStyle) {
            case AppThemeCodeStyle:
                return R.style.AppTheme;
            case AppThemeLightCodeStyle:
                return R.style.AppThemeLight;
            case AppThemeDarkCodeStyle:
                return R.style.AppThemeDark;
            default:
                return R.style.MyCoolStyle;
        }
    }
}
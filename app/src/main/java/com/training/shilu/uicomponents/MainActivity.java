package com.training.shilu.uicomponents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inputField(View view) {
        startActivity(new Intent(MainActivity.this, InputFieldActivity.class));
    }

    public void radioButton(View view) {
        startActivity(new Intent(MainActivity.this, RadioButtonActivity.class));
    }

    public void checkBox(View view) {
        startActivity(new Intent(MainActivity.this, CheckBoxActivity.class));
    }

    public void spinner(View view) {
        startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
    }
}

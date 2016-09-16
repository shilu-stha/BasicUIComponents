package com.training.shilu.uicomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    CheckBox chkJava;
    CheckBox chkAndroid;
    CheckBox chkRor;
    CheckBox chkPython;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        chkJava = (CheckBox) findViewById(R.id.chkJava);
        chkRor = (CheckBox) findViewById(R.id.chkRor);
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkPython = (CheckBox) findViewById(R.id.chkPython);
    }

    public void submit(View view) {
        StringBuffer selectedLanguages = new StringBuffer();
        selectedLanguages.append(chkJava.getText()+ " check : ").append(chkJava.isChecked());
        selectedLanguages.append("\n"+chkAndroid.getText()+ " check : ").append(chkAndroid.isChecked());
        selectedLanguages.append("\n"+chkRor.getText()+ " check : ").append(chkRor.isChecked());
        selectedLanguages.append("\n"+chkPython.getText()+ " check : ").append(chkPython.isChecked());

        Toast.makeText(this, selectedLanguages.toString(),
                Toast.LENGTH_LONG).show();
    }
}

package com.training.shilu.uicomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    RadioGroup radioLevelGroup;
    RadioButton radioLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
    }

    public void submit(View view) {
        radioLevelGroup = (RadioGroup) findViewById(R.id.radioLevel);

        int selectedId = radioLevelGroup.getCheckedRadioButtonId();

        radioLevel = (RadioButton) findViewById(selectedId);

        Toast.makeText(getApplicationContext(),
                "Level: "+radioLevel.getText(), Toast.LENGTH_SHORT).show();

    }
}

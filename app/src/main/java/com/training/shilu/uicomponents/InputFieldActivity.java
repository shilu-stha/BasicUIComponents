package com.training.shilu.uicomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class InputFieldActivity extends AppCompatActivity {

    TextView tvName;
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_field);

        etName = (EditText) findViewById(R.id.et_name);
        tvName = (TextView) findViewById(R.id.tv_name);
    }

    // click listener handler method for button "Submit"
    public void submit(View view) {
        // check for null or empty value
        if(!TextUtils.isEmpty(etName.getText())){
            // set new value to the text view
            tvName.setText("Hello "+etName.getText());
        }
    }
}

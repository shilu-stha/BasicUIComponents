package com.training.shilu.basicuicomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class SpinnerActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener{
    Spinner spinnerList1;
    Spinner spinnerList2;

    //Spinners provide a quick way to select one value from a set.

    // An Adapter object acts as a bridge between an AdapterView and the
    // underlying data for that view.
    // The Adapter provides access to the data items.
    // The Adapter is also responsible for making a View for each item in
    // the data set.
    // An AdapterView is a view whose children are determined by an Adapter.
    // See ListView, GridView, Spinner and Gallery for commonly used subclasses
    // of AdapterView.



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinnerList1 = (Spinner) findViewById(R.id.spinnerList1);
        spinnerList2 = (Spinner) findViewById(R.id.spinnerList2);

        spinnerList1.setOnItemSelectedListener(this);

        addItemsOnSpinner2();
    }

    // add items into spinner dynamically
    public void addItemsOnSpinner2() {

        List<String> list = new ArrayList<String>();
        list.add("list 1");
        list.add("list 2");
        list.add("list 3");
        list.add("list 4");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerList2.setAdapter(dataAdapter);

    }

    public void submit(View view) {
        Toast.makeText(this,
                "Selected item : " +
                        "\nSpinner 1 : " + String.valueOf(spinnerList1.getSelectedItem()) +
                        "\nSpinner 2 : " + String.valueOf(spinnerList2.getSelectedItem()),
                Toast.LENGTH_SHORT).show();
    }


    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        Toast.makeText(this, "Selected Item: "+ parent.getItemAtPosition(pos), Toast.LENGTH_SHORT).show();
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}

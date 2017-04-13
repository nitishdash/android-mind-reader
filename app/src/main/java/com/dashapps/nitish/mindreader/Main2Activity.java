package com.dashapps.nitish.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    private EditText fname;
    private EditText lname;
    private NumberPicker numberPick;
    private int age;
    private String firstName, lastName;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fname = (EditText) findViewById(R.id.editText);
        lname = (EditText) findViewById(R.id.editText2);
        submit = (Button) findViewById(R.id.button2);
        numberPick = (NumberPicker) findViewById(R.id.numberPicker);
        numberPick.setMinValue(1);
        numberPick.setMaxValue(100);

        //getting the input values
        age=numberPick.getValue();
        firstName = fname.getText().toString();
        lastName = lname.getText().toString();

        submit.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v==submit){
            startActivity(new Intent(this, Main3Activity.class).putExtra("fname", firstName).putExtra("lname", lastName).putExtra("age", age));

        }
    }
}

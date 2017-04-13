package com.dashapps.nitish.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    private ArrayList<String> store;
    private ListView symbols;
    private Button ready;
    char secret;
    String secretString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        secret= (char) (Math.floor((Math.random() * 8) + 0)+33);
        secretString = ""+secret;

        store = new ArrayList<>();
        symbols = (ListView) findViewById(R.id.listView);
        ready = (Button) findViewById(R.id.button3);

        for(int i=1;i<=48;i++)
        {
            if(i%9==0)
            {
                    store.add(""+i+"\t\t>>> \t "+secret);
            }
            else
            {
                    store.add(""+i+"\t\t>>> \t "+(char)(Math.floor((Math.random() * 11) + 0)+33));
            }
        }

        ArrayAdapter<String> adp = new ArrayAdapter(this, R.layout.symbolview, R.id.textView10, store);
        symbols.setAdapter(adp);

        ready.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
      if (v==ready){
          startActivity(new Intent(this, Main4Activity.class).putExtra("magic", secretString));
      }
    }
}

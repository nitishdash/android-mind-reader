package com.dashapps.nitish.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        next1 =(Button) findViewById(R.id.button6);
        next1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == next1){
            startActivity(new Intent(getApplicationContext(), Main3Activity.class));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuinf = new MenuInflater(this);
        menuinf.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //menu item selected
        switch (item.getItemId()) {
            case R.id.action_end:

                System.exit(0);
                break;
            case R.id.action_about:
            {
                Intent ab = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(ab);
            }
            break;
        }
        return super.onOptionsItemSelected(item);
    }


}

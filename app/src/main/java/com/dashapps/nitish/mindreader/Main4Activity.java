package com.dashapps.nitish.mindreader;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    private TextView result,result2;
    private String magic;
    private Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        result = (TextView) findViewById(R.id.textView12);
        result2 = (TextView) findViewById(R.id.textView13);
        Intent intent = getIntent();
        magic= ""+intent.getStringExtra("magic");
       // vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
       // long pattern[] = {250, 150, 250};
       // vibrator.vibrate(pattern, 2);

        result.setText(getString(R.string.done) + "\n \t" );
        result2.setText("  "+magic+"  ");
       // vibrator.cancel();
    }
}

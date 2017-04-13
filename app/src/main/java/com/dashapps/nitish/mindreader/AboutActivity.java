package com.dashapps.nitish.mindreader;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mailthedev, sponsor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //initialise the buttons

        mailthedev = (Button) findViewById(R.id.button5);
        sponsor =(Button) findViewById(R.id.button4);

        sponsor.setOnClickListener(this);
        mailthedev.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if(v == sponsor){
            goToUrl("http://www.nanhikali.org/");
        }
        if (v == mailthedev){
            goToMail();
        }
    }



    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    private void goToMail(){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "nitisdash95@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Hey Nitish! I wanna say Hi!");
        startActivity(Intent.createChooser(emailIntent, "Send email to dev...."));
    }
}

package com.example.tc3p0.prayertracker;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class PrayerActivity extends ActionBarActivity {
    private ImageView bkButton = (ImageView)findViewById(R.id.BackArrow);
    private RelativeLayout answered = (RelativeLayout)findViewById(R.id.AnsweredButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer);

        bkButton.setOnClickListener(new ImageView.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Open MainActivity
            }
        });

        answered.setOnClickListener(new RelativeLayout.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Set prayer to Answered
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_prayer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.tc3p0.prayertracker;

import android.app.LauncherActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {
    private ListView prayers = (ListView)findViewById(R.id.PrayerList);
    private final SwipeDetector swiper = new SwipeDetector();
    private ImageView imgAddPrayer = (ImageView)findViewById(R.id.ButtonPrayer);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAddPrayer.setOnClickListener(new ImageView.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Open NewPrayerActivity to add a prayer
            }
        });


        prayers.setOnTouchListener(swiper);
        prayers.setOnItemClickListener(new ListView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView< ?> parent, View view,
                                    int position, long id) {

                if (swiper.swipeDetected()) {
                    if (swiper.getAction() == SwipeDetector.Action.RL) {
                        // Open PrayerActivity to show prayer information
                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

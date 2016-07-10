package com.saranshgaur.firstapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      //  setTheme(R.style.splashtheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Exercise");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));

        String[] excercise = {"Back DAY", "Legs DAY", "Abs DAY", "Chest DAY", "Shoulder DAY", "Arms DAY"};
        final int[] imgs = {R.drawable.backnewic, R.drawable.legnewic, R.drawable.absnew_ic, R.drawable.chestnewic, R.drawable.shouldernewic, R.drawable.armsnewic};
        ListAdapter saruadapter = new customadapter(this, excercise, imgs);
        ListView sarulistview = (ListView) findViewById(R.id.sarelistview);
        sarulistview.setAdapter(saruadapter);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,17);
        calendar.set(Calendar.MINUTE,10);
        calendar.set(Calendar.SECOND,00);
        Intent intent = new Intent("xyz");
        PendingIntent pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager am = (AlarmManager) MainActivity.this.getSystemService(MainActivity.this.ALARM_SERVICE);
        am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);

       // Intent intent = new Intent();
       // startService(intent);


        sarulistview.setOnItemClickListener(
                new android.widget.AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                      //  String excercise = String.valueOf(parent.getItemAtPosition(position));
                       // Toast.makeText(MainActivity.this, excercise, Toast.LENGTH_LONG).show();
                        switch(position){
                            case 0:
                                Intent i0 = new Intent(MainActivity.this, Back1.class);
                                startActivity(i0);

                                break;
                            case 1:
                                Intent i1 = new Intent(MainActivity.this, leg.class);
                                startActivity(i1);

                                break;
                            case 2:
                                Intent i2 = new Intent(MainActivity.this, abs.class);
                                startActivity(i2);

                                break;
                            case 3:
                                Intent i3 = new Intent(MainActivity.this, chest.class);
                                startActivity(i3);

                                break;
                            default:
                                String url = "http://www.youtube.com/watch?v=qvtCk1wZ7LM";
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                startActivity(intent);
                        }
                    }
                }
        );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_settings:
                finish();
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}

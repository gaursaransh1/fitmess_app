package com.saranshgaur.firstapp;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class abs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Abs Day");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));


        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if(menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



        String[] excercise1 = {"Air Bike", "Crunch", "Decline Crunch", "Decline Reverse Crunch", "Hanging Leg Raise", "Ab Roller", "Rope Crunch", "Toe Toucher"};
        String[] Detail = {"4 Sets of 60 second", "2 sets of 15 reps", "3 sets of 15 rep", "3 sets of 15 rep", "4 sets of 10 rep", "3 sets to failure", "3 sets of 10-12 reps", "3 sets of 15-20 reps"};
        ArrayList<User> arraylist = new ArrayList<User>();
        for (int i = 0; i < excercise1.length; i++) {
            User user = new User(excercise1[i], Detail[i]);
            arraylist.add(user);
        }
        final int[] imgs1 = {R.drawable.airbike_la, R.drawable.crunch_la, R.drawable.dcrunch_la, R.drawable.drcrunch_la, R.drawable.hangingl_la, R.drawable.roller_la, R.drawable.ropecrunch_la, R.drawable.toetoucher_la};
        abscustom saruadapter = new abscustom(this, arraylist, imgs1);
        ListView sarulistview = (ListView) findViewById(R.id.listview);
        sarulistview.setAdapter(saruadapter);

        sarulistview.setOnItemClickListener(
                new android.widget.AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                Intent i0 = new Intent(abs.this, airbikepic.class);
                                startActivity(i0);

                                break;
                            case 1:
                                Intent i1 = new Intent(abs.this, crunchpic.class);
                                startActivity(i1);

                                break;
                            case 2:
                                Intent i2 = new Intent(abs.this, dcrunchpic.class);
                                startActivity(i2);

                                break;
                            case 3:
                                Intent i3 = new Intent(abs.this, drcrunch.class);
                                startActivity(i3);

                                break;
                            case 4:
                                Intent i4 = new Intent(abs.this, hanginglpic.class);
                                startActivity(i4);

                                break;
                            case 5:
                                Intent i5 = new Intent(abs.this,rollerpic.class);
                                startActivity(i5);

                                break;
                            case 6:
                                Intent i6 = new Intent(abs.this, ropecrunchpic.class);
                                startActivity(i6);

                                break;
                            case 7:
                                Intent i7 = new Intent(abs.this, toetoucherpic.class);
                                startActivity(i7);

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
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            case R.id.action_settings:
                finish();
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        /*Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;*/
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/
}

package com.saranshgaur.firstapp;

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
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class leg1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Leg Day");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String[] excercise1 = {"Barbell Squat", "Leg Press", "Walking Dumble Lunge", "Leg Extension", "Romanian Deadlift", "Lying Leg Curl", "Standing Leg Raise"};
        String[] Detail = {"4 sets of 10,10,8,6 reps", "4 sets of 10,10,8,6 reps", "3 sets of 10,12,14 steps", "3 set of 10rep", "3 sets of 8,10,12 reps", "3 sets of 8,10,12 reps", "4 sets of 12,12,20,20 reps"};
        ArrayList<User> arraylist = new ArrayList<User>();
        for (int i = 0; i < excercise1.length; i++) {
            User user = new User(excercise1[i], Detail[i]);
            arraylist.add(user);
        }
        final int[] imgs1 = {R.drawable.squat_ic, R.drawable.presspic_ic, R.drawable.walk_ic, R.drawable.extension_ic, R.drawable.roman_ic, R.drawable.curlpic_ic, R.drawable.raisepic_ic};
        legcustom saruadapter = new legcustom(this, arraylist, imgs1);
        ListView sarulistview = (ListView) findViewById(R.id.listview);
        sarulistview.setAdapter(saruadapter);

        sarulistview.setOnItemClickListener(
                new android.widget.AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                Intent i0 = new Intent(leg1.this, squatpic.class);
                                startActivity(i0);

                                break;
                            case 1:
                                Intent i1 = new Intent(leg1.this, lpresspic.class);
                                startActivity(i1);

                                break;
                            case 2:
                                Intent i2 = new Intent(leg1.this, walkingpic.class);
                                startActivity(i2);

                                break;
                            case 3:
                                Intent i3 = new Intent(leg1.this, lextensionpic.class);
                                startActivity(i3);

                                break;
                            case 4:
                                Intent i4 = new Intent(leg1.this, romadeadpic.class);
                                startActivity(i4);

                                break;
                            case 5:
                                Intent i5 = new Intent(leg1.this, lcurl.class);
                                startActivity(i5);

                                break;
                            case 6:
                                Intent i6 = new Intent(leg1.this, lraisepic.class);
                                startActivity(i6);

                                break;
                            /*default:
                                String url = "http://www.youtube.com/watch?v=qvtCk1wZ7LM";
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                startActivity(intent);*/
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
}

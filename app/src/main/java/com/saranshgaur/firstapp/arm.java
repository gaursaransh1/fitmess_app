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

public class arm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Arms Day");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));

        String[] excercise1 = {"Close-Grip Press", "EZ-Bar Triceps", "Dips—Triceps Version", "EZ-Bar Curl", "Hammer Curls", "Preacher Curl", "Incline Dumbbell Curl", "Tricep Rope Pushdown"};
        String[] Detail = {"4 Sets of 10 reps", "3 sets of 8-10 reps", "4 sets of 8 reps", "3 sets of 8 reps", "3 sets of 12,10,8 reps", "3 sets to failure", "3 sets of 10 reps", "3 sets of 15-20 reps"};
        ArrayList<User> arraylist = new ArrayList<User>();
        for (int i = 0; i < excercise1.length; i++) {
            User user = new User(excercise1[i], Detail[i]);
            arraylist.add(user);
        }
        final int[] imgs1 = {R.drawable.clogbp_ic, R.drawable.decebt_ic, R.drawable.dipt_ic, R.drawable.ezbc_ic, R.drawable.hamc_ic, R.drawable.prec_ic, R.drawable.incdc_ic, R.drawable.trirc_ic};
        armcustom saruadapter = new armcustom(this, arraylist, imgs1);
        ListView sarulistview = (ListView) findViewById(R.id.listview);
        sarulistview.setAdapter(saruadapter);

        sarulistview.setOnItemClickListener(
                new android.widget.AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                Intent i0 = new Intent(arm.this, clogbppic.class);
                                startActivity(i0);

                                break;
                            case 1:
                                Intent i1 = new Intent(arm.this, ezdbtpic.class);
                                startActivity(i1);

                                break;
                            case 2:
                                Intent i2 = new Intent(arm.this, diptpic.class);
                                startActivity(i2);

                                break;
                            case 3:
                                Intent i3 = new Intent(arm.this, ezbcpic.class);
                                startActivity(i3);

                                break;
                            case 4:
                                Intent i4 = new Intent(arm.this, hamcpic.class);
                                startActivity(i4);

                                break;
                            case 5:
                                Intent i5 = new Intent(arm.this,precpic.class);
                                startActivity(i5);

                                break;
                            case 6:
                                Intent i6 = new Intent(arm.this, incdcpic.class);
                                startActivity(i6);

                                break;
                            case 7:
                                Intent i7 = new Intent(arm.this, trircpic.class);
                                startActivity(i7);

                                break;
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
    }
}

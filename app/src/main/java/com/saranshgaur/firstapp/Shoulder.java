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

public class Shoulder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));
        actionBar.setTitle("Shoulder Day");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        String[] excercise1 = {"Arnold Dumbbell Press", "Barbell Shoulder Press", "Car-Driver Exercise", "Front Dumbbell Raise", "Over Rear Delt Raise", "Side Lateral Raise", "Upright Barbell Row"};
        String[] Detail = {"3 sets of 15 reps to failure", "3 sets of 8-12 reps ", "3 set of 15 reps", "3 set of 10-12 reps", "4 set of 10 reps", "3 set of 10-12 reps", "3 set of 10,8,8 reps"};
        ArrayList<User> arraylist = new ArrayList<User>();
        for (int i = 0; i < excercise1.length; i++) {
            User user = new User(excercise1[i], Detail[i]);
            arraylist.add(user);
        }
        final int[] imgs1 = {R.drawable.adumpre_ic, R.drawable.barshoupre_ic, R.drawable.cardriexe_ic, R.drawable.frodumrai_ic, R.drawable.overreadearai_ic, R.drawable.sidelatrai_ic, R.drawable.upbarrow_ic};
        shouldercustom saruadapter = new shouldercustom(this, arraylist, imgs1);
        ListView sarulistview = (ListView) findViewById(R.id.listview);
        sarulistview.setAdapter(saruadapter);

        sarulistview.setOnItemClickListener(
                new android.widget.AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                Intent i0 = new Intent(Shoulder.this,ardumpresspic.class);
                                startActivity(i0);

                                break;
                            case 1:
                                Intent i1 = new Intent(Shoulder.this, barshouprepic.class);
                                startActivity(i1);

                                break;
                            case 2:
                                Intent i2 = new Intent(Shoulder.this, cardripic.class);
                                startActivity(i2);

                                break;
                            case 3:
                                Intent i3 = new Intent(Shoulder.this, frodumraipic.class);
                                startActivity(i3);

                                break;
                            case 4:
                                Intent i4 = new Intent(Shoulder.this, overraipic.class);
                                startActivity(i4);

                                break;
                            case 5:
                                Intent i5 = new Intent(Shoulder.this, sidelarraipic.class);
                                startActivity(i5);

                                break;
                            case 6:
                                Intent i6 = new Intent(Shoulder.this, upbarrowpic.class);
                                startActivity(i6);

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
        /*Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;*/
    }

}

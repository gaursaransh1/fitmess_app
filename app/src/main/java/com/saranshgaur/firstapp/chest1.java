package com.saranshgaur.firstapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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

public class chest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*ActionBar actionBar = getActionBar();
        *//*actionBar.setDisplayHomeAsUpEnabled(true);*//*
        actionBar.setTitle("Chest2");*/

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Chest Day");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));

        String[] excercise1 = {"Barbell Bench Press", "Decline Barbell Bench Press", "Incline Barbell Bench Press", "Incline Dumbbell Pull-Over", "Incline Dumbbell Fly", "Incline Dumbbell Press", "Push up"};
        String[] Detail = {"3 Set of 8-12 rep", "3 set of 8-12 rep", "3 set of 12,10,8 rep", "3 set of 10-12 rep", "4 set of 10-15 rep", "3 set of 10-12 rep", "3 set of failure"};
        ArrayList<User> arraylist = new ArrayList<User>();
        for (int i = 0; i < excercise1.length; i++) {
            User user = new User(excercise1[i], Detail[i]);
            arraylist.add(user);
        }
        final int[] imgs1 = {R.drawable.barbellbpre_ic, R.drawable.decbarbellbpre_ic, R.drawable.incbarbellbpre_ic, R.drawable.dumbellpullover_ic, R.drawable.incdumbellpre_ic, R.drawable.incdumbellpre_ic, R.drawable.pushup_ic};
        chestcustom saruadapter = new chestcustom(this, arraylist, imgs1);
        ListView sarulistview = (ListView) findViewById(R.id.listview);
        sarulistview.setAdapter(saruadapter);

        sarulistview.setOnItemClickListener(
                new android.widget.AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                Intent i0 = new Intent(chest1.this, barbprepic.class);
                                startActivity(i0);

                                break;
                            case 1:
                                Intent i1 = new Intent(chest1.this, dbarbprepic.class);
                                startActivity(i1);

                                break;
                            case 2:
                                Intent i2 = new Intent(chest1.this, ibbprepic.class);
                                startActivity(i2);

                                break;
                            case 3:
                                Intent i3 = new Intent(chest1.this, idpullpic.class);
                                startActivity(i3);

                                break;
                            case 4:
                                Intent i4 = new Intent(chest1.this, idflypic.class);
                                startActivity(i4);

                                break;
                            case 5:
                                Intent i5 = new Intent(chest1.this, idprepic.class);
                                startActivity(i5);

                                break;
                            case 6:
                                Intent i6 = new Intent(chest1.this, pushuppic.class);
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

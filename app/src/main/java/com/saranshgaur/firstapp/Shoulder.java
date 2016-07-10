package com.saranshgaur.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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
        setContentView(R.layout.activity_abs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        /*actionBar.setDisplayHomeAsUpEnabled(true);*/
        actionBar.setTitle("Abs");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        String[] excercise1 = {"Wide-Grip Pull-Up", "Wide-Grip Pull-Down", "T-Bar Row", "Seated Cable Row", "Close Grip Row", "One Arm Dumble Row", "Dead Lift"};
        String[] Detail = {"3 Set of 8-12 rep", "4 set of 12-15 rep", "3 set of 12,10,8 rep", "3 set of 10-12 rep", "4 set of 10-15 rep", "3 set of 10-12 rep", "4 set of 10,8,8,6"};
        ArrayList<User> arraylist = new ArrayList<User>();
        for (int i = 0; i < excercise1.length; i++) {
            User user = new User(excercise1[i], Detail[i]);
            arraylist.add(user);
        }
        final int[] imgs1 = {R.drawable.pullup_la, R.drawable.pulldown_la, R.drawable.tbar_la, R.drawable.seated_la, R.drawable.bend_la, R.drawable.onearm_la, R.drawable.dead_la};
        abscustom saruadapter = new abscustom(this, arraylist, imgs1);
        ListView sarulistview = (ListView) findViewById(R.id.listview);
        sarulistview.setAdapter(saruadapter);

        sarulistview.setOnItemClickListener(
                new android.widget.AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                Intent i0 = new Intent(Shoulder.this, pulluppic.class);
                                startActivity(i0);

                                break;
                            case 1:
                                Intent i1 = new Intent(Shoulder.this, widergrippic.class);
                                startActivity(i1);

                                break;
                            case 2:
                                Intent i2 = new Intent(Shoulder.this, pulldownpic.class);
                                startActivity(i2);

                                break;
                            case 3:
                                Intent i3 = new Intent(Shoulder.this, seatedcabelpic.class);
                                startActivity(i3);

                                break;
                            case 4:
                                Intent i4 = new Intent(Shoulder.this, bendpic.class);
                                startActivity(i4);

                                break;
                            case 5:
                                Intent i5 = new Intent(Shoulder.this, onearmpic.class);
                                startActivity(i5);

                                break;
                            case 6:
                                Intent i6 = new Intent(Shoulder.this, deadpic.class);
                                startActivity(i6);

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
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }

}

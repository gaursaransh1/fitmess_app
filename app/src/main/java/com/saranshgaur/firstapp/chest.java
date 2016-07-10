package com.saranshgaur.firstapp;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class chest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        /*ActionBar actionBar = getActionBar();
        *//*actionBar.setDisplayHomeAsUpEnabled(true);*//*
        actionBar.setTitle("Chest2");*/

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        String[] excercise1 = {"Wide-Grip Pull-Up", "Wide-Grip Pull-Down", "T-Bar Row", "Seated Cable Row", "Close Grip Row", "One Arm Dumble Row", "Dead Lift"};
        String[] Detail = {"3 Set of 8-12 rep", "4 set of 12-15 rep", "3 set of 12,10,8 rep", "3 set of 10-12 rep", "4 set of 10-15 rep", "3 set of 10-12 rep", "4 set of 10,8,8,6"};
        ArrayList<User> arraylist = new ArrayList<User>();
        for (int i = 0; i < excercise1.length; i++) {
            User user = new User(excercise1[i], Detail[i]);
            arraylist.add(user);
        }
        final int[] imgs1 = {R.drawable.pullup_la, R.drawable.pulldown_la, R.drawable.tbar_la, R.drawable.seated_la, R.drawable.bend_la, R.drawable.onearm_la, R.drawable.dead_la};
        chestcustom saruadapter = new chestcustom(this, arraylist, imgs1);
        ListView sarulistview = (ListView) findViewById(R.id.listview);
        sarulistview.setAdapter(saruadapter);

        sarulistview.setOnItemClickListener(
                new android.widget.AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                Intent i0 = new Intent(chest.this, pulluppic.class);
                                startActivity(i0);

                                break;
                            case 1:
                                Intent i1 = new Intent(chest.this, widergrippic.class);
                                startActivity(i1);

                                break;
                            case 2:
                                Intent i2 = new Intent(chest.this, pulldownpic.class);
                                startActivity(i2);

                                break;
                            case 3:
                                Intent i3 = new Intent(chest.this, seatedcabelpic.class);
                                startActivity(i3);

                                break;
                            case 4:
                                Intent i4 = new Intent(chest.this, bendpic.class);
                                startActivity(i4);

                                break;
                            case 5:
                                Intent i5 = new Intent(chest.this, onearmpic.class);
                                startActivity(i5);

                                break;
                            case 6:
                                Intent i6 = new Intent(chest.this, deadpic.class);
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
}

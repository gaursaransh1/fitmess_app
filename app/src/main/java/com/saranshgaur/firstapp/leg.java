package com.saranshgaur.firstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class leg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setContentView(R.layout.content_leg);
        String[] excercise = {"Wide-Grip Pull-Up", "Wide-Grip Pull-Down", "T-Bar Row", "Seated Cable Row", "Close Grip Row", "One Arm Dumble Row", "Dead Lift"};
       String[] Detail = {"3 Set of 8-12 rep","4 set of 12-15 rep","3 set of 12,10,8 rep","3 set of 10-12 rep","4 set of 10-15 rep","3 set of 10-12 rep","4 set of 10,8,8,6"};
        final int[] imgs = {R.drawable.pullup_la, R.drawable.pulldown_la, R.drawable.tbar_la, R.drawable.seated_la, R.drawable.bend_la, R.drawable.onearm_la, R.drawable.dead_la};
        //   final int[] icon = {R.drawable.icon, R.drawable.icon, R.drawable.icon, R.drawable.icon, R.drawable.icon, R.drawable.icon, R.drawable.icon};
        ListAdapter saruadapter = new legcustom(this, excercise, imgs);
        ListView sarulistview = (ListView) findViewById(R.id.saruview);
        sarulistview.setAdapter(saruadapter);
    }

}

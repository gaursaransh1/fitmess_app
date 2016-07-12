package com.saranshgaur.firstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by saransh gaur on 12-07-2016.
 */
public class armcustom extends ArrayAdapter<User> {
    private final ArrayList<User> excercise1;
    private final Context context;
    private int[] imgs1;
    public armcustom(Context context, ArrayList<User> excercise1, int[] imgs) {

        super(context, R.layout.armcustom_row, excercise1);

        this.excercise1 = excercise1;
        this.context = context;
        this.imgs1 = imgs;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View coustomView = inflater.inflate(R.layout.armcustom_row, parent, false);

        TextView mediumtext = (TextView) coustomView.findViewById(R.id.mediumtext);
        TextView backtext = (TextView) coustomView.findViewById(R.id.backtext);
        ImageView backview = (ImageView) coustomView.findViewById(R.id.backview);
        //      ImageView iconview = (ImageView) coustomView.findViewById(R.id.iconview);

        mediumtext.setText(excercise1.get(position).getMediumtext());
        backtext.setText(excercise1.get(position).getLargetext());
        backview.setImageResource(imgs1[position]);
        //      iconview.setImageResource(icon[position]);
        return coustomView;
    }
}
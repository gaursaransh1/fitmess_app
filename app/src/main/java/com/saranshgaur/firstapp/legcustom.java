package com.saranshgaur.firstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by saransh gaur on 04-07-2016.
 */
public class legcustom extends ArrayAdapter<String> {
    private int[] imgs;
    //   private String[] detail;
    //   private int[] icon;
    public legcustom(Context context, String[] excercise, int[] imgs) {
        super(context, R.layout.backcustom_row, excercise);
        this.imgs = imgs;
//        this.detail = detail;
//        this.icon = icon;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater saruinflator = LayoutInflater.from(getContext());
        View coustomView = saruinflator.inflate(R.layout.legcustom_row, parent, false);

        String excerciseitem = getItem(position);
        //      TextView mediumtext = (TextView) convertView.findViewById(R.id.mediumtext);
        TextView backtext = (TextView) coustomView.findViewById(R.id.sarutext);
        ImageView backview = (ImageView) coustomView.findViewById(R.id.saruimage);
        //      ImageView iconview = (ImageView) coustomView.findViewById(R.id.iconview);

        //      mediumtext.setText(detail[position]);
        backtext.setText(excerciseitem);
        backview.setImageResource(imgs[position]);
        //      iconview.setImageResource(icon[position]);
        return coustomView;
    }
}

package com.saranshgaur.firstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.saranshgaur.firstapp.R;

public class customadapter extends ArrayAdapter<String>{
    private int[] imgs;
    public customadapter(Context context, String[] excercise, int[] imgs) {
        super(context, R.layout.custom_row, excercise);
        this.imgs = imgs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater saruinflator = LayoutInflater.from(getContext());
        View coustomView = saruinflator.inflate(R.layout.custom_row, parent, false);

        String excerciseitem = getItem(position);
        TextView saruview = (TextView) coustomView.findViewById(R.id.sareview);
        ImageView saruimg = (ImageView) coustomView.findViewById(R.id.sareimage);
   //     ImageView iconview = (ImageView) coustomView.findViewById(R.id.iconview);

        saruview.setText(excerciseitem);
        saruimg.setImageResource(imgs[position]);
   //     iconview.setImageResource(icon[position]);
        return coustomView;
    }
}

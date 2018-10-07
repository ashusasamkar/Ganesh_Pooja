package com.example.ashjadhav.ganesh_pooja;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class My_Recipe_Adapter extends ArrayAdapter<String>{


    String[] prasad_name;
    Integer[] image_id;
    Activity context;
    LayoutInflater inflater;

    public My_Recipe_Adapter(Activity context, String[] recipe , Integer[] image ) {
        super(context,R.layout.my_recipelist,recipe);
        this.prasad_name=recipe;
        this.image_id=image;
        this.context=context;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        inflater=context.getLayoutInflater();

        View rowView=inflater.inflate(R.layout.my_recipelist, null,true);
        TextView titleText = (TextView) rowView.findViewById(R.id.textview);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageview);
        titleText.setText(prasad_name[i]);
        imageView.setImageResource(image_id[i]);
        return rowView;

    }
}

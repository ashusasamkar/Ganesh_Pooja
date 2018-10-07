package com.example.ashjadhav.ganesh_pooja;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class MyAdapterList extends ArrayAdapter<String>{
    String[] aarti_name;
    Integer[] image_id;
    Activity context;
    LayoutInflater inflater;

    public MyAdapterList(Activity context, String[] aarti , Integer[] image ) {
        super(context,R.layout.my_listview,aarti);
        this.aarti_name=aarti;
        this.image_id=image;
        this.context=context;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        inflater=context.getLayoutInflater();

        View rowView=inflater.inflate(R.layout.my_listview, null,true);
        TextView titleText = (TextView) rowView.findViewById(R.id.textview);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageview);
        titleText.setText(aarti_name[i]);
        imageView.setImageResource(image_id[i]);
        return rowView;

    }
}

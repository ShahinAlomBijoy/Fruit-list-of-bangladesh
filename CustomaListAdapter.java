package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomaListAdapter extends ArrayAdapter<String> {
    private Activity Context;
    private String[] fruits;
    private Integer[] image;


    public CustomaListAdapter(Activity context,String[] fruits,Integer[] image) {
        super(context,R.layout.mycustomlist,fruits);
        this.Context=context;
        this.fruits=fruits;
        this.image=image;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater = Context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mycustomlist, null, true);

        TextView fruitsTv = rowView.findViewById(R.id.name);
       ImageView imageTv=rowView.findViewById(R.id.imageId);
       fruitsTv.setText(fruits[position]);
       imageTv.setImageResource(image[position]);
        return rowView;
    }
}

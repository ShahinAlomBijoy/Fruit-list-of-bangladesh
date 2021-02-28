package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView mylistview;
String[] fruits={"Mango","Banana","Jackfruit","Apple","Litchi"};
Integer []image={R.drawable.m,R.drawable.b,R.drawable.j,R.drawable.a,R.drawable.l};
CustomaListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylistview=findViewById(R.id.listViewId);

        //ArrayAdapter<String> Adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,fruits);
        adapter= new CustomaListAdapter(this,fruits,image);
        mylistview.setAdapter(adapter);
    }
}
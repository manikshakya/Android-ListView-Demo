package com.manikshakya.listviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView myList = (ListView) findViewById(R.id.myList);

        final ArrayList<String> names = new ArrayList<String>();

        names.add("Hi");
        names.add("Hello");
        names.add("How are you?");
        names.add("I am fine.");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        myList.setAdapter(myAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Log.i("Name: ", names.get(i));

                Toast.makeText(getApplicationContext(), names.get(i), Toast.LENGTH_SHORT).show();
            }
        });

    }
}

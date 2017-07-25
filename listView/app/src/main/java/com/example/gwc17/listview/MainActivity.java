package com.example.gwc17.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView List = (ListView) findViewById(R.id.theList);
        Log.d(TAG, "onCreate: Started.");


        final ArrayList<String> names = new ArrayList<>();
        names.add("RESTURANT");
        names.add("FOOD TRUCKS");
        names.add("PICTURE PERFECT");
        names.add("MUSUEMS");
        names.add("COOL PLACES");
        names.add("FILMING LOCATIONS");
        names.add("ABOUT US");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, names);
        List.setAdapter(adapter);




        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("LocationName", List.getItemAtPosition(i).toString());
                startActivity(intent);







            }
        });
        List.setAdapter(adapter);

    }
}

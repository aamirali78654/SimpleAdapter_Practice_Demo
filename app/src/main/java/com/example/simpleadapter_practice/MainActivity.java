package com.example.simpleadapter_practice;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    ListView list_simple;
    int[] animal_image = {R.drawable.cat,R.drawable.catc,R.drawable.dogs,R.drawable.dolphin,
            R.drawable.ducklens,R.drawable.hedgehog,R.drawable.pexels,R.drawable.photo,
            R.drawable.tabbycat,R.drawable.cat,R.drawable.catc,R.drawable.dogs,R.drawable.dolphin,
            R.drawable.ducklens,R.drawable.hedgehog,R.drawable.pexels,R.drawable.photo,R.drawable.tabbycat};

    String[] animal_name = {"cat","catc","dogs","dolphin","ducklens","hedgehog","pexels","photo",
            "tabbycat","cat","catc","dogs","dolphin","ducklens","hedgehog","pexels","photo","tabbycat"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        list_simple = (ListView) findViewById(R.id.list_simple);
        ArrayList<HashMap<String , ?>> array_list = new ArrayList<HashMap<String , ?>>();
      //---------------HashMap declair by For LOOP use------------------>
        for(int i=0; i<animal_name.length; i++) {

            HashMap hm = new HashMap();
            hm.put("image", animal_image[i]);
            hm.put("name", animal_name[i]);

        array_list.add(hm);
        }
        //-----------------From and To arrays for SimpleAdapter----------------->
        String[] from = {"image","name"};
        int[] to = {R.id.image_view , R.id.text_view};
        //-----------------SimpleAdapter Usage---------------------------------->
        SimpleAdapter simpleA = new SimpleAdapter(this , array_list , R.layout.ui_simple_adapter , from , to);
        list_simple.setAdapter(simpleA);
       //------------------setOnItemClickListener for SimpleAdapter---------------->
        list_simple.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, animal_name[i], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
package com.example.simpleadapter_practice.two;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.simpleadapter_practice.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivityTwo extends AppCompatActivity {


    ListView list_view_two;
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
        setContentView(R.layout.activity_main_two);
        ArrayList<HashMap<String ,?>> array_two = new ArrayList<HashMap<String , ?>>();
     //<<------------------------HashMap Declair Arrays--------------->>
        for(int i=0; i<animal_name.length; i++)
        {
            HashMap hm = new HashMap();
            hm.put("image" , animal_image[i]);
            hm.put("name" , animal_name[i]);

            array_two.add(hm);
        }
        String[] from = {"image" , "name"};
        int[] to = {R.id.image_two , R.id.text_two};
        //<<--------------------custom SimpleAdapter------------------------->>
        CustomAdapter customAdapter = new CustomAdapter(this,array_two,R.layout.ui_customsimple_two , from , to);
        list_view_two.setAdapter(customAdapter);

    }
}
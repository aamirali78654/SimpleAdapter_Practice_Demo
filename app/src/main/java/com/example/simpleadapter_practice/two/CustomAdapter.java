package com.example.simpleadapter_practice.two;

import android.content.Context;
import android.widget.SimpleAdapter;
import java.util.List;
import java.util.Map;

public class CustomAdapter extends SimpleAdapter

   {
       public CustomAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to)

       {
           super(context, data, resource, from, to);
       }
   }

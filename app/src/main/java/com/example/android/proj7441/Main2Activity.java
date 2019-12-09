package com.example.android.proj7441;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity{
    int item = 0;

   // ImageView iv = findViewById(R.id.imageView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        String[] states = {"Alabama", "Alaska", "American Samoa", "Arizona", "Arkansas",
                "California", "Colorado", "Connecticut", "Delaware", "District of Columbia",
                "Florida", "Georgia", "Guam", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa",
                "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan",
                "Minnesota", "Minor Outlying Islands", "Mississippi", "Missouri", "Montana",
                "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York",
                "North Carolina", "North Dakota", "Northern Mariana Islands", "Ohio", "Oklahoma",
                "Oregon", "Pennsylvania", "Puerto Rico", "Rhode Island", "South Carolina",
                "South Dakota", "Tennessee", "Texas", "U.S. Virgin Islands", "Utah", "Vermont",
                "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};

      /* int [] imgs = {R.drawable.al, R.drawable.ca, R.drawable.nj, R.drawable.il, R.drawable.ma,
                R.drawable.tx, R.drawable.ny, R.drawable.ca, R.drawable.nj, R.drawable.il, R.drawable.ma,
                R.drawable.al, R.drawable.ca, R.drawable.nj, R.drawable.il,R.drawable.al, R.drawable.ca,
                R.drawable.tx, R.drawable.ny, R.drawable.ca, R.drawable.nj,R.drawable.al, R.drawable.ca,
                R.drawable.tx, R.drawable.ny, R.drawable.ca, R.drawable.nj,R.drawable.al, R.drawable.ca,
                R.drawable.tx, R.drawable.ny, R.drawable.al, R.drawable.ca,R.drawable.ca, R.drawable.nj,
                R.drawable.tx, R.drawable.ny, R.drawable.ca, R.drawable.nj, R.drawable.al, R.drawable.ca,
                R.drawable.al, R.drawable.ca, R.drawable.nj, R.drawable.il, R.drawable.ma,
                R.drawable.al, R.drawable.ca, R.drawable.nj, R.drawable.il, R.drawable.ma,
                R.drawable.al, R.drawable.ca, R.drawable.nj, R.drawable.il, R.drawable.ma
        }; */

        LinearLayout llmain = (LinearLayout) findViewById(R.id.llmain);
        for(int i =0;i<50;i++){
            TextView tv = new TextView(this);
            tv.setText(states[i]);
            llmain.addView(tv);
        }
        final TextView tv2 = findViewById(R.id.textView2);
        final ImageView iv = findViewById(R.id.imageView);
        llmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if(item == 50){
                  tv2.setText("You got 10/50!");
              }else{
                  item++;
                  tv2.setText("" + item + "/50");
                  iv.setImageResource(R.drawable.ca);
              }
            }
        });
    }
}

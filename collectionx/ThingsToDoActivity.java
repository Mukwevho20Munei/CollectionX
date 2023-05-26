package com.example.collectionx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class ThingsToDoActivity extends AppCompatActivity {
   ThingsAdapter thingsAdapter;
    Button Addbutton, expandAll;
    EditText getvalue;
    ArrayList<String> things = new ArrayList<>();
    private ThingsAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        //data to populate the recyclerView with

        things.add("Food Lovers Market");
        things.add("Shimza Festival");
        things.add("Color Splash");


        setOnClickListner();
        RecyclerView recyclerView = findViewById(R.id.recyclerViewThings);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        thingsAdapter = new ThingsAdapter(this, things, listener);
        recyclerView.setAdapter(thingsAdapter);
        Addbutton =(Button) findViewById(R.id.addItemsThings);
        getvalue =(EditText) findViewById(R.id.editItemsThings);
        expandAll = (Button) findViewById(R.id.ThingsExpand);

        //add items
        Addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String string = getvalue.getText().toString();
                things.add(string);
                thingsAdapter.notifyDataSetChanged();
                getvalue.setText(" ");
            }
        });

    }

    private void setOnClickListner() {
        listener = new ThingsAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), ThingsActivity.class);
                intent.putExtra("username",things.get(position));
                startActivity(intent);
            }
        };
    }
}
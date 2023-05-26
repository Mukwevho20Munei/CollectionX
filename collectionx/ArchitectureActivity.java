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

public class ArchitectureActivity extends AppCompatActivity {

    ArchitectureAdapter architectureAdapter;
    Button Addbutton;
    EditText getvalue;
    ArrayList<String> archers = new ArrayList<>();
    private ArchitectureAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architecture);

        //data to populate the recyclerView with

        archers.add("Abstract");
        archers.add("Adventure");
        archers.add("Nature");

        setOnClickListner();
        RecyclerView recyclerView = findViewById(R.id.recyclerViewArchi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        architectureAdapter = new ArchitectureAdapter(this, archers, listener);
        recyclerView.setAdapter(architectureAdapter);
        Addbutton =(Button) findViewById(R.id.addItemsArchi);
        getvalue =(EditText) findViewById(R.id.editItemsArchi);

        //add items
        Addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String string = getvalue.getText().toString();
                archers.add(string);
                architectureAdapter.notifyDataSetChanged();
                getvalue.setText(" ");


            }
        });
    }

    private void setOnClickListner() {
        listener = new ArchitectureAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), ThingsActivity.class);
                intent.putExtra("username",archers.get(position));
                startActivity(intent);
            }
        };
    }
}
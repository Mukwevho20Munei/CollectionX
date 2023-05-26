package com.example.collectionx;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.hardware.lights.LightState;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestuarantActivity extends AppCompatActivity {


    Adapter adapter;
    Button Addbutton;
    EditText getvalue;
    ArrayList<String> items = new ArrayList<>();
    ArrayAdapter myAdapter;
    private Adapter.RecyclerViewClickListener listener;

    Integer indexof;
    String item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restuarant);
//data to populate the recyclerView with

       items.add("McDonald");
       items.add("Ocean Basket");
       items.add("Chicken Linken");

        setOnClickListner();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, items, listener);
        recyclerView.setAdapter(adapter);
        Addbutton =(Button) findViewById(R.id.addItems);
        getvalue =(EditText) findViewById(R.id.editItems);


//add items
        Addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String string = getvalue.getText().toString();
                items.add(string);
                adapter.notifyDataSetChanged();
                getvalue.setText(" ");


            }
        });

    }
    private void setOnClickListner() {
        listener = new Adapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), ResLayoutActivity.class);
                intent.putExtra("username",items.get(position));
                startActivity(intent);
            }
        };
    }

}
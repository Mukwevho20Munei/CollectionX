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

public class FashionActivity extends AppCompatActivity {

    MyFashAdapter myFashAdapter;
    Button Addbutton;
    EditText getvalue;
    ArrayList<String> fashion = new ArrayList<>();
    private MyFashAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);

        //data to populate the recyclerView with

        fashion.add("Snickers");
        fashion.add("Nike");
        fashion.add("Adidas");

        setOnClickListner();
        RecyclerView recyclerView = findViewById(R.id.recyclerViewFashion);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myFashAdapter = new MyFashAdapter(this, fashion, listener);
        recyclerView.setAdapter(myFashAdapter);
        Addbutton =(Button) findViewById(R.id.addItemsFash);
        getvalue =(EditText) findViewById(R.id.editItemsFash);
//add items
        Addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String string = getvalue.getText().toString();
                fashion.add(string);
                myFashAdapter.notifyDataSetChanged();
                getvalue.setText(" ");


            }
        });
    }

    private void setOnClickListner() {
        listener = new MyFashAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), ThingsActivity.class);
                intent.putExtra("username",fashion.get(position));
                startActivity(intent);
            }
        };
    }
}
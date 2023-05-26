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

public class PhotographyActivity extends AppCompatActivity {
    PhotographyAdapter photographyAdapter;
    Button Addbutton;
    EditText getvalue;
    ArrayList<String> photo = new ArrayList<>();
    private PhotographyAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photography);

        //data to populate the recyclerView with

        photo.add("Snickers");
        photo.add("Nike");
        photo.add("Adidas");

        setOnClickListner();
        RecyclerView recyclerView = findViewById(R.id.recyclerViewPhoto);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        photographyAdapter = new PhotographyAdapter(this, photo, listener);
        recyclerView.setAdapter(photographyAdapter);
        Addbutton =(Button) findViewById(R.id.addItemsPhoto);
        getvalue =(EditText) findViewById(R.id.editItemsPhoto);
//add items
        Addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String string = getvalue.getText().toString();
                photo.add(string);
                photographyAdapter.notifyDataSetChanged();
                getvalue.setText(" ");
            }
        });
    }
    private void setOnClickListner() {
        listener = new PhotographyAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(),CustomPhotography.class);
                intent.putExtra("username",photo.get(position));
                startActivity(intent);
            }
        };
    }
}
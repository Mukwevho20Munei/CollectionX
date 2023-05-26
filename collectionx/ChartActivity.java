package com.example.collectionx;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class ChartActivity extends AppCompatActivity {
//Initialize variable
    BarChart barChart;
    PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);


        //assign
        barChart = findViewById(R.id.bar_chart);
        pieChart = findViewById(R.id.pie_chart);
        pieChart.setUsePercentValues(true);



        //initialize array
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        ArrayList<PieEntry> pieEntries = new ArrayList<>();

        //Use for loop
        for (int i = 2; i <8; i++){
            //convert to float
            float value = (float) (i*15.0);
            //initialize bar chart entry
            BarEntry barEntry = new BarEntry(i,value);
            //initialize pie chart entry
            PieEntry pieEntry = new PieEntry(i,value);
            //add values in array list
            barEntries.add(barEntry);
            pieEntries.add(pieEntry);

        }
        //initialize bar data set
        BarDataSet barDataSet = new BarDataSet(barEntries, "Categories");
        //set colours
        barDataSet.setColors(ColorTemplate.LIBERTY_COLORS);
        //hide draw value
        barChart.setData(new BarData(barDataSet));
        barDataSet.setDrawValues(false);
        //set bar data
        barChart.animateY(5000);
        //set description text and color
        barChart.getDescription().setText("Category Chart");
        barChart.getDescription().setTextColor(Color.BLUE);

        //initialize pie data set
        PieDataSet pieDataSet = new PieDataSet(pieEntries, "Items");
        //set colors
        pieDataSet.setColors(ColorTemplate.LIBERTY_COLORS);
        //set bar data
        pieChart.setData(new PieData(pieDataSet));
        //set animation
        pieChart.animateXY(5000,5000);
        //hide description
        pieChart.getDescription().setEnabled(false);


    }
}
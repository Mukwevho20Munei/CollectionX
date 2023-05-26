package com.example.collectionx;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;

public class DynamicRVModel {

  public class DynamicRVAdapter extends RecyclerView.Adapter<DynamicRVAdapter.DynamicRvHolder>{
        public ArrayList<DynamicRVModel> dynamicRVModels;

        public DynamicRVAdapter(ArrayList<DynamicRVModel> dynamicRVModels){
            this.dynamicRVModels = dynamicRVModels;
        }
        public class DynamicRvHolder extends RecyclerView.ViewHolder {



            public DynamicRvHolder(@NonNull View itemView) {

                super(itemView);
                //imageview = itemview.findbyview(r.id.fileename);
                //textview = ...
                //relativelayout = itemview.findbyview.(r.id.filename)
            }
        }
        @NonNull
        @Override
        public DynamicRVAdapter.DynamicRvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_home,parent,false);
            DynamicRvHolder dynamicRvHolder = new DynamicRvHolder(view);
            return dynamicRvHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull DynamicRVAdapter.DynamicRvHolder holder, int position) {
            DynamicRVModel currentItem =dynamicRVModels.get(position);
            //holder.Imageview.setImageResource(currentItem.getImg);

        }

        @Override
        public int getItemCount() {
            return 0;
        }


    }
}

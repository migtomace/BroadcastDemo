package com.websitesinseattle.broadcastdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewholder> {

    private ArrayList<IncomingNumber> arrayList = new ArrayList<>();

    public RecyclerAdapter(ArrayList<IncomingNumber> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {

        holder.id.setText(Integer.toString(arrayList.get(position).getId()));
        holder.number.setText(arrayList.get(position).getNumber());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder{
        TextView id, number;
        public MyViewholder(View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.txtId);
            number = itemView.findViewById(R.id.txtNumber);
        }
    }
}

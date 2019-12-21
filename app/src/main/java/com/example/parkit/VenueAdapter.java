package com.example.parkit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VenueAdapter extends RecyclerView.Adapter<VenueAdapter.MyViewHolder> {

    private List<Location> venueList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView vName, vAddress, vDesc;

        public MyViewHolder(View view){
            super(view);
            vName = (TextView) view.findViewById(R.id.lblVenueName);
            vAddress = (TextView) view.findViewById(R.id.lblAddress);
            vDesc = (TextView) view.findViewById(R.id.lblDesc);
        }
    }
    public VenueAdapter(List<Location> venueList){
        this.venueList = venueList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.venue_list,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        Location location = venueList.get(position);
        holder.vName.setText(location.getVenueName());
        holder.vAddress.setText(location.getLocAddress());
        holder.vDesc.setText(location.getDesc());
    }

    @Override
    public int getItemCount() {
        return venueList.size();
    }
}

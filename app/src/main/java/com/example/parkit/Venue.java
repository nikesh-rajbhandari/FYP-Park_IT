package com.example.parkit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Venue extends AppCompatActivity{
    private List<Location> venueList = new ArrayList<>();
    private RecyclerView recyclerView;
    private VenueAdapter vAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue);

        recyclerView = findViewById(R.id.recycler_view);

        vAdapter = new VenueAdapter(venueList);
        RecyclerView.LayoutManager vLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(vLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(vAdapter);
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Location venue = venueList.get(position);
                Toast.makeText(getApplicationContext(), venue.getVenueName() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

            prepareVenueData();
    }

    private void prepareVenueData() {
        for(int i=0; i<10;i++){
            Location venue = new Location("Raj", "24.707145 85.135644", "Spacious place for parking");
            venueList.add(venue);
            vAdapter.notifyDataSetChanged();
        }


    }


}

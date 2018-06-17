package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationItemView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Information> info = new ArrayList<Information>();
        info.add(new Information("Pantera", "Texas"));
        info.add(new Information("Slipknot", "Iowa"));
        info.add(new Information("Metallica", "California"));
        info.add(new Information("Anthrax", "New York"));
        info.add(new Information("Slayer", "California"));
        info.add(new Information("Behemoth", "Poland"));
        info.add(new Information("Lamb of God", "Virginia"));
        info.add(new Information("Alice in Chains", "Washignton"));
        info.add(new Information("Tool", "California"));
        info.add(new Information("A Perfect Cicle", "California"));


        InformationAdapter adapter = new InformationAdapter(this, info);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        //Navigation Listeners. I am hoping to be reuse the code below, but I don't know how, please advice.

        BottomNavigationItemView homeButton = (BottomNavigationItemView) findViewById(R.id.navigation_home);
        BottomNavigationItemView artistsButton = (BottomNavigationItemView) findViewById(R.id.navigation_artists);
        BottomNavigationItemView songsButton = (BottomNavigationItemView) findViewById(R.id.navigation_songs);

        // Set a click listener
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link MainActivity}
                Intent mainIntent = new Intent(ArtistsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainIntent);

            }
        });
        // Set a click listener
        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link MainActivity}
                Intent mainIntent = new Intent(ArtistsActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(mainIntent);

            }
        });
        // Set a click listener
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link MainActivity}
                Intent mainIntent = new Intent(ArtistsActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(mainIntent);

            }
        });

    }


}

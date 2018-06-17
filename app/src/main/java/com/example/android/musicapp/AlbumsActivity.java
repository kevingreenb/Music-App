package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationItemView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Information> info = new ArrayList<Information>();
        info.add( new Information("Midian","Cradle of Filth"));
        info.add( new Information("Foo Fighters","Foo Fighters"));
        info.add( new Information("Cowboys from Hell","Pantera"));
        info.add( new Information("In Your Honor","Foo Fighters"));
        info.add( new Information("Waiting For My Rocket to Come","Jason Mraz"));
        info.add( new Information("The Doomed","A Perfect Circle"));
        info.add( new Information("Hybrid Theory","Linkin Park"));
        info.add( new Information("Mer De Noms","A Perfect Circle"));
        info.add( new Information("Is This It","The Strokes"));
        info.add( new Information("One By One","Foo Fighters"));
        info.add( new Information("Thirteen Step","A Perfect Circle"));
        info.add( new Information("10 000 Days","Tool"));
        info.add( new Information("Hillbilly Deluxe","Rob Zombie"));
        info.add( new Information("Cage the Elephant","Cage the Elephant"));
        info.add( new Information("Meteora","Linkin Park"));

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
                Intent mainIntent = new Intent(AlbumsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainIntent);

            }
        });
        // Set a click listener
        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link MainActivity}
                Intent mainIntent = new Intent(AlbumsActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(mainIntent);

            }
        });
        // Set a click listener
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link MainActivity}
                Intent mainIntent = new Intent(AlbumsActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(mainIntent);

            }
        });
    }
}

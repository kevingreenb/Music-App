package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationItemView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class GenresActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Information> info = new ArrayList<Information>();
        info.add( new Information("Metal","Genre"));
        info.add( new Information("Salsa","Genre"));
        info.add( new Information("Rock","Genre"));
        info.add( new Information("Rap","Genre"));
        info.add( new Information("Electro","Genre"));
        info.add( new Information("House","Genre"));
        info.add( new Information("Romantic","Genre"));
        info.add( new Information("Classic","Genre"));
        info.add( new Information("Grunge","Genre"));
        info.add( new Information("Hio Hop","Genre"));
        info.add( new Information("Thrash","Genre"));
        info.add( new Information("Instrumental","Genre"));
        info.add( new Information("Pop","Genre"));
        info.add( new Information("K-Pop","Genre"));

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
                Intent mainIntent = new Intent(GenresActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainIntent);

            }
        });
        // Set a click listener
        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link MainActivity}
                Intent mainIntent = new Intent(GenresActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(mainIntent);

            }
        });
        // Set a click listener
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link MainActivity}
                Intent mainIntent = new Intent(GenresActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(mainIntent);

            }
        });

    }
}

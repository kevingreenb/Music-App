package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Views for the button.
        Button artistsButton = (Button) findViewById(R.id.artistButton);
        Button albumsButton = (Button) findViewById(R.id.albumsButton);
        Button genresButton = (Button) findViewById(R.id.genresButton);
        Button songsButton = (Button) findViewById(R.id.songsButton);

        // Set a click listener
        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(numbersIntent);

            }
        });

        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(numbersIntent);

            }
        });

        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(numbersIntent);

            }
        });

        genresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, GenresActivity.class);

                // Start the new activity
                startActivity(numbersIntent);

            }
        });

    }
}

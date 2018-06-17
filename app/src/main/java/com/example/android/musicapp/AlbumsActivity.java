package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    }
}

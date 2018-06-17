package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    }


}

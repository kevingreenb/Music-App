package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    }
}

package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Information> info = new ArrayList<Information>();
        info.add(new Information("Sonne","Rammstein"));
        info.add(new Information("Duality","Slipknot"));
        info.add(new Information("Toxicity","System of a Down"));
        info.add(new Information("Mutter","Rammstein"));
        info.add(new Information("Sonne","Rammstein"));
        info.add(new Information("Before I Forget","Slipknot"));
        info.add(new Information("Walk","Pantera"));
        info.add(new Information("Cowboys From Hell","Pantera"));
        info.add(new Information("One","Metallica"));
        info.add(new Information("Reign in Blood","Slayer"));
        info.add(new Information("Evil Twin","Anthrax"));
        info.add(new Information("Du Hast","Rammstein"));
        info.add(new Information("Laid to Rest","Lamb of God"));
        info.add(new Information("Redneck","Lamb of God"));
        info.add(new Information("Lucifer","Behemoth"));
        info.add(new Information("Dig","Mudvayne"));
        info.add(new Information("Push it","Static X"));
        info.add(new Information("I'm with Stupid","Static X"));
        info.add(new Information("Scar Tissue","Red Hot Chilly Peppers"));
        info.add(new Information("Beverly Hills","Weezer"));
        info.add(new Information("Domination","Pantera"));
        info.add(new Information("Nothing Else Matters","Metallica"));
        info.add(new Information("Neighbor","Ugly Kid Joe"));
        info.add(new Information("Blind","Korn"));

        InformationAdapter adapter = new InformationAdapter(this, info);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}

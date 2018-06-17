package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InformationAdapter extends ArrayAdapter<Information> {

    public InformationAdapter(Context context, ArrayList<Information> info) {
        super(context, 0, info);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        Information currentWord = getItem(position);

        TextView mainTextView = (TextView) listItemView.findViewById(R.id.main_text);

        mainTextView.setText(currentWord.getFirstLine());

        TextView secondaryTextView = (TextView) listItemView.findViewById(R.id.secondary_text);

        secondaryTextView.setText(currentWord.getSecondLine());

        return listItemView;
    }
}

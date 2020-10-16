package com.nishat00.hnrsm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class myListView extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] maintitle;

    public myListView(Activity context, String[] maintitle) {
        super(context, R.layout.listview, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);

        titleText.setText(maintitle[position]);

        return rowView;

    };
}



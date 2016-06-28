package com.example.listview.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by blacknaml on 22/06/16.
 */
public class MyAdapter extends ArrayAdapter {

    public MyAdapter(Context context, String[] data) {
        super(context, R.layout.list_item, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(getContext());
        view = inflater.inflate(R.layout.list_item_new, parent, false);

        TextView tvItem = (TextView) view.findViewById(R.id.tvItem);
        String data = (String) getItem(position);
        tvItem.setText(data);

        return view;
    }
}

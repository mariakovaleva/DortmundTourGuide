package com.example.mariakovaleva.dortmundtourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private View listItemView;

    public PlaceAdapter(Activity context, ArrayList<Place> placeArrayList) {
        super(context, 0, placeArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_place, parent, false);
        }

        Place currentPlace = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_image_view);

        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentPlace.getTitleTextId());

        TextView contentTextView = (TextView) listItemView.findViewById(R.id.content_text_view);
        contentTextView.setText(currentPlace.getContentTextId());

        return listItemView;
    }
}

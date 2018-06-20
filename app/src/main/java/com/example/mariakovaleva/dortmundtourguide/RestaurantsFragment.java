package com.example.mariakovaleva.dortmundtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayList<Place> restaurants = new ArrayList<Place>(Arrays.asList(
                new Place(R.drawable.depothek, R.string.restaurant_title_depothek, R.string.restaurant_content_depothek),
                new Place(R.drawable.suppenfabrik, R.string.restaurant_title_suppenfabrik, R.string.restaurant_content_suppenfabrik),
                new Place(R.drawable.hohoffs, R.string.restaurant_title_hohoffs, R.string.restaurant_content_hohoffs)));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.fragment_list);

        listView.setAdapter(placeAdapter);


        return rootView;
    }

}

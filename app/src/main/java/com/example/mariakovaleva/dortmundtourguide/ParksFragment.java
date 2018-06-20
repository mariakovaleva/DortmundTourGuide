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
public class ParksFragment extends Fragment {

    public ParksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayList<Place> parks = new ArrayList<Place>(Arrays.asList(
                new Place(R.drawable.westpark, R.string.park_title_westpark, R.string.park_content_westpark),
                new Place(R.drawable.westfalenpark, R.string.park_title_westfalenpark, R.string.park_content_westfalenpark),
                new Place(R.drawable.rombergpark, R.string.park_title_rombergpark, R.string.park_content_rombergpark)));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), parks);

        ListView listView = (ListView) rootView.findViewById(R.id.fragment_list);

        listView.setAdapter(placeAdapter);


        return rootView;
    }

}

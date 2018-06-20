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
public class ClubsFragment extends Fragment {


    public ClubsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayList<Place> clubs = new ArrayList<Place>(Arrays.asList(
                new Place(R.string.club_title_daddy, R.string.club_content_daddy),
                new Place(R.string.club_title_spirit, R.string.club_content_spirit),
                new Place(R.string.club_title_burgtorclub, R.string.club_content_burgtorclub)));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), clubs);

        ListView listView = (ListView) rootView.findViewById(R.id.fragment_list);

        listView.setAdapter(placeAdapter);


        return rootView;
    }

}

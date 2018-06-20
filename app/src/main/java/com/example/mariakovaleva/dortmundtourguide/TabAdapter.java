package com.example.mariakovaleva.dortmundtourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private Context mContext;

    public TabAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BarsFragment();
        } else if (position == 1) {
            return new ClubsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new ParksFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return mContext.getString(R.string.category_bars);
        } else if (position == 1) {
            return mContext.getString(R.string.category_clubs);
        } else if (position == 2) {
            return mContext.getString(R.string.category_restaurants);
        } else {
            return mContext.getString(R.string.category_parks);
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

}

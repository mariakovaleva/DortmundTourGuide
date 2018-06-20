package com.example.mariakovaleva.dortmundtourguide;

public class Place {

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mTitleTextId;
    private int mContentTextId;

    public Place(int imageResourceId, int titleTextId, int contentTextId) {
        mImageResourceId = imageResourceId;
        mTitleTextId = titleTextId;
        mContentTextId = contentTextId;
    }

    public Place(int titleTextId, int contentTextId) {
        mTitleTextId = titleTextId;
        mContentTextId = contentTextId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getTitleTextId() {
        return mTitleTextId;
    }

    public int getContentTextId() {
        return mContentTextId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

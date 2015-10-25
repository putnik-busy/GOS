package com.just_app.gos;


import java.util.UUID;

public class Otvet {
    private UUID mID;
    private String mTitle;
    private int mButtonId;

    public Otvet(){
        mID=UUID.randomUUID();
    }

    @Override
    public String toString() {
        return mTitle;
    }

    public UUID getmID() {
        return mID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Integer getmButtonId() {
        return mButtonId;
    }

    public void setmButtonId(int mButtonId) {
        this.mButtonId = mButtonId;
    }
}

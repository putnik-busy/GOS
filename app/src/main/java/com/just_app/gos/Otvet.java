package com.just_app.gos;


import java.util.UUID;

public class Otvet {
    private UUID mID;
    private String mTitle;
    private String mNamePredmet;

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

    public String getmNamePredmet() {
        return mNamePredmet;
    }

    public void setmNamePredmet(String mNamePredmet) {
        this.mNamePredmet = mNamePredmet;
    }
}

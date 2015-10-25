package com.just_app.gos;


public class Desc  {
    private String mDesc;
    private int mButtonId;

    @Override
    public String toString() {
        return mDesc;
    }

    public String getmDesc() {
        return mDesc;
    }

    public int getmButtonId() {
        return mButtonId;
    }

    public void setmButtonId(int mButtonId) {
        this.mButtonId = mButtonId;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }
}

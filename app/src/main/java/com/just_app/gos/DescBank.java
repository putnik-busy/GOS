package com.just_app.gos;


import android.content.Context;

import java.util.ArrayList;

public class DescBank {

    private static DescBank sBank;

    private Context mContext;

    private ArrayList<Desc> mDesc;

    private DescBank(Context mContext){
        this.mContext=mContext;

        mDesc= new ArrayList<Desc>();
        String[] algebra_title = mContext.getResources().getStringArray(R.array.algebra_title);
        for(int i=0; i<algebra_title.length;i++){
            Desc t = new Desc();
            t.setmDesc(algebra_title[i]);
            mDesc.add(t);
        }
    }

    public static DescBank get(Context c){
        if (sBank==null){
            sBank=new DescBank(c.getApplicationContext());
        }
        return  sBank;
    }

    public ArrayList<Desc> getmDesc() {
        return mDesc;
    }
}

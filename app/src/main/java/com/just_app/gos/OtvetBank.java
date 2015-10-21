package com.just_app.gos;


import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

public class OtvetBank {
    private ArrayList<Otvet> mOtvet;
    private static OtvetBank sOtvetBank;
    private Context mAppContext;

    private ListTem[] listTems = new ListTem[]{
            new ListTem(R.string.tema_1),
            new ListTem(R.string.tema_2),
    };
    private int mIndex=0;

    private  OtvetBank (Context mAppContext){
        this.mAppContext=mAppContext;
        mOtvet= new ArrayList<Otvet>();



        for(int i=0; i<10;i++){
            Otvet c = new Otvet();
            c.setmTitle("Предмет №" + i);
            mOtvet.add(c);
        }

    }

    public static OtvetBank get(Context c){
        if (sOtvetBank==null){
            sOtvetBank=new OtvetBank(c.getApplicationContext());
        }
        return  sOtvetBank;
    }
    public ArrayList<Otvet> getOtvet(){
        return  mOtvet;
    }
    public Otvet getOtvet(UUID id){
        for(Otvet c:mOtvet){
            if (c.getmID().equals(id))
                return c;
        }
        return null;
    }
}

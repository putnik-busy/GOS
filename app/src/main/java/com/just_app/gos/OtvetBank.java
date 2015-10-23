package com.just_app.gos;

import android.content.Context;
import java.util.ArrayList;
import java.util.UUID;

public class OtvetBank {
    private ArrayList<Otvet> mOtvet;
    private static OtvetBank sOtvetBank;
    private Context mAppContext;


    private  OtvetBank (Context mAppContext){
        this.mAppContext=mAppContext;
        mOtvet= new ArrayList<Otvet>();

       String[] algebra = mAppContext.getResources().getStringArray(R.array.algebra);

        for(int i=0; i<algebra.length;i++){
            Otvet c = new Otvet();
            c.setmTitle(algebra[i]);
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
    public Otvet getOtvets(UUID id){
        for(Otvet c:mOtvet){
            if (c.getmID().equals(id))
                return c;
        }
        return null;
    }



}

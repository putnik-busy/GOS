package com.just_app.gos;


import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.UUID;

public class OtvetListFragment extends ListFragment {
    private static final String TAG = "OtvetListFragment";
    private ArrayList<Otvet> mOtvet;
    private String mNamePredmet;
    private   Otvet mGetName;

    public static final String EXTRA_ANSWER_ID =
            "com.just_app.gos.answer_1";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.predmet_title);

        mOtvet =OtvetBank.get(getActivity()).getOtvet();

        TemAdapter adapter = new TemAdapter(mOtvet);
        setListAdapter(adapter);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Otvet c = ((TemAdapter)getListAdapter()).getItem(position);
        mNamePredmet=mGetName.getmNamePredmet();

        Intent i = new Intent(getActivity(),TitleOtvetActivity.class);
        i.putExtra(TitleOtvetFragment.EXTRA_TEM_ID,c.getmID());

        i.putExtra(TitleOtvetFragment.EXTRA_PREDMET_ID,mNamePredmet);

        startActivity(i);
    }

    private class TemAdapter extends  ArrayAdapter<Otvet>{

        public TemAdapter(ArrayList<Otvet> otvets){
            super(getActivity(),0,otvets);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Если мы не получили представление, заполняем его
            if (convertView==null){
                convertView=getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_tem,null);
            }
            // Настройка представления для объекта Otvet

            Otvet c = getItem(position);

            TextView titletextView=
                    (TextView)convertView.findViewById(R.id.tem_title);
            titletextView.setText(c.getmTitle());
            return convertView;
        }
    }


}

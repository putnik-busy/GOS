package com.just_app.gos;


import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class OtvetListFragment extends ListFragment {
    private static final String TAG = "OtvetListFragment";
    private ArrayList<Otvet> mOtvet;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.predmet_title);
       /* mOtvet =OtvetBank.get(getActivity()).getOtvet();

        ArrayAdapter<Otvet>adapter =
                new ArrayAdapter<Otvet>(getActivity(),
                        android.R.layout.simple_expandable_list_item_1,
                        mOtvet);
        setListAdapter(adapter);*/

    }



    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Otvet c = (Otvet)(getListAdapter()).getItem(position);

    }
}

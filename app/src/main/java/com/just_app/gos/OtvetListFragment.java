package com.just_app.gos;


import android.app.ListFragment;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class OtvetListFragment extends ListFragment {
    public static final String EXTRA_FILENAME =
            "com.just_app.gos.answer_1";
    private ArrayList<Otvet> mOtvet;
    private  Subject mSubject;



    public static OtvetListFragment newInstance(String filename) {
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_FILENAME, filename);
        OtvetListFragment fragment = new OtvetListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.predmet_title);

        String mFileName = (String)getArguments().
                getSerializable(EXTRA_FILENAME);

        AssetManager mgr = getActivity().getAssets();
        ObjectMapper mapper = new ObjectMapper();

        try {
            InputStream inputStream;
            inputStream = mgr.open(mFileName);
            mSubject = mapper.readValue(inputStream, Subject.class);
            Log.d("Test", "subject name =" + mSubject.name);
        } catch (IOException e) {
            e.printStackTrace();
        }

        mOtvet =OtvetBank.get(getActivity()).getOtvet();

       TemAdapter adapter = new TemAdapter(mSubject.questions);
        Log.d("Test", String.valueOf(mSubject.questions.size()));
        setListAdapter(adapter);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Question question = ((TemAdapter)getListAdapter()).getItem(position);
        Intent i = new Intent(getActivity(),TitleOtvetActivity.class);
        i.putExtra(TitleOtvetFragment.EXTRA_TEM_ID,mSubject.questions);

        startActivity(i);
    }


     private class TemAdapter extends  ArrayAdapter<Question>{

        public TemAdapter(ArrayList<Question> otvets){
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

            Question c = getItem(position);
            TextView titletextView=
                    (TextView)convertView.findViewById(R.id.tem_title);
            titletextView.setText(c.question);
            return convertView;
        }
    }


}

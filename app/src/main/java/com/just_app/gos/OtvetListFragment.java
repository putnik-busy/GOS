package com.just_app.gos;


import android.app.ListFragment;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class OtvetListFragment extends ListFragment {
    public static final String EXTRA_FILENAME =
            "com.just_app.gos.answer_1";
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
        String mFileName = (String)getArguments().
                getSerializable(EXTRA_FILENAME);

        AssetManager mgr = getActivity().getAssets();
        ObjectMapper mapper = new ObjectMapper();

        try {
            InputStream inputStream;
            inputStream = mgr.open(mFileName);
            mSubject = mapper.readValue(inputStream, Subject.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
       TemAdapter adapter = new TemAdapter(mSubject.questions);
        setListAdapter(adapter);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Question question = ((TemAdapter)getListAdapter()).getItem(position);
        Intent i = new Intent(getActivity(),TitleOtvetActivity.class);
        i.putExtra(TitleOtvetFragment.EXTRA_QUESTION_ANSWER,question.answer);
        i.putExtra(TitleOtvetFragment.EXTRA_QUESTION_NAME,question.question);
        startActivity(i);
    }

     private class TemAdapter extends  ArrayAdapter<Question>{

        public TemAdapter(ArrayList<Question> otvets){
            super(getActivity(),0,otvets);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView==null){
                convertView=getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_tem,null);
            }
            Question c = getItem(position);
            TextView titletextView=
                    (TextView)convertView.findViewById(R.id.tem_title);
            titletextView.setText(c.question);
            return convertView;
        }
    }


}

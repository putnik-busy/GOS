package com.just_app.gos;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class PredmetFragment extends Fragment {
    int[] bt_ids;
    Button[] bt_array;
    private Button mButton1,mButton2,mButton3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_predmet,container,false);

        bt_ids= new int[]{R.id.predmet_1,R.id.predmet_2,R.id.predmet_3};

        bt_array= new Button[]{mButton1,mButton2,mButton3};
        int len = bt_array.length;

      View.OnClickListener onClickListener = new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              switch (v.getId()){
                  case R.id.predmet_1:
                      Intent i = new Intent(getActivity(),OtvetListActivity.class);
                      i.putExtra(OtvetListFragment.EXTRA_FILENAME,"matan.xml" );
                      startActivity(i);
                      break;
                  case R.id.predmet_2:
                      Intent j = new Intent(getActivity(),OtvetListActivity.class);
                      //j.putExtra(OtvetListFragment.EXTRA_ANSWER_ID, R.id.predmet_2);
                      startActivity(j);
                      break;
                  case R.id.predmet_3:
                      Intent a = new Intent(getActivity(),OtvetListActivity.class);
                      //a.putExtra(OtvetListFragment.EXTRA_ANSWER_ID,R.id.predmet_3);
                      startActivity(a);
                      break;
              }
          }
      };

        for(int i=0;i<len;i++){
            bt_array[i]=(Button)v.findViewById(bt_ids[i]);
            bt_array[i].setOnClickListener(onClickListener);
        }
        return v;
    }
}

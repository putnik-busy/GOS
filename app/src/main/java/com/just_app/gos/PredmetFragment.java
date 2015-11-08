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
    private Button mButton1,mButton2,mButton3,mButton4,mButton5,mButton6,mButton7,
            mButton8,mButton9,mButton10,mButton11,mButton12,mButton13;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_predmet,container,false);

        bt_ids= new int[]{R.id.predmet_1,R.id.predmet_2,R.id.predmet_3,R.id.predmet_4,
                R.id.predmet_5,R.id.predmet_6,R.id.predmet_7,R.id.predmet_8,R.id.predmet_9,
                R.id.predmet_10,R.id.predmet_11,R.id.predmet_12,R.id.predmet_13};

        bt_array= new Button[]{mButton1,mButton2,mButton3,mButton4,mButton5,
                mButton6,mButton7,mButton8,mButton9,mButton10,mButton11,mButton12,mButton13};
        int len = bt_array.length;

      View.OnClickListener onClickListener = new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              switch (v.getId()){
                  case R.id.predmet_1:
                      Intent p1 = new Intent(getActivity(),OtvetListActivity.class);
                      p1.putExtra(OtvetListFragment.EXTRA_FILENAME, "matan.xml");
                      startActivity(p1);
                      break;
                  case R.id.predmet_2:
                      Intent p2 = new Intent(getActivity(),OtvetListActivity.class);
                      p2.putExtra(OtvetListFragment.EXTRA_FILENAME, "algebra.xml");
                      startActivity(p2);
                      break;
                  case R.id.predmet_3:
                      Intent p3 = new Intent(getActivity(),OtvetListActivity.class);
                      p3.putExtra(OtvetListFragment.EXTRA_FILENAME,"inform.xml" );
                      startActivity(p3);
                      break;
                  case R.id.predmet_4:
                      Intent p4 = new Intent(getActivity(),OtvetListActivity.class);
                      p4.putExtra(OtvetListFragment.EXTRA_FILENAME,"difur.xml" );
                      startActivity(p4);
                      break;
                  case R.id.predmet_5:
                      Intent p5 = new Intent(getActivity(),OtvetListActivity.class);
                      p5.putExtra(OtvetListFragment.EXTRA_FILENAME,"diskretmat.xml" );
                      startActivity(p5);
                      break;
                  case R.id.predmet_6:
                      Intent p6 = new Intent(getActivity(),OtvetListActivity.class);
                      p6.putExtra(OtvetListFragment.EXTRA_FILENAME,"terver.xml" );
                      startActivity(p6);
                      break;
                  case R.id.predmet_7:
                      Intent p7 = new Intent(getActivity(),OtvetListActivity.class);
                      p7.putExtra(OtvetListFragment.EXTRA_FILENAME,"sppo.xml" );
                      startActivity(p7);
                      break;
                  case R.id.predmet_8:
                      Intent p8 = new Intent(getActivity(),OtvetListActivity.class);
                      p8.putExtra(OtvetListFragment.EXTRA_FILENAME,"bd.xml" );
                      startActivity(p8);
                      break;
                  case R.id.predmet_9:
                      Intent p9 = new Intent(getActivity(),OtvetListActivity.class);
                      p9.putExtra(OtvetListFragment.EXTRA_FILENAME,"yap.xml" );
                      startActivity(p9);
                      break;
                  case R.id.predmet_10:
                      Intent p10 = new Intent(getActivity(),OtvetListActivity.class);
                      p10.putExtra(OtvetListFragment.EXTRA_FILENAME,"umf.xml" );
                      startActivity(p10);
                      break;
                  case R.id.predmet_11:
                      Intent p11 = new Intent(getActivity(),OtvetListActivity.class);
                      p11.putExtra(OtvetListFragment.EXTRA_FILENAME,"mo.xml" );
                      startActivity(p11);
                      break;
                  case R.id.predmet_12:
                      Intent p12 = new Intent(getActivity(),OtvetListActivity.class);
                      p12.putExtra(OtvetListFragment.EXTRA_FILENAME,"ti.xml" );
                      startActivity(p12);
                      break;
                  case R.id.predmet_13:
                      Intent p13 = new Intent(getActivity(),OtvetListActivity.class);
                      p13.putExtra(OtvetListFragment.EXTRA_FILENAME,"chm.xml" );
                      startActivity(p13);
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

package com.just_app.gos;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PredmetFragment extends Fragment {
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_predmet,container,false);

        mButton1=(Button)v.findViewById(R.id.predmet_1);
        mButton2=(Button)v.findViewById(R.id.predmet_2);
        mButton3=(Button)v.findViewById(R.id.predmet_3);

      View.OnClickListener onClickListener = new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              switch (v.getId()){
                  case R.id.predmet_1:
                      Intent i = new Intent(getActivity(),OtvetListActivity.class);
                      i.putExtra(OtvetListFragment.EXTRA_ANSWER_ID,R.id.predmet_1);
                      startActivity(i);
                      break;
                  case R.id.predmet_2:
                      Intent j = new Intent(getActivity(),OtvetListActivity.class);
                      j.putExtra(OtvetListFragment.EXTRA_ANSWER_ID, R.id.predmet_2);
                      startActivity(j);
                      break;
                  case R.id.predmet_3:
                      Intent a = new Intent(getActivity(),OtvetListActivity.class);
                      a.putExtra(OtvetListFragment.EXTRA_ANSWER_ID,R.id.predmet_3);
                      startActivity(a);
                      break;
              }
          }
      };

        mButton1.setOnClickListener(onClickListener);
        mButton2.setOnClickListener(onClickListener);
        mButton3.setOnClickListener(onClickListener);

        return v;
    }
}

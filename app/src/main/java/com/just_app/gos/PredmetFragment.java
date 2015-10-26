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
                      Otvet mNamePredmet1= new Otvet();
                      mNamePredmet1.setmNamePredmet("matan");
                      Intent i = new Intent(getActivity(),OtvetListActivity.class);
                      startActivity(i);
                      break;
                  case R.id.predmet_2:
                      Otvet mNamePredmet2= new Otvet();
                      mNamePredmet2.setmNamePredmet("algebra");
                      Intent j = new Intent(getActivity(),OtvetListActivity.class);
                      //j.putExtra(OtvetListFragment.EXTRA_ANSWER_ID, R.id.predmet_2);
                      startActivity(j);
                      break;
                  case R.id.predmet_3:
                      Otvet mNamePredmet3= new Otvet();
                      mNamePredmet3.setmNamePredmet("inform");
                      Intent a = new Intent(getActivity(),OtvetListActivity.class);
                      //a.putExtra(OtvetListFragment.EXTRA_ANSWER_ID,R.id.predmet_3);
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

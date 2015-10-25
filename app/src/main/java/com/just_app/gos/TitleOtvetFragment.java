package com.just_app.gos;


import android.app.Activity;
import android.app.Fragment;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import java.util.UUID;

public class TitleOtvetFragment extends Fragment {
    private WebView mWebView;
    private TextView mText;
    public static final String EXTRA_TEM_ID =
            "com.just_app.gos.tem_id";
    private   Otvet mOtvet;
    private Desc mDesc;

    public static TitleOtvetFragment newInstance(UUID temId) {
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_TEM_ID, temId);
        TitleOtvetFragment fragment = new TitleOtvetFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UUID temId = (UUID)getArguments().getSerializable(EXTRA_TEM_ID);
        mOtvet=OtvetBank.get(getActivity()).getOtvets(temId);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.title_otvet_fragment, container, false);

        mWebView = (WebView)v.findViewById(R.id.otvet_title);
        mText = (TextView)v.findViewById(R.id.ot_title);
       mText.setText(mOtvet.getmTitle());
       // mText.setText(mDesc.getmDesc());
      // mWebView.loadUrl(mDesc.toString());
        return v;
    }
}

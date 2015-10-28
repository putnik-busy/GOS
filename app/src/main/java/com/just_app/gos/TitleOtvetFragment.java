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


public class TitleOtvetFragment extends Fragment {
    private WebView mWebView;
    private TextView mText;
    public static final String EXTRA_QUESTION_NAME =
            "com.just_app.gos.question_name";
    public static final String EXTRA_QUESTION_ANSWER =
            "com.just_app.gos.question_answer";
    private  String mAnswer;
    private  String mName;

    public static TitleOtvetFragment newInstance(String mQuestionAnswer,String mQuestionName) {
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_QUESTION_ANSWER, mQuestionAnswer);
        args.putSerializable(EXTRA_QUESTION_NAME, mQuestionName);
        TitleOtvetFragment fragment = new TitleOtvetFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAnswer=(String) getArguments().getSerializable(EXTRA_QUESTION_ANSWER);
        mName=(String) getArguments().getSerializable(EXTRA_QUESTION_NAME);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.title_otvet_fragment, container, false);

        mWebView = (WebView)v.findViewById(R.id.otvet_title);
        mText = (TextView)v.findViewById(R.id.name_question);
        mText.setText(mName);
      mWebView.loadUrl(mAnswer);
        return v;
    }
}

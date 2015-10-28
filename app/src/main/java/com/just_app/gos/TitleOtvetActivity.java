package com.just_app.gos;


import android.app.Fragment;

import java.util.UUID;

public class TitleOtvetActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {

        String mQuestionAnswer = (String) getIntent().
                getSerializableExtra(TitleOtvetFragment.EXTRA_QUESTION_ANSWER);

        String mQuestionName = (String) getIntent().
                getSerializableExtra(TitleOtvetFragment.EXTRA_QUESTION_NAME);

        return TitleOtvetFragment.newInstance(mQuestionAnswer,mQuestionName);


    }
}

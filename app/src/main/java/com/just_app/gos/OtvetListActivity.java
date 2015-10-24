package com.just_app.gos;

import android.app.Fragment;

public class OtvetListActivity extends  SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {

        int predmetId=(int)getIntent()
                .getSerializableExtra(OtvetListFragment.EXTRA_ANSWER_ID);

        return OtvetListFragment.newInstance(predmetId);
    }
}

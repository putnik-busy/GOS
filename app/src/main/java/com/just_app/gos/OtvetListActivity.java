package com.just_app.gos;

import android.app.Fragment;



public class OtvetListActivity extends  SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {

        String filename=(String)getIntent()
                .getSerializableExtra(OtvetListFragment.EXTRA_FILENAME);

       return OtvetListFragment.newInstance(filename);

    }
}

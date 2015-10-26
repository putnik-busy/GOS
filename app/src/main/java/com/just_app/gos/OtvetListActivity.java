package com.just_app.gos;

import android.app.Fragment;

public class OtvetListActivity extends  SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {

      return new OtvetListFragment();
    }
}

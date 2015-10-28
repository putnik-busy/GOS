package com.just_app.gos;


import android.app.Fragment;

public class PredmetActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new PredmetFragment();
    }
}

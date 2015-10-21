package com.just_app.gos;


import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class PredmetActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new PredmetFragment();
    }
}

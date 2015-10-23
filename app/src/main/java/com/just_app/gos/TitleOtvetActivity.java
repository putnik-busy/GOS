package com.just_app.gos;


import android.app.Fragment;

import java.util.UUID;

public class TitleOtvetActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        UUID temId=(UUID)getIntent()
                .getSerializableExtra(TitleOtvetFragment.EXTRA_TEM_ID);
        return TitleOtvetFragment.newInstance(temId);
    }
}

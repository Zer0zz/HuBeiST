package com.neusoft.hubeist.activity;

import android.os.Bundle;

import com.neusoft.hubeist.R;
import com.neusoft.hubeist.base.BaseActivity;

public class AboutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        back();
    }
}

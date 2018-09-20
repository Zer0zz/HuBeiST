package com.neusoft.hubeist.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.neusoft.hubeist.R;
import com.neusoft.hubeist.base.BaseActivity;

public class RegistAccountActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_account);

        back();
    }
}

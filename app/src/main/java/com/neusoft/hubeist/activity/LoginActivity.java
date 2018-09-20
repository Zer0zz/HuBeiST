package com.neusoft.hubeist.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.neusoft.hubeist.R;
import com.neusoft.hubeist.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    private static final String TAG = "LoginActivity";

    private EditText accuont_et;
    private EditText pwd_et;
    private TextView regist_tv;
    private TextView forgetPwd_tv;
    private TextView login_btn;

    private TextView findPwd_tv;
    private LinearLayout findPwd_ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initListener();
    }

    private void initView() {
        accuont_et = findViewById(R.id.account_et);
        pwd_et = findViewById(R.id.pwd_et);
        regist_tv = findViewById(R.id.regist_account_tv);
        forgetPwd_tv = findViewById(R.id.forget_pwd_tv);
        login_btn = findViewById(R.id.login_btn);

        findPwd_tv = findViewById(R.id.findPwd_tv);
        findPwd_ll = findViewById(R.id.findPwd_ll);
        findPwd_tv.setVisibility(View.INVISIBLE);
        findPwd_ll.setVisibility(View.INVISIBLE);
    }

    private void initListener() {

        forgetPwd_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (findPwd_ll.getVisibility() == View.VISIBLE) {
                    findPwd_tv.setVisibility(View.INVISIBLE);
                    findPwd_ll.setVisibility(View.INVISIBLE);
                } else {
                    findPwd_tv.setVisibility(View.VISIBLE);
                    findPwd_ll.setVisibility(View.VISIBLE);
                }
            }
        });

        regist_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegistAccountActivity.class);
                startActivity(intent);
            }
        });
    }

}

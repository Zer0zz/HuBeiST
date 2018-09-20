package com.neusoft.hubeist.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.neusoft.hubeist.R;
import com.neusoft.hubeist.activity.AboutActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Self_Fragment extends Fragment {


    private LinearLayout mInfo;
    /**
     * 布局
     */
    private View mView;
    /**
     * 用户名
     */
    private TextView userName;

    /**
     * 身份证号
     */
    private TextView IdNumber;

    /**
     * 用户编号
     */
    private TextView userNumber;

    /**
     * 授权列表
     */
    private TextView shouquanList;

    /**
     * 关于
     */
    private TextView about;


    public Self_Fragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_self_, container, false);
        init();
        initListener();
        return mView;
    }

    /**
     * 实例化控件
     */
    private void init(){
        mInfo = mView.findViewById(R.id.userInfo_self);
        userName = mView.findViewById(R.id.userName_tv);
        IdNumber = mView.findViewById(R.id.ID_number_tv);
        userNumber = mView.findViewById(R.id.userNoTv_self);
        shouquanList = mView.findViewById(R.id.shouquanList_tv);
        about = mView.findViewById(R.id.about_tv);

    }
    private void initListener(){
        mInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        shouquanList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Self_Fragment.this.getActivity(), AboutActivity.class);
                startActivity(intent);
            }
        });
    }

}

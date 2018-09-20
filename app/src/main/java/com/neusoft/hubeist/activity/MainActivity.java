package com.neusoft.hubeist.activity;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.neusoft.hubeist.R;
import com.neusoft.hubeist.adapter.AppFragmentPageAdapter;
import com.neusoft.hubeist.fragment.HomePage_Fragment;
import com.neusoft.hubeist.fragment.Self_Fragment;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ViewPager mcContainer;

    /**
     * 底部
     */
    private TextView homePageTv, selfTv;

    private List<Fragment> fragmentList;

    private List<TextView> textViewList;

    private int mDefaultColor ;

    private int mActiveColor ;

    private FragmentManager manager = getSupportFragmentManager();
    private FragmentTransaction transaction = manager.beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDefaultColor = getResources().getColor(R.color.mainItemNoSelected);
        mActiveColor = getResources().getColor(R.color.mainItemSelected);
        init();
        initListener();
    }

    private void init() {
        mcContainer = findViewById(R.id.vp_container);
        homePageTv = findViewById(R.id.homePage_tv);
        selfTv = findViewById(R.id.self_tv);

        textViewList = new ArrayList<>();
        textViewList.add(homePageTv);
        textViewList.add(selfTv);

        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new HomePage_Fragment());
        fragmentList.add(new Self_Fragment());
        mcContainer.setAdapter(new AppFragmentPageAdapter(getSupportFragmentManager(), fragmentList));

    }
    private void initListener() {
        homePageTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mcContainer.getCurrentItem()!=0){
                    mcContainer.setCurrentItem(0);
                    for (TextView viewer :
                            textViewList) {
                        viewer.setTextColor(mDefaultColor);
                    }
                    textViewList.get(0).setTextColor(mActiveColor);
                }
                Log.d(TAG,"CurrentItem: "+ mcContainer.getCurrentItem());
            }
        });

        selfTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mcContainer.getCurrentItem()!=1){
                    mcContainer.setCurrentItem(1);
                    for (TextView viewer :
                            textViewList) {
                        viewer.setTextColor(mDefaultColor);
                    }
                    textViewList.get(1).setTextColor(mActiveColor);
                }
                Log.d(TAG,"CurrentItem: "+ mcContainer.getCurrentItem());
            }
        });
        mcContainer.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                Log.d(TAG, "position ：" + position + ",positionOffset:" + positionOffset + ",positionOffsetPixels:" + positionOffsetPixels);

            }

            @Override
            public void onPageSelected(int position) {
                for (TextView viewer :
                        textViewList) {
                    viewer.setTextColor(mDefaultColor);
                }
                textViewList.get(position).setTextColor(mActiveColor);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                //Do Nothing
                Log.d(TAG, "state :" + state);
            }
        });
    }
}

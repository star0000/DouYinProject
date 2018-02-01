package com.example.douyinpro;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.douyinpro.add.AddFragment;
import com.example.douyinpro.attention.AttentionFragment;
import com.example.douyinpro.home.view.HomeFragment;
import com.example.douyinpro.mine.MineFragment;
import com.example.douyinpro.news.NewsFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @BindView(R.id.home_tv)
    TextView homeTv;
    @BindView(R.id.home_img)
    ImageView homeImg;
    @BindView(R.id.home_attention)
    TextView homeAttention;
    @BindView(R.id.home_add)
    ImageView homeAdd;
    @BindView(R.id.home_news)
    TextView homeNews;
    @BindView(R.id.home_mine)
    TextView homeMine;
    @BindView(R.id.home_viewpager)
    ViewPager homeViewpager;
    @BindView(R.id.home_relative)
    RelativeLayout homeRelative;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        homeViewpager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        homeViewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Fragment fragment = null;
                switch (position) {
                    case 0:
                        fragment = new HomeFragment();
                        break;
                    case 1:
                        fragment = new AttentionFragment();
                        break;
                    case 2:
                        fragment = new AddFragment();
                        break;
                    case 3:
                        fragment = new NewsFragment();
                        break;
                    case 4:
                        fragment = new MineFragment();
                        break;
                    default:
                        break;
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return 5;
            }
        });


        homeTv.setOnClickListener(this);
        homeImg.setOnClickListener(this);
        homeAttention.setOnClickListener(this);
        homeAdd.setOnClickListener(this);
        homeNews.setOnClickListener(this);
        homeMine.setOnClickListener(this);
        homeImg.setColorFilter(Color.RED);
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && Build.VERSION.SDK_INT >= 19) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    @Override
    public void onClick(View v) {
        RotateAnimation rotateAnimation = new RotateAnimation( 0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5F);
        rotateAnimation.setDuration(1000);
        switch (v.getId()) {
            case R.id.home_tv:
                homeViewpager.setCurrentItem(0, false);
                homeTv.setVisibility(View.GONE);
                homeImg.setVisibility(View.VISIBLE);
                homeImg.setColorFilter(Color.RED);
                homeAttention.setTextColor(Color.WHITE);
                homeAdd.setColorFilter(Color.WHITE);
                homeNews.setTextColor(Color.WHITE);
                homeMine.setTextColor(Color.WHITE);
                homeRelative.setBackgroundColor(Color.alpha(0));
                break;
            case R.id.home_img:
                homeImg.setColorFilter(Color.RED);
                homeAttention.setTextColor(Color.WHITE);
                homeAdd.setColorFilter(Color.WHITE);
                homeNews.setTextColor(Color.WHITE);
                homeMine.setTextColor(Color.WHITE);
                homeRelative.setBackgroundColor(Color.alpha(0));
                homeImg.startAnimation(rotateAnimation);
                break;
            case R.id.home_attention:
                homeViewpager.setCurrentItem(1, false);
                homeTv.setVisibility(View.VISIBLE);
                homeImg.setVisibility(View.GONE);
                homeAttention.setTextColor(Color.RED);
                homeTv.setTextColor(Color.WHITE);
                homeAdd.setColorFilter(Color.WHITE);
                homeNews.setTextColor(Color.WHITE);
                homeMine.setTextColor(Color.WHITE);
                homeRelative.setBackgroundColor(Color.BLACK);
                break;
            case R.id.home_add:
                homeViewpager.setCurrentItem(2, false);
                homeAdd.setColorFilter(Color.RED);
                homeTv.setVisibility(View.VISIBLE);
                homeImg.setVisibility(View.GONE);
                homeAttention.setTextColor(Color.WHITE);
                homeTv.setTextColor(Color.WHITE);
                homeNews.setTextColor(Color.WHITE);
                homeMine.setTextColor(Color.WHITE);
                homeRelative.setBackgroundColor(Color.BLACK);
                break;
            case R.id.home_news:
                homeViewpager.setCurrentItem(3, false);
                homeNews.setTextColor(Color.RED);
                homeTv.setVisibility(View.VISIBLE);
                homeImg.setVisibility(View.GONE);
                homeAttention.setTextColor(Color.WHITE);
                homeTv.setTextColor(Color.WHITE);
                homeAdd.setColorFilter(Color.WHITE);
                homeMine.setTextColor(Color.WHITE);
                homeRelative.setBackgroundColor(Color.BLACK);
                break;
            case R.id.home_mine:
                homeViewpager.setCurrentItem(4, false);
                homeMine.setTextColor(Color.RED);
                homeTv.setVisibility(View.VISIBLE);
                homeImg.setVisibility(View.GONE);
                homeAttention.setTextColor(Color.WHITE);
                homeTv.setTextColor(Color.WHITE);
                homeAdd.setColorFilter(Color.WHITE);
                homeNews.setTextColor(Color.WHITE);
                homeRelative.setBackgroundColor(Color.BLACK);
                break;
        }
    }
}

package com.example.douyinpro.home;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.douyinpro.R;

/**
 * Created by 墨羽 on 2018/2/2.
 */

public class HomeSearchView extends LinearLayout {

    private OnSearchClickListener onSearchClickListener;
    private ImageView imgBack;
    private Button search;

    public interface OnSearchClickListener{
        void onSearchClick(View v);
        void onImgBackClick(View v);
    }

    public void setOnSearchClickListener(OnSearchClickListener onSearchClickListener){
        this.onSearchClickListener = onSearchClickListener;
    }

    public HomeSearchView(Context context) {
        this(context,null);
    }

    public HomeSearchView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public HomeSearchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs, defStyleAttr);
    }

    private void initView(Context context, AttributeSet attrs, int defStyleAttr) {
       View.inflate(context, R.layout.home_search, this);
       imgBack = findViewById(R.id.img_back);
       search = findViewById(R.id.search);

        search.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                onSearchClickListener.onSearchClick(view);
            }
        });

        imgBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                onSearchClickListener.onImgBackClick(view);
            }
        });
    }


}

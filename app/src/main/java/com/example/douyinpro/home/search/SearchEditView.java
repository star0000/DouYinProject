package com.example.douyinpro.home.search;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.douyinpro.R;

/**
 * Created by 墨羽 on 2018/2/7.
 */

public class SearchEditView extends LinearLayout{


    private ImageView searchBack;
    private EditText searchEt;
    private TextView searchTv;

    public SearchEditView(Context context) {
        this(context,null);
    }

    public SearchEditView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SearchEditView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs, defStyleAttr);
    }

    private void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        View.inflate(context, R.layout.search_edit,this);
        searchBack = findViewById(R.id.search_back);
        searchEt = findViewById(R.id.search_et);
        searchTv = findViewById(R.id.search_tv);
    }
}

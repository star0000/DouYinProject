package com.example.douyinpro.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.douyinpro.R;

/**
 * Created by 墨羽 on 2018/1/24.
 */

public class NewsFragment extends Fragment {

    private View newsView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        newsView = inflater.inflate(R.layout.fragment_news, container, false);
        return newsView;
    }

}

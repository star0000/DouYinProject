package com.example.douyinpro.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.douyinpro.R;

/**
 * Created by 墨羽 on 2018/1/31.
 */

public class NearByFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View nearbyView = inflater.inflate(R.layout.fragment_nearby, container, false);
        return nearbyView;
    }
}

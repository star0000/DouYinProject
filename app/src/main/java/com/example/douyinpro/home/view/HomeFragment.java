package com.example.douyinpro.home.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.douyinpro.R;
import com.example.douyinpro.home.commend.CommendFragment;
import com.example.douyinpro.home.HomeAdapter;
import com.example.douyinpro.home.nearby.NearByFragment;
import com.example.douyinpro.home.SearchActivity;
import com.example.douyinpro.home.presenter.HomePresenter;

/**
 * Created by 墨羽 on 2018/1/24.
 */

public class HomeFragment extends Fragment implements View.OnClickListener {

    private View homeView;
    private HomePresenter homePresenter;
    private Toast toast;
    private HomeAdapter homeAdapter;
    private ImageView homeSearch;
    private TextView homeRecommend;
    private TextView homeNearby;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        homeView = inflater.inflate(R.layout.fragment_home, container, false);
        homeSearch = homeView.findViewById(R.id.home_search);
        homeRecommend = homeView.findViewById(R.id.home_recommend);
        homeNearby = homeView.findViewById(R.id.home_nearby);
        return homeView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        homeRecommend.setTextSize(30);
        changeFragment(new CommendFragment(),"commendfragment");

        homeRecommend.setOnClickListener(this);
        homeNearby.setOnClickListener(this);
        homeSearch.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_recommend:
                changeFragment(new CommendFragment(),"commendfragment");
                homeRecommend.setTextSize(30);
                homeNearby.setTextSize(20);
                break;
            case R.id.home_nearby:
                changeFragment(new NearByFragment(),"nearbyfragment");
                homeNearby.setTextSize(30);
                homeRecommend.setTextSize(20);
                break;
            case R.id.home_search:
                startActivity(new Intent(getContext(), SearchActivity.class));
               break;
        }
    }

    public void changeFragment(Fragment fragment,String tag){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment,tag);
        fragmentTransaction.commit();
    }
}

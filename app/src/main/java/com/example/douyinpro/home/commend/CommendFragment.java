package com.example.douyinpro.home.commend;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.douyinpro.R;
import com.example.douyinpro.home.EventBusMessage;
import com.example.douyinpro.home.HomeAdapter;
import com.example.douyinpro.home.bean.HomeBean;
import com.example.douyinpro.home.presenter.HomePresenter;
import com.example.douyinpro.home.view.HomeViewInterface;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

/**
 * Created by 墨羽 on 2018/2/7.
 */

public class CommendFragment extends Fragment implements HomeViewInterface
{

    private View commendView;
    private HomePresenter homePresenter;
    private Toast toast;
    private XRecyclerView commendXrv;
    private HomeAdapter homeAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        commendView = inflater.inflate(R.layout.fragment_commend, container, false);
        commendXrv = commendView.findViewById(R.id.commend_xrv);
        return commendView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        homePresenter = new HomePresenter(this);
        homePresenter.excuteQuest();
        toast = Toast.makeText(getContext(), "", Toast.LENGTH_SHORT);

    }

    @Override
    public void homesuccess(List<HomeBean.CategoryListBean> categoryList) {
        if(categoryList != null){
            EventBus.getDefault().postSticky(new EventBusMessage(categoryList));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), GridLayout.VERTICAL, false);
            commendXrv.setLayoutManager(linearLayoutManager);
            homeAdapter = new HomeAdapter(getActivity(),categoryList);
            commendXrv.setAdapter(homeAdapter);
        }
    }

    @Override
    public void homefailed(Exception e) {
        toast.setText("请求失败!");
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(homePresenter != null){
            homePresenter.catchView();
        }
    }
}

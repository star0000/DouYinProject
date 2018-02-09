package com.example.douyinpro.home.nearby;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.example.douyinpro.R;
import com.example.douyinpro.home.EventBusMessage;
import com.example.douyinpro.home.bean.HomeBean;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

/**
 * Created by 墨羽 on 2018/1/31.
 */

public class NearByFragment extends Fragment {

    private View nearbyView;
    private XRecyclerView nearbyXrv;
    private List<HomeBean.CategoryListBean> categoryList;
    private NearByAdapter nearByAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        nearbyView = inflater.inflate(R.layout.fragment_nearby, container, false);
        nearbyXrv = nearbyView.findViewById(R.id.nearby_xrv);
        EventBus.getDefault().register(NearByFragment.this);
        return nearbyView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, GridLayout.VERTICAL, false);
        nearbyXrv.setLayoutManager(gridLayoutManager);
        nearByAdapter = new NearByAdapter(getActivity(),categoryList);
        nearbyXrv.setAdapter(nearByAdapter);

    }

   @Subscribe(threadMode = ThreadMode.MAIN,sticky = true)
    public void getMessageEvent(EventBusMessage eventBusMessage){
        categoryList = eventBusMessage.CategoryList;
        Log.e("NEARBY", "getMessageEventBus: "+categoryList.size() );
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(NearByFragment.this);
    }
}

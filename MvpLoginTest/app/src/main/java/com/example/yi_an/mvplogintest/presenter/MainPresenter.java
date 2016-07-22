package com.example.yi_an.mvplogintest.presenter;

import android.util.Log;
import android.view.View;

import com.example.yi_an.mvplogintest.model.MainModel;
import com.example.yi_an.mvplogintest.view.MainView;

/**
 * Created by Yi_An on 2016/7/20.
 */
public class MainPresenter {

    private MainView mainView;
    private MainModel mainModel;
    public MainPresenter(MainView mainView,MainModel mainModel) {
        this.mainView = mainView;
        this.mainModel = mainModel;
    }

    public void onCreate()
    {
        Log.d("P","onCreate");
        mainView.setContentView();
    }

    public void onloginclick(String account,String pass)
    {
        Log.d("P","onloginclick");
        mainModel.checkaccount(account,pass);
        mainView.clearEdittext();
        mainView.toastmsg(mainModel.checksuccessaccountmsg());
    }



}

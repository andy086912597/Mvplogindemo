package com.example.yi_an.mvplogintest.model;

import android.util.Log;

/**
 * Created by Yi_An on 2016/7/20.
 */

public class MainModel {
    public String msg="";
    public void checkaccount(String account, String pass) {
        Log.d("M","checkaccount");
        if(account.equals("andy")){
            msg="successful";
        }
        else {msg="fail";}
    }

    public String checksuccessaccountmsg() {
        Log.d("M","checksuccessaccountmsg");
        return msg;
    }
}

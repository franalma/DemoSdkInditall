package com.huawei.demo.demosdkindigitall;

import android.app.Application;

import com.indigitall.android.Indigitall;
import com.indigitall.android.callbacks.InitCallBack;
import com.indigitall.android.models.Device;
import com.indigitall.android.models.Permission;

public class MyApplication extends Application {

    private final static String INDIGITALL_PRIVATE_KEY = "060ce62f-be2c-4fc0-8ad5-4c00c92a02a7";
    //    private final static String SENDER_ID = "388268863671764160";
//    private final static String SENDER_ID = "520034200004002296";
    private final static String SENDER_ID = "102431827";

    @Override
    public void onCreate() {
        super.onCreate();
        initSdk();
    }


    private void initSdk(){

//        Indigitall.init(this,INDIGITALL_PRIVATE_KEY, SENDER_ID, new InitCallBack(this){
//            @Override
//            public void onErrorInitialized(String s) {
//                super.onErrorInitialized(s);
//                System.out.println("----error: "+s);
//            }
//
//            @Override
//            public void onNewUserRegistered(Device device) {
//                super.onNewUserRegistered(device);
//                System.out.println("---new user: "+device.getDeviceId());
//            }
//
//            @Override
//            public void onIndigitallInitialized(Permission[] permissions, Device device) {
//                super.onIndigitallInitialized(permissions, device);
//                System.out.println("--on init: "+device.getDeviceId());;
//            }
//        });
        Indigitall.init(this,INDIGITALL_PRIVATE_KEY, SENDER_ID);
        System.out.println("---after init");
    }
}

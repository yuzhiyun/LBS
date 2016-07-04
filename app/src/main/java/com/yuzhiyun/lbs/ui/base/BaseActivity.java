package com.yuzhiyun.lbs.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.yuzhiyun.lbs.R;


public abstract class BaseActivity extends AppCompatActivity {
    public Context context;
    //用于日志
    String TAG=this.toString();
    public Toolbar toolbar;
    public Bundle savedInstanceState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.savedInstanceState=savedInstanceState;
        setLayoutView();
        context=this;
        findView();
        setListener();
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        进行其他初始化操作
        initOther();

    }
    protected abstract  void setLayoutView() ;
    protected abstract  void findView() ;
    protected abstract void setListener();
    protected abstract void initOther();

}

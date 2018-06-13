package com.example.liming.validateproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import cn.com.careyli.annotation.Bus;

/**
 * Created by liming on 2017/11/19.
 * email liming@finupgroup.com
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                OkBus.getInstance().onEvent(EventTags.FLASH_INIT_UI);
                break;
        }
    }

    @Bus(EventTags.FLASH_INIT_UI)
    public void handMsg(){
        Toast.makeText(this , "收到了msg" , 0).show();
    }

}

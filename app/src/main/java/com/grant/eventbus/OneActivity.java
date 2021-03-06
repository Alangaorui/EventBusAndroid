package com.grant.eventbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

public class OneActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTextEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        mButton = (Button) findViewById(R.id.btn_event);
        mTextEvent = (TextView) findViewById(R.id.text_event);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new EventBusFrist("发送消息"));
            }
        });
    }
}


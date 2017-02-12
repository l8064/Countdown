package com.lns.countdown;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CountdownActivity extends AppCompatActivity {

    private TextView pcodeTv;
    private boolean runningDownTimer;     //判断是否在倒计时

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);

        pcodeTv = (TextView) findViewById(R.id.pcode_tv);

    }

    //发送验证码按钮
    public void onPcode(View view) {

        //如果60秒倒计时没有结束
        if (runningDownTimer) {
            return;
        }

        pcodeTv.setText("正在发送");

        downTimer.start();  // 倒计时开始

    }

    /**
     * 倒计时
     */
    private CountDownTimer downTimer = new CountDownTimer(60 * 1000, 1000) {
        @Override
        public void onTick(long l) {
            runningDownTimer = true;
            pcodeTv.setText((l / 1000) + "秒后重发");
        }

        @Override
        public void onFinish() {
            runningDownTimer = false;
            pcodeTv.setText("重新发送");
        }

    };

}

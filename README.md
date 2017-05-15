# Countdown
Android 发送短信验证码倒计时小栗子

在Android开发中,我们会常常需要使用倒计时,比如在发送短信验证码时的60秒等待,我们可以通过CountDownTimer来简单的实现倒计时的功能.

<img src="https://ww4.sinaimg.cn/large/006y8lVagy1fcnz0ihdeej30u00k0dgt.jpg" width="400px"/>
<img src="https://ww3.sinaimg.cn/large/006y8lVagy1fcnz0eemguj30u00k0q3w.jpg" width="400px"/>

<!-- more -->

## 示例
```java
/**
 * 60秒倒计时示例
 */
 new CountDownTimer(60000, 1000) {

     public void onTick(long millisUntilFinished) {
         mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
     }

     public void onFinish() {
         mTextField.setText("done!");
     }
  }.start();
```
CountDownTimer每隔1秒就会调用一次onTick()方法, 在倒计时结束时会调用onFinish()方法,如此我们便可以通过它简单实现倒计时功能啦.

## 公共构造函数
CountDownTimer(long millisInFuture, long countDownInterval)

``millisInFuture`` 倒计时总时间 ms

``countDownInterval`` 倒计时间隔时间 ms

## 公共方法
``cancel()`` 取消倒计时

``onFinish()`` 倒计时结束回调

``onTick(long millisUntilFinished)`` 到达间隔时间的定期回调

``start()`` 开始倒计时

## 交个朋友
欢迎右上角Start/Fork！
你也可以关注我的博客，和我做朋友。
[http://lns666.me](http://lns666.me/)

package vip.dreamaker.kktest.thread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by chang on 2019/12/8.
 */
public class MyRunnable implements Runnable {
    private CountDownLatch countDownLatch;

    public MyRunnable() {

    }

    public MyRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Runnable:" + Thread.currentThread().getName());
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}

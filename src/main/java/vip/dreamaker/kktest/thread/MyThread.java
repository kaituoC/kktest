package vip.dreamaker.kktest.thread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by chang on 2019/12/8.
 */
public class MyThread extends Thread {
    private CountDownLatch countDownLatch;

    public MyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        countDownLatch.countDown();
    }
}

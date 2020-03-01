package vip.dreamaker.kktest.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/**
 * Created by chang on 2019/12/8.
 */
public class MyCallable implements Callable<Integer> {
    private CountDownLatch countDownLatch;

    public MyCallable() {

    }

    public MyCallable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int result = random.nextInt(100);
        System.out.println("Callable:" + Thread.currentThread().getName() + ":result:" + result);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        return result;
    }
}

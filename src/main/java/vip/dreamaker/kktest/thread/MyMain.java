package vip.dreamaker.kktest.thread;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by chang on 2019/12/8.
 */
public class MyMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int threadNum = 5;
        System.out.println("---------------------------------------");
        System.out.println("1111111111111111111111111111111111111111");
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            Thread thread = new MyThread(countDownLatch);
            thread.start();
        }
        countDownLatch.await();
        System.out.println("---------------------------------------");

        System.out.println("2222222222222222222222222222222222222222");
        countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            Thread thread = new Thread(new MyRunnable(countDownLatch));
            thread.start();
        }
        countDownLatch.await();
        System.out.println("---------------------------------------");

        System.out.println("3333333333333333333333333333333333333333");
        countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            Callable<Integer> myCallable = new MyCallable(countDownLatch);
            FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
            new Thread(futureTask).start();
            System.out.println(Thread.currentThread().getName() + "----" + futureTask.get());
        }
        countDownLatch.await();
        System.out.println("---------------------------------------");

        System.out.println("4444444444444444444444444444444444444444");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        for (int i = 0; i < threadNum; i++) {
            MyRunnable myRunnable = new MyRunnable();
            Future<?> submit = executor.submit(myRunnable);
            System.out.println(submit.get());
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(10);
        }
        System.out.println("---------------------------------------");

        System.out.println("5555555555555555555555555555555555555555");
        executor = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), new MyThreadFactory());
        List<Future<Integer>> futureList = new LinkedList<>();
        for (int i = 0; i < threadNum; i++) {
//            MyCallable myCallable = new MyCallable();
//            Future<Integer> future = executor.submit(myCallable);
            Future<Integer> future = executor.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Random random = new Random();
                    int result = random.nextInt(100);
                    System.out.println(Thread.currentThread().getName() + ":result:" + result);
                    return result;
                }
            });
            futureList.add(future);
        }
        executor.shutdown();
        for (Future<Integer> future : futureList) {
            System.out.println(Thread.currentThread().getName() + "----future.get()=" + future.get());
        }
        System.out.println("---------------------------------------");
    }
}

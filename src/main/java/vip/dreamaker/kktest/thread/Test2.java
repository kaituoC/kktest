package vip.dreamaker.kktest.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by chang on 2019/12/8.
 */
public class Test2 {

    private static final String SUCCESS_MSG = "%s get %s apple";
    private static final String EXIT_MSG = "%s not enough apple,exit!";

    public static void main(String[] args) {
        AtomicInteger total = new AtomicInteger(9);
        Monkey a = new Monkey(2, total);
        Monkey b = new Monkey(3, total);
        a.start();
        b.start();

    }

    public static class Monkey extends Thread {
        int number;
        AtomicInteger total;

        public Monkey(int number, AtomicInteger total) {
            this.number = number;
            this.total = total;
        }

        @Override
        public void run() {
            while (true) {
                boolean status = getApple();
                if (status) {
                    System.out.println(String.format(SUCCESS_MSG, Thread.currentThread().getName(), number));
                } else {
                    System.out.println(String.format(EXIT_MSG, Thread.currentThread().getName()));
                    break;
                }
            }
        }

        public synchronized boolean getApple() {
            if (this.total.intValue() >= this.number) {
                this.total.getAndAdd(0 - number);
                return true;
            }
            return false;
        }

    }
}

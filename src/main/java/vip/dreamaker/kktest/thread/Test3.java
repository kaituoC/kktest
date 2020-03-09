package vip.dreamaker.kktest.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by chang on 2019/12/8.
 */
public class Test3 {

    private static final String success_msg = "%s get %s apple";
    private static final String exit_msg = "%s not enough apple,exit!";

    public static void main(String[] args) {
        Integer total = new Integer(9);
        Monkey a = new Monkey(2, total);
        Monkey b = new Monkey(3, total);
        a.start();
        b.start();

    }

    public static class Monkey extends Thread {
        int number;
        Integer total;

        public Monkey(int number, Integer total) {
            this.number = number;
            this.total = total;
        }

        @Override
        public void run() {
            while (true) {
                boolean status = getApple();
                if (status) {
                    System.out.println(String.format(success_msg, Thread.currentThread().getName(), number));
                } else {
                    System.out.println(String.format(exit_msg, Thread.currentThread().getName()));
                    break;
                }
            }
        }

        public synchronized boolean getApple() {
            if (this.total >= this.number) {
                this.total = this.total - number;
                return true;
            }
            return false;
        }

    }
}

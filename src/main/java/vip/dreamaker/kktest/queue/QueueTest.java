package vip.dreamaker.kktest.queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author kaituo
 * @date 2019/12/20 14:32
 */
public class QueueTest {

  public static void main(String[] args) {
    Queue<String> queue = new ConcurrentLinkedQueue<>();
    for (int i = 0; i < 10000; i++) {
      queue.add(String.valueOf(i));
    }
    System.out.println("queue.size:" + queue.size());
    Worker worker1 = new Worker(queue);
    Worker worker2 = new Worker(queue);
    worker1.start();
    worker2.start();

  }

  public static class Worker extends Thread {

    private Queue<String> queue;

    public Worker(Queue<String> queue) {
      this.queue = queue;
    }

    @Override
    public void run() {
      int count = 0;
      while (true) {
        String poll = queue.poll();
        if (poll == null) {
          System.out.println(currentThread().getName() + ",count:" + count);
          break;
        }
        count++;
      }
    }

  }
}

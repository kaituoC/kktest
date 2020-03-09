package vip.dreamaker.kktest.test.boss;

import java.util.ConcurrentModificationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>Copyright (C) 2017-2019 THL A29 Limited, a Qknode company. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at</p>
 *
 * <p>https://opensource.org/licenses/Apache-2.0</p>
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.</p>
 *
 * @Auther: kaituo
 * @Date: 2020/3/1 23:12
 * @Description:
 */
public class Test1 {

  public static void main(String[] args) {
    AtomicInteger atomicInteger = new AtomicInteger(52);
    Worker worker1 = new Worker(97, 0, atomicInteger);
    Worker worker2 = new Worker(65, 1, atomicInteger);
    ExecutorService threadPool = Executors.newFixedThreadPool(2);
    long startTs = System.currentTimeMillis();
    threadPool.execute(worker1);
    threadPool.execute(worker2);
    threadPool.shutdown();
    while (!threadPool.isTerminated()) {

    }
    long endTs = System.currentTimeMillis();
    System.out.println("total cast:" + (endTs - startTs));
  }

  static class Worker extends Thread {

    private AtomicInteger atomicInteger;
    private int step;
    private int start;
    private int count = 0;

    public Worker(int start, int step, AtomicInteger atomicInteger) {
      this.start = start;
      this.step = step;
      this.atomicInteger = atomicInteger;
    }

    @Override
    public void run() {
      long startTs = System.currentTimeMillis();
      while (true) {
        if (atomicInteger.get() % 2 == step) {
          System.out.print((char) (start + count));
          count++;
          int i = atomicInteger.incrementAndGet();
          if (count >= 26) {
            break;
          }
        }
      }
      long endTs = System.currentTimeMillis();
      System.out.println(this.getName() + " cast:" + (endTs - startTs));
    }
  }
}

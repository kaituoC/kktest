package vip.dreamaker.kktest.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.jboss.netty.util.internal.ThreadLocalRandom;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * Created by chang on 2019/4/21.
 */
@Service
@Slf4j
public class MultiThreadService {
    private static final Long TIMEOUT = 2000L;

    /**
     * Future
     *
     * @return
     */
    public JSONObject multiCallableFutureTest() {
        long start = System.currentTimeMillis();
        JSONObject result = new JSONObject();
        List<Future<String>> futureList = new ArrayList<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 20, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);
        Map<Integer, String> taskHashCodeMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            CallableDemo callableDemo = new CallableDemo(i);
            Future<String> future = completionService.submit(callableDemo);
            futureList.add(future);
            taskHashCodeMap.put(future.hashCode(), String.valueOf(i));
        }
        JSONObject jo = new JSONObject();
        taskHashCodeMap.forEach((x, y) -> jo.put(String.valueOf(x), "Thread-" + y));
        result.put("taskSetHashCode", jo);
        Map<Integer, String> collect = new HashMap<>();
        for (int i = 0; i < futureList.size(); i++) {
            try {
                Future<String> f = completionService.take();
                String res = f.get(TIMEOUT, TimeUnit.MILLISECONDS);
                System.out.println("Future res=" + res + " run over!!!");
                collect.put(f.hashCode(), res);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
        JSONObject runResult = new JSONObject();
        collect.forEach((x, y) -> runResult.put(String.valueOf(x), y));
        result.put("runResult", runResult);
        long end = System.currentTimeMillis();
        result.put("coast", (end - start));
        return result;
    }

    /**
     * FutureTask
     *
     * @return
     */
    public JSONObject multiCallableTest() {
        long start = System.currentTimeMillis();
        JSONObject result = new JSONObject();
        Set<FutureTask<String>> taskSet = new HashSet<>();
        Map<Integer, String> taskHashCodeMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            CallableDemo callableDemo = new CallableDemo(i);
            FutureTask<String> longFutureTask = new FutureTask<>(callableDemo);
            taskSet.add(longFutureTask);
            taskHashCodeMap.put(longFutureTask.hashCode(), String.valueOf(i));
        }
        JSONObject jo = new JSONObject();
        taskHashCodeMap.forEach((x, y) -> jo.put(String.valueOf(x), "Thread-" + y));
        result.put("taskSetHashCode", jo);
//        方法一：线程
//        taskSet.forEach(x -> new Thread(x).start());
//        方法二：线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        taskSet.forEach(executorService::submit);
        Map<Integer, String> collect = taskSet.stream().collect(Collectors.toMap(FutureTask::hashCode, futureTask -> {
            try {
                String res = futureTask.get(TIMEOUT, TimeUnit.MILLISECONDS);
                System.out.println("FutureTask res=" + res + " run over!!!");
                return res;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                System.out.println(futureTask.hashCode() + "::timeout!!" + e.toString());
//                e.printStackTrace();
            }
            return "";
        }));
        JSONObject runResult = new JSONObject();
        collect.forEach((x, y) -> runResult.put(String.valueOf(x), y));
        result.put("runResult", runResult);
        long end = System.currentTimeMillis();
        result.put("coast", (end - start));
        return result;
    }

    class CallableDemo implements Callable<String> {
        private String name;

        public CallableDemo(int i) {
            this.name = "Thread-" + String.valueOf(i);
        }

        @Override
        public String call() throws Exception {
            Long start = System.currentTimeMillis();
            Random random = new ThreadLocalRandom();
            int loop = random.nextInt(10) + 1;
            for (int i = 0; i < loop; i++) {
                Thread.sleep(1000);
                System.out.println("name=" + name + " is run,loop=" + loop + ",current=" + i);
            }
            Long end = System.currentTimeMillis();
            long cast = end - start;
            String result = name + ",cast=" + cast;
            System.out.println(result);
            return result;
        }
    }
}


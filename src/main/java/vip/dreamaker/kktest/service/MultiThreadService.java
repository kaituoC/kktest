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
        ExecutorService executorService = Executors.newCachedThreadPool();
        taskSet.forEach(executorService::submit);
//        taskSet.forEach(x -> new Thread(x).start());
        Map<Integer, String> collect = taskSet.stream().collect(Collectors.toMap(FutureTask::hashCode, futureTask -> {
            try {
                return futureTask.get(TIMEOUT, TimeUnit.MILLISECONDS);
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
            int order = (random.nextInt(10) + 1) * 1000;
            Thread.sleep(order);
            Long end = System.currentTimeMillis();
            long cast = end - start;
            String result = name + ",cast=" + cast;
            System.out.println(result);
            return result;
        }
    }
}


package vip.dreamaker.kktest.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author kaituo
 * @date 2019-06-12 22:11
 */
@Slf4j
@Component
@Data
public class RedisClient {

  private static final List<String> VALUE_LIST = new ArrayList<>();
  private static RedisClient redisClient;

  @PostConstruct
  public void init() {
    redisClient = new RedisClient();
    VALUE_LIST.add("1");
    VALUE_LIST.add("2");
    VALUE_LIST.add("3");
  }

  public String logInfo() {
    Random random = new Random();
    String s = VALUE_LIST.get(random.nextInt(VALUE_LIST.size()));
    String msg = "new 对象成功调起注入对象, random value:" + s;
    log.info(msg);
    return msg;
  }
}

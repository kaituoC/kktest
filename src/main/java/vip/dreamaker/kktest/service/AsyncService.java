package vip.dreamaker.kktest.service;

import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author kaituo
 * @date 2019/10/16 11:48
 */
@Slf4j
@Service
public class AsyncService {

  @Async
  public void asyncTest() {
    log.info("####asyncTest####   2");
    IntStream.range(0, 5).forEach(d -> {
      try {
        log.info("d=={}", d);
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        log.error("", e);
      }
    });
    log.info("####asyncTest####   3");
  }
}

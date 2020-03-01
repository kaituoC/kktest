package vip.dreamaker.kktest.service;

import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author kaituo
 * @date 2019/12/17 11:40
 */
@Slf4j
@Service
public class DestroyService {
  @PostConstruct
  private void postConstruct() {
    log.info("postConstruct");
  }

  @PreDestroy
  private void preDestroy() {
    log.info("preDestroy....");
    for (int i = 0; i < 20; i++) {
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        log.error("", e);
      }
    }
    log.info("destroyed!");
  }
}

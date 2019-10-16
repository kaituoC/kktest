package vip.dreamaker.kktest.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import vip.dreamaker.kktest.service.AsyncService;

/**
 * @author kaituo
 * @date 2018-11-05
 */
@Slf4j
@Component
public class Scheduler {

  @Autowired
  private AsyncService asyncService;


  /**
   * 高频调度器，每 1 分钟执行一次
   */
  @Scheduled(initialDelay = 0, fixedDelay = 60000)
  public void highFrequencySchedule() {
    log.info("highFrequencyScheduler run over!");
  }

  /**
   * 高频调度器2，10~50秒之间，每 1 秒钟执行一次
   */
//    @Scheduled(cron = "10-50 * * * * ?")
  public void highFrequencySchedule2() {
    log.info("highFrequencySchedule2 run over!");
  }

  /**
   * 测试调度器，每 1 分钟执行一次
   */
  @Scheduled(cron = "0 * * * * ?")
  public void testSchedule() {
    log.info("#####testSchedule start######     1");
    asyncService.asyncTest();
    log.info("#####testSchedule over#######     4");
  }
}

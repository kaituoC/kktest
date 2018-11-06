package vip.dreamaker.kktest.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kaituo
 * @date 2018-11-05
 */
@Component
public class Scheduler {
    private static final Logger logger = LoggerFactory.getLogger(Scheduler.class);

    /**
     * 高频调度器，每 1 分钟执行一次
     */
    @Scheduled(initialDelay = 0, fixedDelay = 60000)
    public void highFrequencySchedule() {
        logger.info("highFrequencyScheduler run over!");
    }
}

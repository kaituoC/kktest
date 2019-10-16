package vip.dreamaker.kktest.config;

import java.util.concurrent.ThreadPoolExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author kaituo
 * @date 2019/10/16 12:12
 */
@Slf4j
@Configuration
public class AsyncConfig {

  @Bean
  public TaskExecutor taskExecutor() {
    log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    // 设置核心线程数
    executor.setCorePoolSize(5);
    // 设置最大线程数
    executor.setMaxPoolSize(10);
    // 设置队列容量
    executor.setQueueCapacity(60);
    // 设置线程活跃时间（秒）
    executor.setKeepAliveSeconds(60);
    // 设置默认线程名称
    executor.setThreadNamePrefix("ckt-executor-");
    // 设置拒绝策略
    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    // 等待所有任务结束后再关闭线程池
    executor.setWaitForTasksToCompleteOnShutdown(true);
    log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    return executor;
  }
}

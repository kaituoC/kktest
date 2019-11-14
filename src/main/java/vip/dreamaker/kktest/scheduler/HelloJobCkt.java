package vip.dreamaker.kktest.scheduler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Component;

/**
 * @author kaituo
 * @date 2019/11/14 15:46
 */
@JobHandler(value = "helloJobCkt")
@Component
public class HelloJobCkt extends IJobHandler {

  @Override
  public ReturnT<String> execute(String s) throws Exception {
    XxlJobLogger.log("helloJobCkt, Hello!");

    for (int i = 0; i < 5; i++) {
      XxlJobLogger.log("beat at:" + i);
      TimeUnit.SECONDS.sleep(3);
    }

    return SUCCESS;
  }
}

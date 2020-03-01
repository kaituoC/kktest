package vip.dreamaker.kktest.scheduler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author kaituo
 * @date 2019/11/14 15:46
 */
@Slf4j
@JobHandler(value = "helloJobCkt")
@Component
public class HelloJobCkt extends IJobHandler {

  @Override
  public ReturnT<String> execute(String param) throws Exception {
    XxlJobLogger.log("helloJobCkt, Hello!, param:" + param);
    log.info("helloJobCkt, Hello!, param:{}", param);

    for (int i = 0; i < 5; i++) {
      XxlJobLogger.log("beat at:" + i);
      TimeUnit.SECONDS.sleep(3);
    }
    ReturnT<String> result = new ReturnT<>();
    result.setCode(ReturnT.SUCCESS_CODE);
    result.setMsg("ok");
    log.info("result:{}", result.toString());
    return result;
  }
}

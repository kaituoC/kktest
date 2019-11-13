package vip.dreamaker.kktest.service;

import java.util.StringJoiner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author kaituo
 * @date 2019/11/13 10:54
 */
@Slf4j
@Service
public class CacheService {

  @Cacheable(value = "ecu", key = "#dsp + #timeStr + #dspPosId", sync = true)
  public String getData(String dsp, String timeStr, String dspPosId) {
    log.info("not in cache, dsp:{}, timeStr:{}, dspPosId:{}", dsp, timeStr, dspPosId);
    StringJoiner sj = new StringJoiner("+");
    return sj.add(dsp).add(timeStr).add(dspPosId).toString();
  }
}

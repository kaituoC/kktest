package vip.dreamaker.kktest.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author kaituo
 * @date 2018-11-05
 */
@Component
public class FrontActuator implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(FrontActuator.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("FrontActuator class will be execute when the project was started!");
    }
}

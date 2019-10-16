package vip.dreamaker.kktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author kaituo
 */
@SpringBootApplication
@EnableAsync
@EnableScheduling
public class KkTestApp {

    public static void main(String[] args) {
        SpringApplication.run(KkTestApp.class, args);
    }
}

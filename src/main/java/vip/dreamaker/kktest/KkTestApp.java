package vip.dreamaker.kktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author kaituo
 */
@SpringBootApplication
@EnableScheduling
public class KkTestApp {

    public static void main(String[] args) {
        SpringApplication.run(KkTestApp.class, args);
    }
}

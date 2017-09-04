package com.me.jovi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanjw on 2017/9/4 0004
 */
@RestController
@EnableAutoConfiguration
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    @RequestMapping("/")
    String home() {
        LOGGER.debug("这是一个 debug 消息");
        LOGGER.info("这是一个 info 消息");
        LOGGER.warn("这是一个 warn 消息");
        LOGGER.error("这是一个 error 消息");
        return "<H2>Hello World!</H2>";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}

package com.zhong.wiki;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import java.util.logging.Logger;

@ComponentScan({"com.zhong"})
@SpringBootApplication
public class WikiApplication {

//    private static final Logger LOG=  LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(WikiApplication.class, args);

//        SpringApplication app=new SpringApplication(WikiApplication.class);
//        Environment env=app.run(args).getEnvironment();
//        LOG.info("启动成功");
//        LOG.info("地址： \thttp://127.0.0.1:{}");
    }

}

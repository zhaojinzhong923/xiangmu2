package com.zhong.wiki.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.zhong"})
@SpringBootApplication
@MapperScan("com.zhong.wiki.mapper")
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

package com.chencheng.demo;

import com.chencheng.demo.domain.ConfigBean;
import com.chencheng.demo.domain.ConfigTestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

// spring boot 入门介绍
// http://tengj.top/2017/04/24/springboot0/

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class, ConfigTestBean.class})
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}

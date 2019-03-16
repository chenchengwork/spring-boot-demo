package com.chencheng.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "com.test")
@PropertySource("classpath:test.properties")
public class ConfigTestBean {
    private String name;
    private String age;
    private String nameAge;
    private String secret;
    private String numberInRange;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getNameAge() {
        return nameAge;
    }

    public void setNameAge(String nameAge) {
        this.nameAge = nameAge;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getNumberInRange() {
        return numberInRange;
    }

    public void setNumberInRange(String numberInRange) {
        this.numberInRange = numberInRange;
    }
}

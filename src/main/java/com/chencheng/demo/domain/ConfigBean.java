package com.chencheng.demo.domain;
import org.springframework.boot.context.properties.ConfigurationProperties;

//通过@ConfigurationProperties加载properties文件内的配置，通过prefix属性指定properties的配置的前缀，通过locations指定properties文件的位置

@ConfigurationProperties(prefix = "com.chencheng")
public class ConfigBean {
    private String name;
    private String age;
    private String nameAge;

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
}

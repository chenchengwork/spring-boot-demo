package com.chencheng.demo.reflect;

import java.lang.reflect.Field;

public class BeanContainer {
    // 深入理解Java类型信息(Class对象)与反射机制 https://blog.csdn.net/javazejian/article/details/70768369


    public static Object getBean(String name) {

        try {
            Class<?> clazz = Class.forName("com.chencheng.demo.reflect.ServiceImpl");
            Object bean = clazz.newInstance();
            Field[] fileds = clazz.getDeclaredFields();

            for (Field f : fileds) {

                if (f.isAnnotationPresent(Autowired.class)) {
                    // 基于类型注入
                    Class<?> c = f.getType();
                    Object value = c.newInstance();

                    // 允许访问private字段
                    f.setAccessible(true);

                    // 把引用对象注入属性
                    f.set(bean, value);
                }
            }

            return bean;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


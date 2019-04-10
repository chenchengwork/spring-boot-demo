package com.chencheng.demo;
import com.chencheng.demo.reflect.ServiceImpl;
import com.chencheng.demo.reflect.BeanContainer;

/**
 * 测试注解和反射
 */
public class Test {
    public static void main(String [] args){
        System.out.println("test");
        ServiceImpl impl = (ServiceImpl) BeanContainer.getBean("service");

        String name = "my test";
        impl.addPerson(name);
    }
}

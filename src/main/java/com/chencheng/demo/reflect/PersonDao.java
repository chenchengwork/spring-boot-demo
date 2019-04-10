package com.chencheng.demo.reflect;

public class PersonDao {
    public int add(Object o) {
        System.out.println("dao autowird ok ");
        System.out.println(o);
        return 0;
    }
}

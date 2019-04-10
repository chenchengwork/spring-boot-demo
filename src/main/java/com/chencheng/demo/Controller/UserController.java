package com.chencheng.demo.Controller;

import com.chencheng.demo.annotation.Name;
import com.chencheng.demo.domain.ConfigBean;
import com.chencheng.demo.domain.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class UserController {
    static String myName = "chencheng";     // 类变量(静态变量)

    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";

    //salary是静态的私有变量
    private static double salary;


    @Value("${com.chencheng.name}")
    private String name;

    @Value("${com.chencheng.age}")
    private String age;

    private String china = "中国";

    @Value("heihei")
    private String test;

    @Autowired
    ConfigBean configBean;

    @Autowired
    ConfigTestBean configTestBean;


    UserController(){

//        System.out.println("UserController构造方法");
    }

    @RequestMapping("/")
    public String index(){
//        return "hello spring boot";
//        System.out.println("aaaa->"+name);
//        configBean.setName("chencheng-replace");
//        return configBean.getName()+","+ age;

//        return configBean.getName();
//        return configTestBean.getNumberInRange();

        System.out.println(UserController.myName);
//        this.javaInnerDataType();

        // 调用Runnable方式实现的线程
//        RunnableDemo R1 = new RunnableDemo("线程1");
//        R1.start();
//
//        RunnableDemo R2 = new RunnableDemo("线程2");
//        R2.start();

       // TODO 自定定义了注解Name,但是没有生效, 未能找到原因
        // (深入Spring:自定义注解加载和使用) https://www.jianshu.com/p/7c2948f64b1c
        System.out.println(this.test);

        return this.test;
    }


    @RequestMapping("/hexo")
    public String hexo(){
        return "hello hexo!";
    }

    /**
     * java内置的数据类型
     */
    private void javaInnerDataType(){
        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);


        // 定义常量， 虽然常量名也可以用小写，但为了便于识别，通常使用大写字母表示常量
        final double PI = 3.1415926;
    }

}

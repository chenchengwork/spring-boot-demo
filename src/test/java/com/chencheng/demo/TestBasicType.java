package com.chencheng.demo;
import java.util.Arrays;
import java.util.Map;
import com.alibaba.fastjson.JSON;

public class TestBasicType {
    public static void main(String [] args) {
        new TestBasicType();
    }

    /**
     * 构造函数
     * 1. 函数名要与类名一样
     * 2. 没有返回值类型
     */
    private TestBasicType(){
        System.out.println("------------解析json的方法---------------");
        parseJSON();

        System.out.println("------------打印数组的方法---------------");
        printArray();
    }

    /**
     * 解析json字符串
     */
    private void parseJSON(){
        String str = "{\"0\":\"zhangsan\",\"1\":\"lisi\",\"2\":\"wangwu\",\"3\":\"maliu\", \"4\":[1]}";

        // 方式1
        Map maps = (Map)JSON.parse(str);
        System.out.println("---------这个是用JSON类来解析JSON字符串!!!-----------");
        for (Object map : maps.entrySet()){
            System.out.println(((Map.Entry)map).getKey()+"     " + ((Map.Entry)map).getValue());
        }
    }

    /**
     * 打印数组
     */
    private void printArray(){
        String[] arr = {"aa"};
        System.out.println(Arrays.toString(arr));

        // 多维数组深度打印
        String[] arr1 = new String[] { "Fifth", "Sixth" };
        String[] arr2 = new String[] { "Seventh", "Eigth" };
        String[][] arrayOfArray = new String[][] { arr1, arr2 };

//        System.out.println(arrayOfArray);
        System.out.println(Arrays.toString(arrayOfArray));
        System.out.println(Arrays.deepToString(arrayOfArray));
    }

}




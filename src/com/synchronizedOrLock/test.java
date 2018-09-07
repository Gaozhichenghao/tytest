/** 
* Project Name:tytest 
* File Name:test.java 
* Package Name:com.synchronizedOrLock 
* Date:2018年9月3日下午4:57:53 
* Copyright (c) 2018, TouYun All Rights Reserved. 
* 
*/
package com.synchronizedOrLock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
* @author zhicheng.gao
* @version 1.0.0
* @date 2018年9月3日 下午4:57:53
*/
public class test {
    public static void main(String[] args) {

        // 学生的集合
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", "男", 18));
        students.add(new Student("李四", "男", 20));
        students.add(new Student("韩梅梅", "女", 18));
        students.add(new Student("小红", "女", 45));
        // 声明接收结果的 map
        // 声明接收结果的 map
        Map<String, List<Student>> resultMap = new HashMap<>();
        for (Student student : students) {
            List<Student> s = resultMap.computeIfAbsent(student.getSex(), k -> new ArrayList<>());
            System.out.println(s.size());
            s.add(student);
           
        }

        System.out.println(resultMap);
    }

    private static void printResult(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("key:" + e.getKey() + "   " + "value:" + e.getValue());
        }
    }
}

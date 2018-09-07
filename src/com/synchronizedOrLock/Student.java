/** 
* Project Name:tytest 
* File Name:Student.java 
* Package Name:com.synchronizedOrLock 
* Date:2018年9月3日下午4:58:07 
* Copyright (c) 2018, TouYun All Rights Reserved. 
* 
*/
package com.synchronizedOrLock;
/** 
* @author zhicheng.gao
* @version 1.0.0
* @date 2018年9月3日 下午4:58:07
*/
public class Student {
    private  String name;
    private  String sex;
    private  Integer age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Student(String name, String sex, Integer age) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    
    
}

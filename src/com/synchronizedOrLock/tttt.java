/** 
* Project Name:tytest 
* File Name:tttt.java 
* Package Name:com.synchronizedOrLock 
* Date:2018年9月4日上午9:28:22 
* Copyright (c) 2018, TouYun All Rights Reserved. 
* 
*/
package com.synchronizedOrLock;

/** 
* @author zhicheng.gao
* @version 1.0.0
* @date 2018年9月4日 上午9:28:22
*/
public class tttt {
    private static int i = 0;

    public tttt() {
        i++;
    }

    public static void main(String[] args) {
        tttt t1 = new tttt();
        tttt t2 = new tttt();
        System.out.println("test1:" + t1.i);
        System.out.println("test2:" + t2.i);
    }
}

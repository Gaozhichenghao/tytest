/** 
* Project Name:tytest 
* File Name:list.java 
* Package Name:com.study 
* Date:2018年9月7日下午3:06:01 
* Copyright (c) 2018, TouYun All Rights Reserved. 
* 
*/
package com.study.singlelinkList;

/** 
* @author zhicheng.gao
* @version 1.0.0
* @date 2018年9月7日 下午3:06:01
*/
class Node {
    protected Node next; // 下一节点
    protected String data;// 数据

    public Node(String data) {
        this.data = data;
    }

    // 显示此节点
    public void show() {
        System.out.print(data + "、");
    }
}

/** 
* Project Name:tytest 
* File Name:Client.java 
* Package Name:com.study 
* Date:2018年9月7日下午3:30:23 
* Copyright (c) 2018, TouYun All Rights Reserved. 
* 
*/
package com.study.singlelinkList;

/** 
* @author zhicheng.gao
* @version 1.0.0
* @date 2018年9月7日 下午3:30:23
*/
public class Client {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addFirstNode("A");
        linkList.addFirstNode("B");
        linkList.addFirstNode("C");
        linkList.add(1, "D");
        linkList.add(2, "E");
        linkList.add(3, "F");
        linkList.displayAllNodes();
        Node node = linkList.deleteByData("A");
        System.out.println("node : " + node.data);
        linkList.displayAllNodes();
        Node node1 = linkList.findByPos(0);
        System.out.println("node1: " + node1.data);
        Node node2 = linkList.findByData("E");
        System.out.println("node2: " + node2.data);
    }
}

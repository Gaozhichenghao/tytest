/** 
* Project Name:tytest 
* File Name:test.java 
* Package Name:com.study 
* Date:2018年9月7日上午11:32:05 
* Copyright (c) 2018, TouYun All Rights Reserved. 
* 
*/
package com.study.singlelinkList;

/** 
* @author zhicheng.gao
* @version 1.0.0
* @date 2018年9月7日 上午11:32:05
*/
class LinkList {
    public Node first; // 定义头结点
    private int pos = 0;// 节点的位置

    public LinkList() {
        this.first = null;
    }

    // 插入一个头节点
    public void addFirstNode(String data) {
        Node node = new Node(data);
        node.next = first;
        first = node;
    }

    // 删除一个头结点,并返回头结点
    public Node deleteFirstNode() {
        Node tempNode = first;
        first = tempNode.next;
        return tempNode;
    }

    // 在任意位置插入节点 在index的后面插入
    public void add(int index, String data) {
        Node node = new Node(data);
        Node current = first;
        Node previous = first;
        while (pos != index) {
            previous = current;
            current = current.next;
            pos++;
        }
        node.next = current;
        previous.next = node;
        pos = 0;
    }

    // 删除任意位置的节点
    public Node deleteByPos(int index) {
        Node current = first;
        Node previous = first;
        while (pos != index) {
            pos++;
            previous = current;
            current = current.next;
        }
        if (current == first) {
            first = first.next;
        } else {
            pos = 0;
            previous.next = current.next;
        }
        return current;
    }

    // 根据节点的data删除节点(仅仅删除第一个)
    public Node deleteByData(String data) {
        Node current = first;
        Node previous = first; // 记住上一个节点
        while (current.data != data) {
            if (current.next == null) {
                return null;
            }
            previous = current;
            current = current.next;
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    // 显示出所有的节点信息
    public void displayAllNodes() {
        Node current = first;
        while (current != null) {
            current.show();
            current = current.next;
        }
        System.out.println();
    }

    // 根据位置查找节点信息
    public Node findByPos(int index) {
        Node current = first;
        if (pos != index) {
            current = current.next;
            pos++;
        }
        return current;
    }

    // 根据数据查找节点信息
    public Node findByData(String data) {
        Node current = first;
        while (current.data != data) {
            if (current.next == null)
                return null;
            current = current.next;
        }
        return current;
    }
}

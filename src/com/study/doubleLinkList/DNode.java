/** 
* Project Name:tytest 
* File Name:DNode.java 
* Package Name:com.study.doubleLinkList 
* Date:2018年9月7日下午4:15:17 
* Copyright (c) 2018, TouYun All Rights Reserved. 
* 
*/
package com.study.doubleLinkList;

/** 
* @author zhicheng.gao
* @version 1.0.0
* @date 2018年9月7日 下午4:15:17
*/
// 双连表节点
public class DNode {
    private DNode priorNode;
    private String data;
    private DNode nextNode;

    public DNode() {
    }

    public DNode(String data) {
        this.priorNode = new DNode();
        this.data = data;
        this.nextNode = new DNode();
    }

    public DNode getPriorNode() {
        return priorNode;
    }

    public void setPriorNode(DNode priorNode) {
        this.priorNode = priorNode;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "DNode [data=" + data + "]";
    }
}
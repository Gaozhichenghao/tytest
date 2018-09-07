/** 
* Project Name:tytest 
* File Name:ICommOperate.java 
* Package Name:com.study.doubleLinkList 
* Date:2018年9月7日下午4:11:22 
* Copyright (c) 2018, TouYun All Rights Reserved. 
* 
*/
package com.study.doubleLinkList;

import java.util.Map;

/** 
* @author zhicheng.gao
* @version 1.0.0
 * @param <T>
* @date 2018年9月7日 下午4:11:22
*/
public interface ICommOperate<T> {
    public boolean insertNode(T node);

    public boolean insertPosNode(int pos, T node);

    public boolean deleteNode(int pos);

    public boolean updateNode(int pos, Map<String, Object> map);

    public T getNode(int pos, Map<String, Object> map);

    public void printLink();
}

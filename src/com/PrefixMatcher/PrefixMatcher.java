/** 
* Project Name:tytest 
* File Name:PrefixMatcher.java 
* Package Name:com.PrefixMatcher 
* Date:2018年9月5日上午10:39:11 
* Copyright (c) 2018, TouYun All Rights Reserved. 
* 
*/
package com.PrefixMatcher;

import java.util.Set;

public interface PrefixMatcher {

    Set<String> obtainMatchedWords(String inputText);
}
package com.pattern.BuilderPattern;

public class Hanbao extends burger {

	@Override
	public String name() {
		return "普通汉堡";
	}

	@Override
	public float price() {
		return 20f;
	}

}

package com.pattern.BuilderPattern;

public class Bottle implements Packing {

	@Override
	public String pack() {
		System.out.println("瓶装");
		return "瓶装";
	}

}

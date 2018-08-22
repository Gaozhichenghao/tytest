package com.pattern.abstractFactoryPattern;

public class colorFactory implements abstractFactory{
	@Override
	public color getcolor(String co) {
		if ("red".equals(co)) {
			return new red();
		}
		if ("green".equals(co)) {
			return new green();
		}
		return null;
	}

	@Override
	public shape getshap(String sh) {
		// TODO Auto-generated method stub
		return null;
	}
}

package com.pattern.abstractFactoryPattern;

public class demo {

	public static void main(String[] args) {
		abstractFactory sh = FactoryProducer.getfactory("shape");
		shape s = sh.getshap("changfangxing");
		s.draw();

		abstractFactory co = FactoryProducer.getfactory("color");
		color c = co.getcolor("red");
		c.fill();

	}

}

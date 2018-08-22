package com.pattern.SingletonPatternDoubleChecked;

//线程安全
public class Singleton {
	public static Singleton singleton = null;

	public Singleton() {
	}

	public static Singleton getSingleleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	public void showLog() {
		System.out.println("双重锁校验");
	}
}

package SingletonPatternHungry;
public class Singleton {
	public static Singleton singleton=new Singleton();
	public Singleton() {
	}
	public static Singleton getSingleleton(){
		return singleton;
	}
	public void showLog(){
		System.out.println("这是饿汉单例");
	}
}

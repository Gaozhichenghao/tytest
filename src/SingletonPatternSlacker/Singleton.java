package SingletonPatternSlacker;
//非线程安全
public class Singleton {
	public static Singleton singleton=null;
	public Singleton() {
	}
	public static Singleton getSingleleton(){
		if(singleton==null){
			singleton=new Singleton();
		}
		return singleton;
	}
	public void showLog(){
		System.out.println("这是懒汉单例");
	}
}

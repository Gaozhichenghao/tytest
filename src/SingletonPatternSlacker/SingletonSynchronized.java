package SingletonPatternSlacker;
//synchronized 线程安全
public class SingletonSynchronized {
	public static SingletonSynchronized singleton=null;
	public SingletonSynchronized() {
	}
	public static synchronized SingletonSynchronized getSingleleton(){
		if(singleton==null){
			singleton=new SingletonSynchronized();
		}
		return singleton;
	}
	public void showLog(){
		System.out.println("这是懒汉线程安全单例");
	}
}

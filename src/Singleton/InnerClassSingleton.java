package Singleton;	
	
/**
 *  最完美
 *  一个类的静态属性只会在第一次加载类时初始化，这是JVM帮我们保证的，所以我们无需担心并发访问的问题。
 *  所以在初始化进行一半的时候，别的线程是无法使用的，因为JVM会帮我们强行同步这个过程。
 *  另外由于静态变量只初始化一次，所以singleton仍然是单例的。
 * @author ljb
 *
 */
public class InnerClassSingleton {	
	/* 私有构造方法，防止被实例化 */	
	private InnerClassSingleton() {	
	
	}	
	
	/* 获取实例 */	
	public static InnerClassSingleton getInstance() {	
		return Singleton.singleton;	
	}	
	
	/* 此处使用一个内部类来维护单例 */	
	private static class Singleton {	
		static InnerClassSingleton singleton = new InnerClassSingleton();	
	}	
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */	
	public Object readResolve() {	
		return getInstance();	
	}
	
	public static void main(String[] args) {
		
	}
}	

class test{
	public static void main(String[] args) {
		InnerClassSingleton instance = InnerClassSingleton.getInstance();
		InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
		System.out.println(instance==instance2);
	}
}

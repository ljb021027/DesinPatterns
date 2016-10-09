package Singleton;	
	
public class InnerClassSingleton {	
	/* 私有构造方法，防止被实例化 */	
	private InnerClassSingleton() {	
	
	}	
	
	/* 获取实例 */	
	public static Singleton getInstance() {	
		return Singleton.singleton;	
	}	
	
	/* 此处使用一个内部类来维护单例 */	
	private static class Singleton {	
		protected static Singleton singleton = new Singleton();	
	}	
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */	
	public Object readResolve() {	
		return getInstance();	
	}	
}	

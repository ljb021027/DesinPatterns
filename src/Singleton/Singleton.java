package Singleton;	
/**	
 * 简单单例模式 线程不安全	
 * @author ljb	
 *	
 */	
public class Singleton {	
	 /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  	
	private static Singleton singleton=null;	
		
	 /* 私有构造方法，防止被实例化 */  	
	private Singleton(){	
			
	}	
		
	 /* 静态工程方法，创建实例 */  	
	public static Singleton getSingleton(){	
		if(singleton == null){	
			singleton = new Singleton();	
		}	
		return singleton;	
	}	
}	

package Singleton;

/**
 * 不建议使用
 * 俗称的饿汉式加载。
 * 最主要的缺点就是一旦我访问了Singleton的任何其他的静态域，
 * 就会造成实例的初始化，而事实是可能我们从始至终就没有使用这个实例，造成内存的浪费。
 * @author ljb
 *
 */
public class Singleton2 {

	private static Singleton2 sinleton2 = new Singleton2();
	
	private Singleton2(){
		
	}
	
	private static Singleton2 getInstance(){
		return sinleton2;
	}
	
}

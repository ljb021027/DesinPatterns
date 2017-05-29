package Singleton;

/**
 * 饿汉式加载。
 * @author ljb
 *
 */
public class Singleton1 {
	public static void main(String[] args) {
		System.out.println(2<<3);
		/**
		 * 一旦我访问了Singleton的任何其他的静态域，
		 * 就会造成实例的初始化，而事实是可能我们从始至终就没有使用这个实例，
		 * 造成内存的浪费。
		 */
		//System.out.println(Singleton1.a);
	}
    
	private static String a = "ljb";
    private static Singleton1 singleton = new Singleton1();
    
    private Singleton1(){
    	System.out.println(11);
    }
    
    public static Singleton1 getInstance(){
        return singleton;
    }
    
}

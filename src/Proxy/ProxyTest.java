package Proxy;	

/**
 * 静态代理测试类
 * @author ljb
 *
 */
public class ProxyTest {	
	public static void main(String[] args) {	
		Sourceable source = new Proxy();	
		source.method();	
	}	
	
}	

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;	
import java.util.Map;	
	
public class test2 {	
	public static void main(String[] args) throws FileNotFoundException {	
		A a = new B();	
//		Map map =new LinkedHashMap();	
//		map.get(key)	
//		map.putAll(m);	
		A[] a1={new A(),new A(),new A()};	
		String aa ="";
		FileInputStream f = new FileInputStream(aa);
	}	
}	
	
class A {	
	public String a;	
	public A(){	
		init();	
	}	
	public void init(){};	
	protected void A1() {	
		System.out.println("父类方法1");	
	}	
	
	public void A2() {	
		System.out.println("父类方法2");	
	}	
}	
	
class B extends A {	
	public String b;	
	public B(){	
		super();	
	}	
	public void init(){	
		System.out.println("b的init");	
	}	
	public void A1() {	
		System.out.println("子类方法1");	
	}	
	
	public void B2() {	
		System.out.println("子类方法2");	
	}	
}	

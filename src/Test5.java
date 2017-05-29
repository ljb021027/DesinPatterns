import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;



public class Test5 {
	private Test5(){
		
	}
	private static void testException() throws Exception{
		throw new Exception();
//		System.out.println(1);
	}
	static final int num = TestStatic.rand.nextInt(10);
	public static void main(String[] args) throws Exception {
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
//		System.out.println(TestStatic.rand.nextInt(10));
	}
	
	
}

class TestStatic{
	private TestStatic(){
		
	}
	public static Random rand = new Random();
	
	public static void main(String[] args) {
//		 ClassLoader loader = Thread.currentThread().getContextClassLoader();
//	        System.out.println(loader);
//	        System.out.println(loader.getParent());
//	        System.out.println(loader.getParent().getParent());
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		List<Integer> list1 = new LinkedList<Integer>();
	}
}

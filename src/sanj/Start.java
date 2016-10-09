package sanj;	
	
import java.util.ArrayList;	
import java.util.List;	
	
public class Start {	
	/**	
	 * 所有的点	
	 */	
	public static final String[] sports= {"A","B","C","D","E","G","H","I","J","K","L"};	
	public static void main(String[] args) {	
		List<Line> lineList = Method.init();	
		String str="";	
		for(String s : sports){	
			str+=s;	
		}	
		System.out.println(str);	
		Method method = new Method();	
		method.printAll(str, 3, "");	
//		System.out.println(method.ss);	
		String[] sanD = method.ss.split(",");	
		int index=0;	
		for(String s : sanD){	
			Boolean b = method.isTriangle(lineList, s);	
			if(b){	
				System.out.println(s);	
				index++;	
			}	
		}	
		System.out.println(index);	
//		method.ss="";	
//		method.printAll("ABC", 2, "");	
//		System.out.println(method.ss);	
			
			
	}	
		
}	

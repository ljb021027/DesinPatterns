package sanj;	
	
public class Test {	
	public static void main(String[] args) {	
	
		int[] s = {4, 2, 1, 3, 0, 5};	
	
		String tmp = "";	
		for(int i=0;i<s.length;i++){	
		tmp = tmp + s[i];	
		}	
	
		String str = tmp;	
		System.out.println(str);	
		int length = 3;	
		printAll(str, length, "");	
		System.out.println(ss);	
		}	
	private static String ss = "";	
	private static void printAll(String number, int length, String s2) {	
		if(s2.length() == length){	
			ss = ss + s2 + ",";	
		}else{	
			for(int i = 0;i < number.length(); i++){	
				printAll(new StringBuffer(number).substring(i+1).toString(), length, s2 + number.charAt(i));	
			} 	
		}	
	}	
}	

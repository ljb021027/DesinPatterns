import java.util.ArrayList;	
import java.util.Arrays;	
import java.util.HashMap;	
import java.util.List;	
import java.util.Map;	
	
	
public class Test3 {	
	public static void main(String[] args) {	
		String str = "ADI AIJ AJE ACK AKL ALE"	
				+ " ACG AGH AHB ADJ ADE AIE"	
				+ " ACL ACE ACH ACB EJL EIK"	
				+ " EDC CKG CHL CBE AKE ABG";	
		String [] strArray = str.split("\\s"); 	
		for(int i=0;i<strArray.length;i++){	
			char[] array = strArray[i].toCharArray();	
			Arrays.sort(array);	
			strArray[i] = String.valueOf(array);	
		}	
		List<String> asList = Arrays.asList(strArray);	
		List<String> asList2 = new ArrayList<String>();	
		for(String s : asList){	
			if(!asList2.contains(s)){	
				asList2.add(s);	
			}else{	
				asList2.add(s+"重复");	
			}	
		}	
		for(String s : asList2){	
			System.out.println(s);	
		}	
		
}	
}	

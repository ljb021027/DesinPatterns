import java.util.ArrayList;	
import java.util.Arrays;	
import java.util.Collections;	
import java.util.Comparator;	
import java.util.HashMap;	
import java.util.List;	
import java.util.Map;	
	
	
	
public class HashMapSort {	
	public static void main(String[] args) {	
		Map<String,Integer> map = new HashMap<String,Integer>();	
		map.put("d", 2);	
		map.put("c", 1);	
		map.put("b", 1);	
		map.put("a", 3);	
		List<Map.Entry<String, Integer>> infoIds =	
			    new ArrayList<Map.Entry<String, Integer>>(map.entrySet());	
		//排序前	
		for (int i = 0; i < infoIds.size(); i++) {	
		    String id = infoIds.get(i).toString();	
		    System.out.println(id);	
		}	
//		//排序	
//		Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {   	
//		    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {      	
//		        //return (o2.getValue() - o1.getValue()); 	
//		        return (o1.getKey()).toString().compareTo(o2.getKey());	
//		    }	
//		}); 	
//		System.out.println();	
//		//排序后	
//		for (int i = 0; i < infoIds.size(); i++) {	
//		    String id = infoIds.get(i).toString();	
//		    System.out.println(id);	
//		}	
			
			
		Object[] key_arr = map.keySet().toArray();     	
		Arrays.sort(key_arr);     	
		for  (Object key : key_arr) {     	
		    Object value = map.get(key);    	
		    System.out.println(key+"::"+value);	
		}   	
			
	}	
}		

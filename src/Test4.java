import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Test4 {

	public static Map<String,List<String>> allPathMap = 
			new LinkedHashMap<String,List<String>>();
	
	public static List<String> javaPathList = new ArrayList<String>();
	
	public static List<String> jspPathList = new ArrayList<String>();
	
	public static List<String> jsPathList = new ArrayList<String>();
	
	public static void main(String[] args) {
		File fileJava = new File("D:\\eclipse\\Workspaces\\eclipse4.4\\Platform-AIP2\\Platform-apiweb\\src\\main\\java\\com\\platform\\api\\web\\controller");
		getPath(fileJava);
		File fileJsp = new File("D:\\eclipse\\Workspaces\\eclipse4.4\\Platform-AIP2\\Platform-apiweb\\src\\main\\webapp\\WEB-INF\\view\\");
		getPath(fileJsp);
		File fileJs = new File("D:\\eclipse\\Workspaces\\eclipse4.4\\Platform-AIP2\\Platform-apiweb\\src\\main\\webapp\\resources\\js-busi");
		getPath(fileJs);
		for (Entry<String, List<String>> entry : allPathMap.entrySet()) {  
			  
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
		  
		} 
		
		
		
		System.out.println(allPathMap.size());
	}
	
	public static void getPath(File srcFile){
		File[] files = srcFile.listFiles();
		for(File f : files){
			if(f.isDirectory()){
				getPath(f);
			}else{
				if(f.getName().endsWith(".java")){
					javaPathList.add(f.getAbsolutePath().replace("", ""));
					allPathMap.put(f.getParentFile().getName()+"_"+f.getName().replace("Controller.java", ""), javaPathList);
				}else if(f.getName().endsWith(".jsp")){
					jspPathList.add(f.getAbsolutePath());
					allPathMap.put(f.getParentFile().getName()+"_UI", jspPathList);
				}else if(f.getName().endsWith(".js")){
					jsPathList.add(f.getAbsolutePath());
					allPathMap.put(f.getParentFile().getName()+"_UI", jsPathList);
				}
			}
		}
	}
	
	
	
	
}

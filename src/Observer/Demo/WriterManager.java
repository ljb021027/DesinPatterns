package Observer.Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WriterManager {
	
	private Map<String,Writer> writerMap = new HashMap<String,Writer>();
	
	public void addWriter(Writer writer){
		writerMap.put(writer.getName(), writer);
	}
	
	public Writer getWriter(String name){
		return writerMap.get(name);
	}
	
	public void deleteWriter(Writer w){
		writerMap.remove(w);
	}
	
	//单例
	private WriterManager(){
		
	}
	
	public static WriterManager getInstance(){
		return WriterManagerInstance.instance;
	}
	
	private static class WriterManagerInstance{
		private static WriterManager instance = new WriterManager();
	}
	
}

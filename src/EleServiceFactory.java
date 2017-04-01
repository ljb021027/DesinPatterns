

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.net.FileNameMap;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;


/**
 * 电子证照策略工厂单例类
 * @author ljb
 *
 */
public class EleServiceFactory {
	
	
	private Class<?> superStrategy = String.class;//接口类class
	
	private ClassLoader classLoader = EleServiceFactory.class.getClassLoader();//默认使用的类加载器
	 
	private List<Class<? extends String>> eleStrategyList;
	 
//	private static final String STARATEGY_PATH = "com.platform.provider.restful.ele.imp";//需要扫描的策略包名
	
	private static final String STARATEGY_PATH = "com.platform.common.util";//需要扫描的策略包名
	
	
    /**
	 * 获取包下所有策略类并加入list
	 */
    private void addClass(){
    	System.out.println("亲亲QQ群QQ群亲亲QQ群QQ群");
    	URL url = EleServiceFactory.class.getClassLoader().getResource(STARATEGY_PATH.replace(".", "/"));
		String protocol = url.getProtocol();  
        if ("file".equals(protocol)) {  
            // 本地自己可见的代码  
       	    findClassLocal(STARATEGY_PATH);
        } else if ("jar".equals(protocol)) {  
            // 引用第三方jar的代码  
            findClassJar(STARATEGY_PATH);  
        }  
    }
    
	private void findClassLocal(final String pathName){
		URI url = null ;
		try {
			url = EleServiceFactory.class.getClassLoader().getResource(pathName.replace(".", "/")).toURI();
		} catch (URISyntaxException e1) {
			throw new RuntimeException("未找到策略资源");
		}
		
		File file = new File(url);
		file.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File chiFile) {
					if(chiFile.isDirectory()){
						findClassLocal(pathName+"."+chiFile.getName());
					}
					if(chiFile.getName().endsWith(".class")){
						Class<?> clazz = null;
						try {
							clazz = classLoader.loadClass(pathName + "." + chiFile.getName().replace(".class", ""));
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}
						if(superStrategy.isAssignableFrom(clazz)){
							eleStrategyList.add((Class<? extends String>) clazz);
						}
						return true;
					}
					return false;
				}
			});
		 
	 }
	
	private void findClassJar(final String pathName){
		String packName = pathName.replace(".", "/");
		JarFile jarFile  = null;
		try {
			URL url = EleServiceFactory.class.getClassLoader().getResource(packName);
			 System.out.println("url:" + url.toString());  
			JarURLConnection jarURLConnection  = (JarURLConnection )url.openConnection();
			jarFile = jarURLConnection.getJarFile();  
			 System.out.println("jarFile:" + jarFile.getName());  
		} catch (IOException e) {
			throw new RuntimeException("未找到策略资源");
		}
		
		Enumeration<JarEntry> jarEntries = jarFile.entries();  
        while (jarEntries.hasMoreElements()) {
            JarEntry jarEntry = jarEntries.nextElement();  
            //System.out.println("1:"+jarEntry.getName());
            if(jarEntry.getName().contains(packName) && !jarEntry.getName().equals(packName+"/")){
            	System.out.println("1:"+jarEntry.getName());
            	System.out.println(jarEntry.isDirectory());
            	if(jarEntry.isDirectory()){
            		 String clazzName = jarEntry.getName().replace("/", ".");
                     int endIndex = clazzName.lastIndexOf("."); 
                     String prefix = null;  
                    if (endIndex > 0) {  
                    	prefix = clazzName.substring(0, endIndex);  
                    }  
                    System.out.println("3:"+prefix);
                    findClassJar(prefix);
            	}
            	if(jarEntry.getName().endsWith(".class")){
    				Class<?> clazz = null;
    				try {
    					clazz = classLoader.loadClass(jarEntry.getName().replace("/", ".").replace(".class", ""));
    				} catch (ClassNotFoundException e) {
    					e.printStackTrace();
    				}
    				if(superStrategy.isAssignableFrom(clazz)){
    					eleStrategyList.add((Class<? extends String>) clazz);
    				}
            	}
            }
//            
//            if(prefix != null){
//            	System.out.println("2:"+clazzName);
//            }
//            if(jarEntry.isDirectory()){
//            	System.out.println("isDirectory():"+jarEntry.getName());
//            	findClassJar(clazzName);
//            }
            
//			}
            
        }
		 
	 }
	 
	 private void init(){
		 eleStrategyList = new ArrayList<Class<? extends String>>(15);
		 addClass();
	 }
	 
	 
	 //单例
	 private EleServiceFactory(){
		 init();
	 }
	 
	 public static EleServiceFactory getInstance(){
		 return EleFactoryInstance.instance;
	 }
	 
	 private static class EleFactoryInstance{
		 private static EleServiceFactory instance = new EleServiceFactory();
	 }
	 
}

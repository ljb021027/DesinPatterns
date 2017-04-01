import java.io.IOException;
import java.io.InputStream;

 /*class test0308 {    
    public static void main(String[] args)throws Exception{    
	        //匿名内部类实现自定义类加载器    
	    ClassLoader myClassLoader = new ClassLoader(){
		    protected Class<?> findClass(String name)throws ClassNotFoundException{ 
		        //获取类文件名    
			    String filename = name.substring(name.lastIndexOf(".") + 1) + ".class";    
			    InputStream is = getClass().getResourceAsStream(filename);    
			    if (is == null) {
		            return super.loadClass(name);
		        }
		        try {
		            byte[] b = new byte[is.available()];
		            is.read(b);
		            return defineClass(name, b, 0, b.length);
		        } catch (IOException e) {
		            throw new ClassNotFoundException();
		        }
		    }
		};
		Object obj = myClassLoader.loadClass("ClassLoaderTest").newInstance();    
		System.out.println(obj.getClass());    
		System.out.println(obj instanceof test0308);    
	}    
}  */
class MyClassLoader extends ClassLoader{
    
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        String fileName = name.substring(name.lastIndexOf(".")+1) + ".class";
        InputStream is = getClass().getResourceAsStream(fileName);
        if (is == null) {
            return super.loadClass(name);
        }
        try {
            byte[] b = new byte[is.available()];
            is.read(b);
            return defineClass(name, b, 0, b.length);
        } catch (IOException e) {
            throw new ClassNotFoundException();
        }
    }
    
}

public class ClassLoaderTest{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ClassLoader classLoader = new MyClassLoader();
        Class<?> clazz = classLoader.loadClass("ClassLoaderTest");
        Object entity = clazz.newInstance();
        System.out.println(entity instanceof ClassLoaderTest);
	}
}
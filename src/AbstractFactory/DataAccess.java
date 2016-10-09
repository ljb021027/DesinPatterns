package AbstractFactory;	
	
/**	
 * 利用java反射的简单工厂	
 * @author ljb	
 *	
 */	
public class DataAccess {	
	private static final String packageName = "AbstractFactory";	
	private static final String dbName = "Sqlserver";	
	
	public static Iuser CreateUser() {	
		String className = packageName + "." + dbName + "User";	
		Iuser object = null;	
		try {	
			object = (Iuser) Class.forName(className).newInstance();	
		} catch (InstantiationException e) {	
			e.printStackTrace();	
		} catch (IllegalAccessException e) {	
			e.printStackTrace();	
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();	
		}	
		return object;	
	
	}	
	
	// public static IDep createDep() {	
	//	
	// }	
}	

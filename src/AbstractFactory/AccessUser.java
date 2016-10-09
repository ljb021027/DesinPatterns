package AbstractFactory;	
	
public class AccessUser implements Iuser{	
	
	@Override	
	public void Insert(User user) {	
		System.out.println("Access增加一个用户");	
	}	
	
	@Override	
	public User getUser(int id) {	
		System.out.println("Access查询一个用户");	
		return null;	
	}	
	
}	

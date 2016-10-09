package AbstractFactory;	
	
public class AccessDep implements IDep{	
	
	@Override	
	public void insertDep(Dep dep) {	
		System.out.println("Access增加一个部门");	
	}	
	
	@Override	
	public Dep getDep(int id) {	
		System.out.println("Access查询一个部门");	
		return null;	
	}	
	
}	

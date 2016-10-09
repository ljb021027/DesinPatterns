package AbstractFactory;	
	
public class SqlserverDep implements IDep{	
	
	@Override	
	public void insertDep(Dep dep) {	
		System.out.println("sqlserver增加一个部门");	
	}	
	
	@Override	
	public Dep getDep(int id) {	
		System.out.println("sqlserver查询一个部门");	
		return null;	
	}	
	
}	

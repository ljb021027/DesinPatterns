package Observer.Demo;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者-读者类
 * @author ljb
 *
 */
public class Reader implements Observer{
	
	private String name;
	
	public Reader(String name){
		this.name = name;
	}
	
	/**
	 * 添加关注作者
	 * @param name
	 */
	public void subscribe(String name){
		WriterManager.getInstance().getWriter(name).addObserver(this);
	}
	
	public void unsubscribe(String name){
		WriterManager.getInstance().getWriter(name).deleteObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		Writer writer = (Writer)o;
		System.out.println(this.name+"知道" + writer.getName() + "发布新书:" + writer.getBookName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

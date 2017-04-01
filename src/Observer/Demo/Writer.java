package Observer.Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 被观察者-作者类
 * 
 * @author ljb
 *
 */
public class Writer extends Observable{
	
	private String name;
	
	private String bookName;
	
	public Writer(String name){
		this.name=name;
		WriterManager.getInstance().addWriter(this);
	}
	
	public void notice(String bookName){
		this.bookName = bookName;
		setChanged();
		notifyObservers();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}

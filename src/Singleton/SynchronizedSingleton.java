package Singleton;	
/**	
 * 双重加锁	
 * @author ljb	
 *	
 */	
public class SynchronizedSingleton {	
	private SynchronizedSingleton synSingleton;	
		
	private SynchronizedSingleton(){	
			
	};	
		
	public SynchronizedSingleton getSynchronizedSingleton(){	
		if(synSingleton==null){	
			synchronized (synSingleton) {	
				if(synSingleton==null){	
					synSingleton =  new SynchronizedSingleton();	
				}	
			}	
		}	
		return synSingleton;	
	}	
}	

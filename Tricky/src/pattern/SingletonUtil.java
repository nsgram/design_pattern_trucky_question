
//test
package pattern;

import java.io.Serializable;

public class SingletonUtil implements Serializable, Cloneable {
	
	private static SingletonUtil singletonUtil;
	//private constructor
	private SingletonUtil(){
		//prevent from reflection
		if (singletonUtil != null) {
            throw new IllegalStateException("Singleton instance already exists");
        }
	}
	
	public static  SingletonUtil getInstanece() {
		if (singletonUtil == null) {
			synchronized (SingletonUtil.class) {
				if (singletonUtil == null) {
					singletonUtil = new SingletonUtil();
				}
			}
			
		}
			
		return singletonUtil;
	}
	// Implement readResolve to control object deserialization
    protected Object readResolve() {
        return getInstanece();
    }
    //prevent from cloning 
	public Object clone()throws CloneNotSupportedException{  
		//return super.clone(); 
		 throw new CloneNotSupportedException("Cloning of singleton instances is not allowed");
	}
}
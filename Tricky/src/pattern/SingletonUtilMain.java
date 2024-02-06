package pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonUtilMain {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException {
		SingletonUtil singletonUtilOne = SingletonUtil.getInstanece();
		SingletonUtil singletonUtilTwo = SingletonUtil.getInstanece();
		
		System.out.println("singletonUtilOne -> "+singletonUtilOne.hashCode());
		System.out.println("singletonUtilTwo -> "+singletonUtilTwo.hashCode());
		
		//break using reflection
		Class<?> singletonClass = Class.forName("pattern.SingletonUtil");
		Constructor<SingletonUtil> constructor = (Constructor<SingletonUtil>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonUtil singletonUtilReflection = constructor.newInstance();
		System.out.println("singletonUtilReflection -> "+singletonUtilReflection.hashCode());
		
		//using Serialization
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("SingletonUtil.ser"));
		objectOutputStream.writeObject(singletonUtilOne);
		objectOutputStream.flush();
		objectOutputStream.close();
		//De-Serialization
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("SingletonUtil.ser"));
		
		SingletonUtil singletonUtilDeser = (SingletonUtil) inputStream.readObject();
		System.out.println("singletonUtilDeser -> "+singletonUtilDeser.hashCode()); 
		
		//using clone
		
		SingletonUtil singletonUtilclone = (SingletonUtil) singletonUtilOne.clone();
		System.out.println("singletonUtilclone -> "+singletonUtilclone.hashCode());
		
		
	}

}

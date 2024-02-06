package design.pattern;
//Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
//Example: GUI toolkit that produces different UI components for different operating systems.
/*
define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.That means Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.

An Abstract Factory Pattern is also known as Kit.
*/
interface Phone{
	void displayInfo();
}
class SamsungPhone implements Phone{
	@Override
	public void displayInfo() {
		System.out.println("I am from SamsungPhone");
	}
}
class IPhone implements Phone{
	@Override
	public void displayInfo() {
		System.out.println("I am from IPhone");
	}
}

interface Laptop{
	void displayInfo();
}

class DellLaptop implements Laptop{
	@Override
	public void displayInfo() {
		System.out.println("I am from DellLaptop");		
	}
}
class MacBook implements Laptop{
	@Override
	public void displayInfo() {
		System.out.println("I am from MacBook");		
	}
}

interface ElectronicDeviceFactory {
	Phone getPhone();
	Laptop getLaptop();
}
class SamsungFactory implements ElectronicDeviceFactory{
	@Override
	public Phone getPhone() {
		return new SamsungPhone();
	}

	@Override
	public Laptop getLaptop() {
		return new DellLaptop();
	}
}

class AppleFactory implements ElectronicDeviceFactory{
	@Override
	public Phone getPhone() {
		return new IPhone();
	}

	@Override
	public Laptop getLaptop() {
		return new MacBook();
	}
}

public class AbstractFactory {
	
	public static void main(String[] args) {
		ElectronicDeviceFactory factory =  new SamsungFactory();
		Phone phone = factory.getPhone();
		Laptop laptop = factory.getLaptop();
		phone.displayInfo();
		laptop.displayInfo();
	}
	
}


//Phone and Laptop are abstract product interfaces.
//SamsungPhone, IPhone, DellLaptop, and MacBook are concrete product implementations
//ElectronicDeviceFactory is the abstract factory interface with methods to create phones and laptops.
//SamsungFactory and AppleFactory are concrete factory implementations that create Samsung and Apple electronic devices, respectively.
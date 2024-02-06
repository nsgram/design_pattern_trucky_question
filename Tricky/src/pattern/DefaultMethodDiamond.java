package pattern;

interface inter1{
	default void m1() {
		System.out.println("inter1 m1()");
	}
}

interface inter2{
	default void m1() {
		System.out.println("inter1 m2()");
	}
}
class Implementation implements inter1,inter2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		//inter1.super.m1();
		System.out.println("I am from Implementation class");
		inter1.super.m1();
	}
	
}


public class DefaultMethodDiamond {
	public static void main(String[] args) {
		Implementation implementation = new Implementation();
		implementation.m1();
	}

}

package pattern;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class A {
    static int m1() {
        System.out.println("A m1()");
        return 1;
    }
}

class B extends A {
	int a = 10;
	static int b = 20;
	class D extends B{
		static final int d =10;//direct not allow static
		void m3() {
			final int d = 20;
			System.out.println("I am from Inner class :"+a);
			System.out.println("I am from Inner class :"+b);//all outer member
			System.out.println("--"+m1());
		}
		
		
	}
	static class E {
		static int e = 10;
		void m4() {
			System.out.println("E.m4() :"+e);
			System.out.println("E.m4() :"+b);//access only static outer member
		}
		static void m5() {
			System.out.println("E  m5()");
		}
	}
    static int m1() {
    	try(Connection conn = DriverManager.getConnection("");
    			Connection conn2 = DriverManager.getConnection("")) {
			
		} catch (RuntimeException e) {
			// TODO: handle exception
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	return 1;
    }
}

public class Test {
    public static void main(String[] args) {
//        A a = new B();
//        a.m1();
//        B.D db = new B().new D();
//        db.m3();
//        B.E e = new B.E();
//        e.m4();
//        B.E.m5();
//        e.m5();
    	
    	StringBuffer sb = new StringBuffer("1234567890");
    	System.out.println(sb);
    	System.out.println(sb.delete(1,4));
    	
    	System.out.println(sb);
    	
    	System.out.println(sb.insert(1,"ram"));
    	System.out.println(sb);
    	
       
    }
}

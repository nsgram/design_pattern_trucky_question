package pattern;

public class Demo {
    
    void m1(Integer str) {
        System.out.println("I am from Int Class");
    }
    
    void m1(Double str) {
        System.out.println("I am from Double Class");
    }
    
    void m1(String str) {
        System.out.println("I am from String Class");
    }
    
    void m1(Object obj) {
        System.out.println("I am from  Object Class");
    }
    public static void main(String[] args) {
      // new Demo().m1(null);
    }
}

package typeinfo;//: typeinfo/InterfaceViolation.java
// Sneaking around an interface.
import initialization.A;
import typeinfo.interfacea.*;

class B implements initialization.A {
  public void f() {}
  public void g() {}
}

public class InterfaceViolation {
  public static void main(String[] args) {
    initialization.A a = new B();
    a.f();
    // a.g(); // Compile error
    System.out.println(a.getClass().getName());
    if(a instanceof B) {
      B b = (B)a;
      b.g();
    }
  }
} /* Output:
B
*///:~

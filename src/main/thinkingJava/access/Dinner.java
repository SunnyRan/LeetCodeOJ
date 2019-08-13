package access;//: access/Dinner.java
// Uses the library.
import access.dessert.*;
import typeinfo.Cookie;

public class Dinner {
  public static void main(String[] args) {
    typeinfo.Cookie x = new typeinfo.Cookie();
    //! x.bite(); // Can't access
  }
} /* Output:
Cookie constructor
*///:~

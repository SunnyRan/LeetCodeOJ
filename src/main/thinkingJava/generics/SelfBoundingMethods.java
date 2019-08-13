package generics;//: generics/SelfBoundingMethods.java

import initialization.A;

public class SelfBoundingMethods {
  static <T extends SelfBounded<T>> T f(T arg) {
    return arg.set(arg).get();
  }
  public static void main(String[] args) {
    initialization.A a = f(new initialization.A());
  }
} ///:~

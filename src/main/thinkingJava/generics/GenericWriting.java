package generics;//: generics/GenericWriting.java
import initialization.Apple;

import java.util.*;

public class GenericWriting {
  static <T> void writeExact(List<T> list, T item) {
    list.add(item);
  }
  static List<initialization.Apple> apples = new ArrayList<initialization.Apple>();
  static List<Fruit> fruit = new ArrayList<Fruit>();
  static void f1() {
    writeExact(apples, new initialization.Apple());
    // writeExact(fruit, new Apple()); // Error:
    // Incompatible types: found Fruit, required Apple
  }
  static <T> void
  writeWithWildcard(List<? super T> list, T item) {
    list.add(item);
  }	
  static void f2() {
    writeWithWildcard(apples, new initialization.Apple());
    writeWithWildcard(fruit, new initialization.Apple());
  }
  public static void main(String[] args) { f1(); f2(); }
} ///:~

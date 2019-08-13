package generics;//: generics/SuperTypeWildcards.java
import initialization.Apple;

import java.util.*;

public class SuperTypeWildcards {
  static void writeTo(List<? super initialization.Apple> apples) {
    apples.add(new initialization.Apple());
    apples.add(new Jonathan());
    // apples.add(new Fruit()); // Error
  }
} ///:~

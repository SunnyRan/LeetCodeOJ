package generics;//: generics/CompilerIntelligence.java
import initialization.Apple;

import java.util.*;

public class CompilerIntelligence {
  public static void main(String[] args) {
    List<? extends Fruit> flist =
      Arrays.asList(new initialization.Apple());
    initialization.Apple a = (initialization.Apple)flist.get(0); // No warning
    flist.contains(new initialization.Apple()); // Argument is 'Object'
    flist.indexOf(new initialization.Apple()); // Argument is 'Object'
  }
} ///:~

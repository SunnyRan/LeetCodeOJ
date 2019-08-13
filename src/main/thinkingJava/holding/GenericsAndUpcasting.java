package holding;//: holding/GenericsAndUpcasting.java
import initialization.Apple;

import java.util.*;

class GrannySmith extends initialization.Apple {}
class Gala extends initialization.Apple {}
class Fuji extends initialization.Apple {}
class Braeburn extends initialization.Apple {}

public class GenericsAndUpcasting {
  public static void main(String[] args) {
    ArrayList<initialization.Apple> apples = new ArrayList<initialization.Apple>();
    apples.add(new GrannySmith());
    apples.add(new Gala());
    apples.add(new Fuji());
    apples.add(new Braeburn());
    for(initialization.Apple c : apples)
      System.out.println(c);
  }
} /* Output: (Sample)
GrannySmith@7d772e
Gala@11b86e7
Fuji@35ce36
Braeburn@757aef
*///:~

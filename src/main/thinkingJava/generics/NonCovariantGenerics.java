package generics;//: generics/NonCovariantGenerics.java
// {CompileTimeError} (Won't compile)
import initialization.Apple;

import java.util.*;

public class NonCovariantGenerics {
  // Compile Error: incompatible types:
  List<Fruit> flist = new ArrayList<initialization.Apple>();
} ///:~

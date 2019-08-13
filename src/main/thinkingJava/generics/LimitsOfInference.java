package generics;//: generics/LimitsOfInference.java
import typeinfo.Person;
import typeinfo.pets.*;
import java.util.*;

public class LimitsOfInference {
  static void
  f(Map<typeinfo.Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile
  }
} ///:~

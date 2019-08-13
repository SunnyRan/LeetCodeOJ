package generics;//: generics/ExplicitTypeSpecification.java
import typeinfo.Person;
import typeinfo.pets.*;
import java.util.*;
import net.mindview.util.*;

public class ExplicitTypeSpecification {
  static void f(Map<typeinfo.Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<typeinfo.Person, List<Pet>>map());
  }
} ///:~

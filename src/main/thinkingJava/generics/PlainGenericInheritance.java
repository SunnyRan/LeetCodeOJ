package generics;//: generics/PlainGenericInheritance.java

import innerclasses.Base;

class GenericSetter<T> { // Not self-bounded
  void set(T arg){
    System.out.println("GenericSetter.set(Base)");
  }
}

class DerivedGS extends GenericSetter<innerclasses.Base> {
  void set(Derived derived){
    System.out.println("DerivedGS.set(Derived)");
  }
}	

public class PlainGenericInheritance {
  public static void main(String[] args) {
    innerclasses.Base base = new innerclasses.Base();
    Derived derived = new Derived();
    DerivedGS dgs = new DerivedGS();
    dgs.set(derived);
    dgs.set(base); // Compiles: overloaded, not overridden!
  }
} /* Output:
DerivedGS.set(Derived)
GenericSetter.set(Base)
*///:~
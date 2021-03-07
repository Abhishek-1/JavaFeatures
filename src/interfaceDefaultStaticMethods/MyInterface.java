package interfaceDefaultStaticMethods;

import java.util.Deque;
import java.util.LinkedList;

public interface MyInterface {

  /****** Like regular interface methods, default methods are implicitly public ****/

  void implementMethod();


  default void defaultMethod(){
    System.out.println("This is the default method in interface Demo");
    staticMethod();
  }

  static void staticMethod(){
    System.out.println("This is the static method in interface Demo");
    Deque<Integer> dequeu = new LinkedList<>();
  }

}

package defaultMethod;

import java.util.Deque;
import java.util.LinkedList;

public interface Demo {

  public void implementMethod();
  default void defaultMethod(){
    System.out.println("This is the default method in interface Demo");
    staticMethod();
  }

  static void staticMethod(){
    System.out.println("This is the static method in interface Demo");
    Deque<Integer> dequeu = new LinkedList<>();
  }

}

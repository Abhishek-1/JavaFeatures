package interfaceDefaultStaticMethods;

public class MyInterfaceImpl implements MyInterface {

  @Override
  public void implementMethod() {
    System.out.println("This is the implemented method in Class ImplementingDemo");
  }

  public static void main(String[] args){
    MyInterfaceImpl obj = new MyInterfaceImpl();
    obj.implementMethod();
    obj.defaultMethod();
  }
}

package defaultMethod;

public class ImplementingDemo implements Demo{

  @Override
  public void implementMethod() {
    System.out.println("This is the implemented method in Class ImplementingDemo");
  }

//  @Override
//  public void defaultMethod(){
//    System.out.println("This is the overriden default method in Class implementation");
//  }
  public static void main(String[] args){
    ImplementingDemo obj = new ImplementingDemo();
    obj.implementMethod();
    obj.defaultMethod();
  }
}

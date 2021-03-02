package methodReference;

public class MethodReferenceNoParameter {

  public static void main(String[] args){
    Thread t = new Thread(MethodReferenceNoParameter::printMessage);
    t.start();
  }

  public static void printMessage(){
    System.out.println("This is thread Creation with no parameter");
  }

}

package closures;

public class ClosureWithLambda {

  public static void main(String args[]){
    int x = 10;
    int b = 20;
    //The value of b is freezed and passed around
    doProcess(x, i -> System.out.println(i+b));
  }

  public static void doProcess(int i, Process p){
    p.process(i);
  }

}


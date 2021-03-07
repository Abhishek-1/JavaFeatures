package lambda;

public class RunnableUsingLambda {

  public static void main(String[] args){
    Thread thread = new Thread(() -> System.out.println("Thread Created Using lambda"));
    thread.start();
  }

}

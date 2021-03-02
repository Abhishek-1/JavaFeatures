package threadCreationWithAnonymousInnerClass;

public class RunnableUsingAIC {

  public static void main(String[] args){

    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread Started usin AIC");
      }
    });
        t.start();
  }

}

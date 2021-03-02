package greetingUsingLambdaJava8;

public class Greeter {

  public void greet(MyLambdaGreeting inputLambda){
    inputLambda.someGreetFunction();
  }

  public static void main(String[] args){

      Greeter greeter = new Greeter();
      MyLambdaGreeting lambdaVariable = () -> System.out.println("Hello World");
      //passing lambda variable
      greeter.greet(lambdaVariable);
      greeter.greet(() -> System.out.println("Hello world from expression"));
      MyLambdaComputation lambdaComputation = (a, b) -> a + b;
      System.out.println(lambdaComputation.calculateSum(2, 5));

  }

}

package greetingUsingPolymorphismJava7;

public class Greeter {

  public void greet(Greeting greeting){
    greeting.perform();
  }

  public static void main(String[] args){
    Greeter greeter = new Greeter();
    Greeting helloWorld = new HelloWorldGreeting();
    Greeting whatsUp = new WhatsUpWorldGreeting();
    greeter.greet(helloWorld);
    greeter.greet(whatsUp);

  }

}

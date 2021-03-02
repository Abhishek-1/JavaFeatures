package greetingUsingPolymorphismJava7;

public class WhatsUpWorldGreeting implements Greeting{

  @Override
  public void perform() {
    System.out.println("What's up World!!");
  }
}

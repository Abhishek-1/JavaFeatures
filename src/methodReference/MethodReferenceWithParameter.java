package methodReference;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class MethodReferenceWithParameter {

  public static void main(String[] args){
    int[] someNum = {1,2,3,4,5};
    int num = 10;
    doSomething(someNum, num, MethodReferenceWithParameter::message);
  }

  public static void message(int x, int y){
    System.out.println(x+y);
  }

  public static void doSomething(int[] inp, int num, BiConsumer<Integer, Integer> consumer){
    Arrays.stream(inp)
        .forEach(i -> consumer.accept(i, num));
  }

}


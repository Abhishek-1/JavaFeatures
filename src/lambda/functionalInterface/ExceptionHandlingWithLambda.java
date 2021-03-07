package lambda.functionalInterface;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class ExceptionHandlingWithLambda {

  public static void main(String[] args){
    int[] someNumbers = {1,2,3,4};
    int k =1;
    processFunc(someNumbers, k, (i,j) -> {
      try{
        System.out.println(i/j);
      } catch(ArithmeticException ex){
        System.out.println("An Exception has occured");
      }
    });
  }

  public static void processFunc(int[] inpArr, int num, BiConsumer<Integer, Integer> consumer){
    Arrays.stream(inpArr)
        .forEach((i) -> consumer.accept(i,num));
  }

}

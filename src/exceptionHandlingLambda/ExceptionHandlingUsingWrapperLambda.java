package exceptionHandlingLambda;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class ExceptionHandlingUsingWrapperLambda {

  public static void main(String[] args){
    int[] someNumbers = {1,2,3,4};
    int k =0;
    processFunc(someNumbers, k, wrapper((i,j) -> System.out.println(i/j)));
  }

  public static void processFunc(int[] inpArr, int num, BiConsumer<Integer, Integer> consumer){
    Arrays.stream(inpArr)
        .forEach((i) -> consumer.accept(i,num));
  }

  public static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> consumer){
    return (v, k) -> {
      try{
        consumer.accept(v, k);
      } catch (ArithmeticException ex){
        System.out.println("Exception Occured");
      }
    };
  }

}

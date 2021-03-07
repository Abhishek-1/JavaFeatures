package lambda.lambdaFunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StatsWithPredicateFunctionalInterface {

  public static void main(String[] args){

    List<People> peopleList = Arrays.asList(new People("abhishek", "ranjan", 33),
        new People("mohita", "kaushik", 31),
        new People("abcd", "cfgh", 21),
        new People("bbcd", "cfgh2", 22),
        new People("bbcd2", "kjkjj", 23));

    //Sort the people list by first Name
    Collections.sort(peopleList, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

    //print all People
    System.out.println("Printing sorted list");
    printAll(peopleList, (p) -> true);

    //print all with lastName starting with c
    System.out.println("\nPrinting all with last Name starting with C");
    printAll(peopleList, (p)-> p.getLastName().startsWith("c"));


  }

  //Predicate is a functional interface containg test method which returns boolean
  public static void printAll(List<People> inpList, Predicate<People> cond){

    List<People> outList = inpList.stream()
        .filter(p -> cond.test(p))
        .collect(Collectors.toList());

    outList.forEach(System.out::println);
  }

}

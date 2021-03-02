package personClassOperationUsingLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PeopleStatUsingPredicateAndConsumer {

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
    performAll(peopleList, (p) -> true, (p)->System.out.println(p));

    //print all with lastName starting with c
    System.out.println("\nPrinting all with last Name starting with C");
    performAll(peopleList, (p)-> p.getLastName().startsWith("c"), (p)->System.out.println(p));


  }

  //Predicate is a functional interface containg test method which returns boolean
  public static void performAll(List<People> inpList, Predicate<People> cond, Consumer<People> consumer){

    List<People> outList = inpList.stream()
        .filter(p -> cond.test(p))
        .collect(Collectors.toList());

    outList.forEach((p)->consumer.accept(p));
  }

}

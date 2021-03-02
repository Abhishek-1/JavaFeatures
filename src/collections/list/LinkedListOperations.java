package collections.list;

import java.util.LinkedList;

public class LinkedListOperations {
  //push, addFirst, offerFirst - Added to the head of the list
  //

  public static void main(String[] args){
    LinkedList<String> stackList = new LinkedList<>();
    LinkedList<String> queueList = new LinkedList<>();

    stackList.push("element1");
    stackList.push("element2");
    stackList.push("element3");
    stackList.push("element4");

    queueList.offer("element1");
    queueList.offer("element2");
    queueList.offer("element3");
    queueList.offer("element4");


    System.out.println("Printing Stack list");
    printlist(stackList);
    System.out.println("Printing Queue List");
    printlist(queueList);

    System.out.println("\nTop of stack-> " + stackList.peek());
    System.out.println("Top of queue-> " + queueList.peek());

    System.out.println("\nRemoving the top of stack-> " + stackList.pop());
    System.out.println("Removing the top of stack-> " + queueList.poll());
  }

  public static void printlist(LinkedList<String> listInp){
    listInp.stream()
        .forEach(System.out::println);
  }
}

package collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

  public static void main(String[] args){
//    integerExample();
//    ObjectExampleUsingAIC();
    ObjectExampleImplementingComparable();
  }

  public static void ObjectExampleImplementingComparable(){
    PriorityQueue<Human> personQueue = new PriorityQueue<>();
    personQueue.offer(new Human("candom", "rabjan", 32));
    personQueue.offer(new Human("bandom", "rabjan", 32));
    personQueue.offer(new Human("aandom", "rabjan", 32));

    System.out.println("The first element is ->" + personQueue.peek().firstName);

  }

  public static void ObjectExampleUsingAIC(){
    PriorityQueue<Person> personQueue = new PriorityQueue<>(new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
      }
    });
    personQueue.offer(new Person("Abhishek", 32));
    personQueue.offer(new Person("random", 1));
    personQueue.offer(new Person("Mohita", 30));

    System.out.println("The first element is ->" + personQueue.peek().getName());

  }

  private static class Human implements Comparable<Human>{
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }

    @Override
    public int compareTo(Human h) {

      var last = this.lastName.compareTo(h.lastName);
      return last == 0? this.firstName.compareTo(h.firstName) : last;
    }
  }

  private static class Person {
    private String name;
    private int age;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }


  }

  public static void integerExample(){
    PriorityQueue<Integer> pqueue = new PriorityQueue<>();
    pqueue.add(3);
    pqueue.add(1);
    pqueue.add(2);

    System.out.println("The first element is ->" + pqueue.peek());

    //Reverse Order - Various ways
    //PriorityQueue<Integer> pqueue1 = new PriorityQueue<>(Comparator.reverseOrder());
    //PriorityQueue<Integer> pqueue1 = new PriorityQueue<>((a,b) -> b-a);
    PriorityQueue<Integer> pqueue1 = new PriorityQueue<>((a,b) -> b.compareTo(a));
    pqueue1.add(3);
    pqueue1.add(1);
    pqueue1.add(2);

    System.out.println("The first element is ->" + pqueue1.peek());

  }

}

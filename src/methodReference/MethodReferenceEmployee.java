package methodReference;

import java.util.Arrays;

public class MethodReferenceEmployee {

  public static void main(String[] ar) {
    Employee[] employees = {
        new Employee("Nick"),
        new Employee("Robin"),
        new Employee("Josh"),
        new Employee("Andy"),
        new Employee("Mark")
    };

    Integer[] ints = {
        1,
        4,
        8,
        2,
        3,
        8,
        6
    };
    //Do the same for number
    System.out.println("Before Sort:");
    dumpEmployee(employees);
    Arrays.sort(employees, Employee::myCompare);
    Arrays.sort(ints, Employee::myCompare);
    System.out.println("After Sort:");
    dumpEmployee(employees);
  }
  public static void dumpEmployee(Employee[] employees) {
    for (Employee emp: Arrays.asList(employees)) {
      System.out.print(emp.name + ", ");
    }
    System.out.println();
  }

}

class Employee {
  String name;
  Employee(String name) {
    this.name = name;
  }
  public static int myCompare(Employee emp1, Employee emp2) {
    return emp1.name.compareTo(emp2.name);
  }

  public static int myCompare(Integer int1, Integer int2) {
    return int1.compareTo(int2);
  }
}

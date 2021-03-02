package collections.map;

import java.util.HashMap;

public class HahMapInternalWorking {

  public static void main(String[] args){
    HashMap<Student, String> map = new HashMap<>();
    Student one = new Student("Abhishek", 1);
    Student two = new Student("Mohita", 2);
    map.put(one, one.getName());
    map.put(two, two.getName());

    map.forEach((key, value) -> {
      System.out.println("key" + key);
      System.out.println("Student Name -> "+ value+ " Object -> "+ key);
    });

  }

  /******** Class implements Hashcode and Equals method ********/
  private static class Student {
    private String name;
    private int rollno;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getRollno() {
      return rollno;
    }

    public Student(String name, int rollno) {
      this.name = name;
      this.rollno = rollno;
    }

    public void setRollno(int rollno) {
      this.rollno = rollno;
    }

    @Override
    public boolean equals(Object o){
      if(this == o) return true;
      if(o == null) return false;
      if(this.getClass() != o.getClass()) return false;
      Student other = (Student) o;
      if(this.rollno != other.rollno){
        return false;
      } else
        return true;
    }

    @Override
    public String toString() {
      return "Student{" +
          "name='" + name + '\'' +
          ", rollno=" + rollno +
          '}';
    }

    @Override
    public int hashCode(){
      final int temp = 14;
      int ans = 1;
      ans = ans * temp + rollno;
      return ans;
    }
  }

}

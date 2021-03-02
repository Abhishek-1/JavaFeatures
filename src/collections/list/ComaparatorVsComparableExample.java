package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComaparatorVsComparableExample {
  
  public static void main(String[] args){

    ArrayList<Movies> list = new ArrayList<Movies>();
    list.add(new Movies("Force Awakens", 8.3, 2015));
    list.add(new Movies("Star Wars", 8.7, 1977));
    list.add(new Movies("Empire Strikes Back", 8.8, 1980));
    list.add(new Movies("Return of the Jedi", 8.4, 1983));

    //Sorting using Comparable
    System.out.println("\nSorting on the basis of year");
    Collections.sort(list);
    list.stream()
        .forEach(System.out::println);

    //Sorting using Name Comparator
    System.out.println("\nSorting on the basis of name");
    Collections.sort(list, new NameCompare());
    list.stream()
        .forEach(System.out::println);

    //Sorting using Name Comparator
    System.out.println("\nSorting on the basis of rating");
    Collections.sort(list, new RatingCompare());
    list.stream()
        .forEach(System.out::println);
    
  }

  private static class Movies implements Comparable<Movies>{
    private String name;
    private double rating;
    private int year;

    public String getName() {
      return name;
    }

    public double getRating() {
      return rating;
    }

    public int getYear() {
      return year;
    }

    public Movies(String name, double rating, int year) {
      this.name = name;
      this.rating = rating;
      this.year = year;
    }

    @Override
    public int compareTo(Movies o) {
      return this.year - o.year;
    }

    @Override
    public String toString() {
      return "Movies{" +
          "name='" + name + '\'' +
          ", rating=" + rating +
          ", year=" + year +
          '}';
    }
  }

  private static class NameCompare implements Comparator<Movies>{

    @Override
    public int compare(Movies o1, Movies o2) {
      return o1.getName().compareTo(o2.getName());
    }
  }
  
  private static class RatingCompare implements Comparator<Movies>{

    @Override
    public int compare(Movies o1, Movies o2) {
      return o1.getRating() > o2.getRating() ? 1 : o1.getRating() < o2.getRating()? -1 : 0;
    }
  }

}

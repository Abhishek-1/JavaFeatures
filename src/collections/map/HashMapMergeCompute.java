package collections.map;

import java.util.HashMap;
import java.util.List;

public class HashMapMergeCompute {

  public static void main(String[] args){
    var words = List.of("Foo", "Bar", "Foo", "Buzz", "Foo", "Buzz", "Fizz", "Fizz");
    var map = new HashMap<String, Integer>();

    /******** Finding the count of each Words ********/
    words.forEach( word -> {
      map.putIfAbsent(word, 0);
      map.put(word, map.get(word)+1);
    });
    /******** Printing count ********/
    map.forEach((key, value) -> {
      System.out.println("Length of "+ key + " -> "+ value);
    });

    /******** Using computeIfPresent ********/
    System.out.println("\n Using computeIfPresent");
    var map1 = new HashMap<String, Integer>();
    words.forEach(word -> {
      map1.putIfAbsent(word, 0);
      map1.computeIfPresent(word, (w, prev) -> {
        return prev+1;
      });
    });
    /******** Printing count ********/
    map1.forEach((key, value) -> {
      System.out.println("Length of "+ key + " -> "+ value);
    });

    /******** Using compute with ternary ********/
    System.out.println("\n Using compute with ternary");
    var map2 = new HashMap<String, Integer>();
    words.forEach(word -> {
      map2.compute(word, (w,prev) -> prev != null ? prev + 1 : 1);
    });
    /******** Printing count ********/
    map2.forEach((key, value) -> {
      System.out.println("Length of "+ key + " -> "+ value);
    });

    /******** Using merge ********/
    System.out.println("\n Using merge");
    var map3 = new HashMap<String, Integer>();
    words.forEach(word -> {
      map3.merge(word, 1, (prev, one) -> prev + one);
    });
    /******** Printing count ********/
    map2.forEach((key, value) -> {
      System.out.println("Length of "+ key + " -> "+ value);
    });

  }

}

package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentModificationException {

  public static void main(String[] args){
    Map<String, Integer> myMap = new HashMap<>();
    myMap.put("user1", 6);
    myMap.put("user2", 7);
    myMap.put("user3", 8);
    myMap.put("user4", 9);
    myMap.put("user5", 10);

    Iterator<String> userItr = myMap.keySet().iterator();

    while(userItr.hasNext()){
      System.out.println(myMap.get(userItr.next()));
      myMap.put("user6", 11);
    }

  }

}

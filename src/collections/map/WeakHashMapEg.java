package collections.map;
import java.util.*;

public class WeakHashMapEg {

  /***** Key is wrapped in weak reference and is eligible for GC *****/
  public static void main(String[] args){
    Map<Order, Integer> orders = new HashMap<>();
    orders.put(new Order(5, "some"), 100);
    orders.put(new Order(6, "some"), 200);
    orders.put(new Order(5, "some"), 100);
    orders.put(new Order(5, "some"), 100);
    orders.put(new Order(5, "some"), 100);
    orders.put(new Order(5, "some"), 100);
    orders.put(new Order(5, "some"), 100);
    System.out.println(orders.size());
    System.gc();
    System.out.println(orders.size());
  }

  private static class Order{
    int orderId;
    String details;

    public Order(int orderId, String details) {
      this.orderId = orderId;
      this.details = details;
    }
  }

}

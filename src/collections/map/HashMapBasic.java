package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;

public class HashMapBasic {

  public static void main(String[] args){
    Map<String, Product> productByName = new HashMap<>();
    Product eBike = new Product("E-Bike", "A bike with a battery");
    Product roadBike = new Product("Road bike", "A bike for competition");
    /******** Put Method ********/
    productByName.put(eBike.getName(), eBike);
    productByName.put(roadBike.getName(), roadBike);

    /******** Retrieving by using key from HashMap using Get Method ********/
    Product nextPurchase = productByName.get("E-Bike");
    System.out.println("Description of retrieved product -> "+ nextPurchase.getDescription());

    /******** Retrieving map on non existent key returns Null ********/
    if(productByName.get("NotPresentKey") == null){
      System.out.println("\nThe key is absent, Map get returned null");
    }

    /******** Inserting A new value on same key overwrites the earlier entry ********/
    Product newEBike = new Product("E-Bike", "A bike with a better battery");
    productByName.put(newEBike.getName(), newEBike);
    Product newPurchase = productByName.get("E-Bike");
    System.out.println("\nDescription of overwritten product -> "+ newPurchase.getDescription());


    /******** Null as a Key ********/
    Product defaultProduct = new Product("Chocolate", "At least buy chocolate");
    productByName.put(null, defaultProduct);
    Product nullPurchase = productByName.get(null);
    System.out.println("\nDescription of Default product(null Key) -> "+ nullPurchase.getDescription());

    /******** Removing a key-value pair using Remove method ********/
    System.out.println("\nMap Size -> "+ productByName.size());
    productByName.remove("E-Bike");
    System.out.println("Map Size after Removing one element -> "+ productByName.size());

    /******** Use of containsKey and containsValue ********/
    productByName.put(eBike.getName(), eBike);
    System.out.println("\nCheck if map contains key e-Bike -> "+ productByName.containsKey(eBike.getName()));
    System.out.println("Check if map contains eBike value -> "+productByName.containsValue(eBike));

    /******** Map Iteration using keySet() ********/
    System.out.println("\n Using keyset");
    for(String key: productByName.keySet()){
      Product product = productByName.get(key);
      System.out.println(product);
    }

    /******** Map Iteration using entrySet() ********/
    System.out.println("\n Using entrySet");
    for(Map.Entry<String, Product> entry: productByName.entrySet()){
      Product product = entry.getValue();
      String key = entry.getKey();
      System.out.println("Entry for Key -> " + key);
      System.out.println(product);
    }

    /******** Converting map into array list of Values and Using stream with HashMap ********/
    System.out.println("\n Printing list of Values in Map by converting into array list");
    List<Product> productList = new ArrayList<>(productByName.values());
    productList.stream()
        .forEach(System.out::println);

    /******** Using forEach method ********/
    System.out.println("\n Using forEach method to print ");
    productByName.forEach((key, Value) -> {
      System.out.println("The key is- "+ key+" The Value is- "+ Value);
    });

    /******** Using getOrDefault ********/
    System.out.println("\nTesting getOrDefault");
    Product failedSearch = new Product("Search Failed", "Take the default");
    Product defaultProductCheck = productByName.getOrDefault("Not Existing Search", failedSearch);
    Assert.assertEquals(defaultProductCheck, failedSearch);

    /******** Using putIfAbsent ********/
    System.out.println("\nTesting putIfAbsent");
    List<Product> productList1 = new ArrayList<>(productByName.values());
    productList1.stream()
        .forEach(System.out::println);
    Product temporaryProduct = new Product("putIfAbsent", "Some Random String");
    productByName.putIfAbsent("E-Bike2", temporaryProduct);
    for(Map.Entry<String, Product> entry: productByName.entrySet()) {
      System.out.println("The key is- " + entry.getKey() + " The Value is- " + entry.getValue());
    }


  }

  private static class Product{
    private String name;
    private String description;
    private List<String> tags;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public Product(String name, String description) {
      this.name = name;
      this.description = description;
    }

    public List<String> getTags() {
      return tags;
    }

    public void setTags(List<String> tags) {
      this.tags = tags;
    }

    public Product addTagsOfOtherProduct(Product product){
      this.tags.addAll(product.getTags());
      return this;
    }

    public String toString(){
      return "People{" +
          "Name='" + name + '\'' +
          ", description='" + description + '\'' +
          '}';
    }

  }

}

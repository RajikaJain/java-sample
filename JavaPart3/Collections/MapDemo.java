package JavaPart3.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
 public static void show(){
  var c1 = new Customer("a","e1");
  var c2 = new Customer("b","e2");

  Map<String, Customer> map = new HashMap<>();
  map.put(c1.getEmail(), c1); //adding key value pair
  map.put(c2.getEmail(), c2);
  var customer = map.get("e1"); //null if not found
  System.out.println(customer);

  var unknown = new Customer("unknown", "");
  var customer1 = map.getOrDefault("e10", unknown);//pass default to unknown keys
  System.out.println(customer1);

  var exist = map.containsKey("e10");
  System.out.println(exist);

  map.replace("e1",new Customer("a++","e1"));
  System.out.println(map);

  for (var key : map.keySet())
  System.out.println(key);

  for(var entry : map.entrySet())
  System.out.println(entry);

  for(var entry1 : map.entrySet())
  System.out.println(entry1.getValue());

  for(var entry2 : map.entrySet())
  System.out.println(entry2.getKey());

  for(var customer7 : map.values())
  System.out.println(customer7);











   // List<Customer> customer = new ArrayList<Customer>();
    //  //0(1)- bad approach
    //  for(var customer : customers)
    //  if(customer : getEmail()=="e1")
    //  System.out.println("found");
 
 }   
}

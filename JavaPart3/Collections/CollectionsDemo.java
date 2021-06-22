package JavaPart3.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
   public static void show()
   {
     Collection<String> collection = new ArrayList<String>();
     //COLLECTION ADD METHODS
      collection.add("a");
      collection.add("b");
      collection.add("c");
      Collections.addAll(collection, "d","e","f");
      
      //COMPARE TWO COLLECTION FOR EQUALITY
      Collection<String> other = new ArrayList<String>();
      other.addAll(collection);
   System.out.println(collection.equals(other)); //compare based on content
 //System.out.println(collection == other); 
            // this is going to return false because we have two different objects in memory 
            //equality operator comparee object with respect to refrence in memory

    //   //to convert collections to regular array
    //  var objectArray =collection.toArray();//returns an object array
    //  var StringArray= collection.toArray(new String[0]);

      System.out.println(collection);

    //   System.out.println(collection.size());

    //   collection.remove("f");

    //   var containsA=collection.contains("a");
    //   System.out.println(containsA);

    //   collection.clear(); //remove all 
    //   System.out.println(collection.isEmpty());
     
    //   System.out.println(collection);

      //TO ITERATE OVER COLLECTIONS
      for(var item :collection)
      System.out.println(item);
   }
}

package JavaPart3.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void show(){
        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("d","b","c"));
        // set1.addAll(set2);//union
        //set1.retainAll(set2);//intersection
        set1.removeAll(set2);//difference
        System.out.println(set1);










        // Collection<String> collection = new ArrayList<String>();
        // //COLLECTION ADD METHODS
        //  collection.add("a");
        //  collection.add("b");
        //  collection.add("c");
        //  Collections.addAll(collection, "d","e","f","a","b");
        //  Set<String> set = new HashSet<>(collection);
        //  System.out.println(set);










    // Set<String> set = new HashSet<String>();
    // set.add("sky");
    // set.add("is");
    // set.add("blue");
    // set.add("blue");
    // System.out.println(set);
    }
}

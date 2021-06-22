package JavaPart3.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Collections.addAll(list, "d","e","f","c");
        list.add(0,"!");
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1,"a+");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.indexOf("c"));
        System.out.println(list.indexOf("s"));//-1
        System.out.println(list.lastIndexOf("c"));
        System.out.println(list.subList(0,2));// didnt affect original list







    }
    
}

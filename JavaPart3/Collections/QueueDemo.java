package JavaPart3.Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        queue.offer("d");//to add
        System.out.println(queue);

//d->b->a->c
        var front = queue.peek();// return null when queue is empty- return queue front element
        System.out.println(front);
        var front1 = queue.element();//return exception when empty - return queue front element
        System.out.println(front1);

        var front2 = queue.remove();//remove the item in the front and returned it -> throw exception
        System.out.println(front2);
        var front3 = queue.poll();//remove the item in the front and returned it -> return null when empty
        System.out.println(front3);


        System.out.println(queue);




    }
    
}

package JavaPart3.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStremsDemo {
  public static void show(){
            //GENERATE INFINITE STREAMS - part 2 
            Stream.iterate(1, n->n+1)   //infinite stream
                  .limit(10)           //limit
                  .forEach(n-> System.out.println(n)); //operation



      //GENERATE INFINITE STREAMS - part 1
      // var stream= Stream.generate(()->Math.random());  //creating a stream
      // stream
      // .limit(3)  //apply one or more transformation in streams
      // .forEach(n->System.out.println(n));  //operations that actually terminates the stream





     //STREAMS FROM ARBITARY NUMBER OF OBJECTS
     //Stream.of(1,2,3,4);






    //  // stream in array
    //   int [] numbers = {1,2,3};
    //   Arrays.stream(numbers)
    //         .forEach(n->System.out.println(n));


    //   //streams in ArrayList
    //   var list = new ArrayList<>();
    //   list.stream();
    //   //stream in collection
    //   Collection<Integer> x;
    //   x.stream();
  }  
}

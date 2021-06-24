package JavaPart3.Streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show(){





        
        //FLAT MAP METHOD - Stream<List<x>> -> Stream<x>
        // var stream =Stream.of(List.of(1,2,3), List.of(4,5,6)); //stream of list of integer
        // stream
        //       .flatMap(list ->list.stream()) //convert object list to flat integer
        //       .forEach(list ->System.out.println(list));



















        // List<Movie> movies = List.of(
        //     new Movie("a", 10),
        //     new Movie("b",15),
        //     new Movie("c", 20)
        // );
       
        // movies.stream()
        //       .map(movie ->movie.getTitle()) //extract single parameter from object
        //       .forEach(name->System.out.println(name));
        // movies.stream()
        //         .mapToInt(movie->movie.getLikes())
        //         .forEach(likes->System.out.println(likes));
       //IMPERATIVE PROGRAMMING
        // int count = 0;
        // for(var movie: movies)
        // if(movie.getLikes()>10)
        // count++;
    
    //DECLARATIVE (FUNCTIONAL PROGRAMMING)
    // var count2 =movies.stream()
    // .filter(movie->movie.getLikes()>10)
    // .count();  
    }  
}

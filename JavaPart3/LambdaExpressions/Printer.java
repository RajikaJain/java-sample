package JavaPart3.LambdaExpressions;

public interface Printer {
    void print(String message);

    // //bad approach
    // default void printTwice(String message){
    //  System.out.println(message);
    //  System.out.println(message);

    // }
    
}

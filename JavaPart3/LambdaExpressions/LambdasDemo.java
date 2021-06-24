package JavaPart3.LambdaExpressions;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
 public class LambdasDemo {
     //UNARY OPERATOR INTERFACE
 public static void show(){
     UnaryOperator<Integer> square = n-> n*n;
     UnaryOperator<Integer> increment = n-> n+1;

     var result = increment.andThen(square).apply(1);
     System.out.println(result);
 }











    //public static void show(){
    //CHAINING BINARY OPERATOR
    //A,B ->a+b -> square
    // BinaryOperator<Integer> add = (a,b) -> a+b;
    // Function<Integer, Integer> square = (a) ->a*a;

    // var result = add.andThen(square).apply(1,2);
    // System.out.println(result);




    //a,b -> a+b
    //BinaryOperatorInterface
    //   BinaryOperator<Integer> add = (a,b)->a+b;
    //   var result = add.apply(1,2);
    //   System.out.println(result);
    //}








//    //COMBINING PREDICATES
//  public static void show(){
//    Predicate<String> hasLeftBrace = str-> str.startsWith("{");
//    Predicate<String> hasRightBrace = str-> str.endsWith("}");

//    Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
//    var result = hasLeftAndRightBraces.test("{key:value}");
//    System.out.println(result);

   
//  }












//    //PREDICATE INTERFACE
//  public static void show(){
//    Predicate<String> isLongerThan5 = str->str.length() >5;
//    var result = isLongerThan5.test("sky");
//    System.out.println(result);
//  }


















//  //COMPOSING FUNCTIONS
//   public static void show(){
//     //"key:value"
//     //first : "key= value"
//     //second : "{key= value}"
//     Function<String, String> replaceColon = str->str.replace(":","=");
//     Function<String, String> addBraces = str->"{"+ str+ "}";
//     //Declarative programming
//     var result = replaceColon
//                  .andThen(addBraces)
//                  .apply("key:value");
     
//     var result1 = addBraces
//                   .compose(replaceColon)
//                   .apply("key:value");
//     System.out.println(result1);
//   }












//  //FUNCTION INTERFACE
// public static void show(){
//   Function<String,Integer> map = str ->str.length();
//   var length = map.apply("Sky");
//   System.out.println(length);
// }










//    //SUPPLIER INTERFACE
// public static void show(){
//  // Supplier<Double> getRandom = ()->{return Math.getRandom();}
//  Supplier<Double> getRandom = () -> Math.random();
//   var random = getRandom.get(); //lazy evaluation
//   System.out.println(random);
// }











// //Chain Consumers
// public static void show(){
//   List<String> list = List.of("a","b","c");
//   Consumer<String> print = item->System.out.println(item);
//   Consumer<String> printUpperCase = item->System.out.println(item.toUpperCase());

//   list.forEach(print.andThen(printUpperCase)); //chaining two lambda expression
//   list.forEach(print.andThen(printUpperCase).andThen(print)); //chaining 3 lambda expression
// }


















//Consumer interface
//   public static void show(){
//     List<Integer> list = List.of(1,2,3);

//     //Imperative Programming - implementing logic using instruction - egg -for loop , if/else, switch/case
//     for(var item :list)
//     System.out.println(item);
//     //Declarative programming - instead of using instructions to specify how it should be done we specify what needs to be done
//     list.forEach(item ->System.out.println(item)); //consumer interface 
//   }












//METHOD REFRENCE - CONSTRUCTOR
// public LambdasDemo(String message) {}

// public void show(){

// greet(message -> new LambdasDemo(message)); 
// greet(LambdasDemo::new);//constructor - new

// }
// public static void greet(Printer printer) {
//   printer.print("Hello World");
// }









//METHOD REFRENCE TYPE 2 - instance method
// public void print(String message){}

// public void show(){
// var demo = new LambdasDemo();
// greet(message -> demo.print(message)); 
// greet(demo::print);

// }
// public static void greet(Printer printer) {
//   printer.print("Hello World");
// }












// //METHOD REFRENCE TYPE 2 - staic methods
// public static void print(String message){}

// public void show(){

// greet(message ->print(message));  
// greet(LambdasDemo::print);
// }
// public static void greet(Printer printer) {
//   printer.print("Hello World");
// }












    //public void show(){
    //     //METHOD REFRENCE TYPE 1
    //     greet(message -> System.out.println(message));  
    //      greet(System.out::println);//method refrence
    //    }
    //    public static void greet(Printer printer) {
    //        printer.print("Hello World");
    //    }


















 //Variable Capture -2 ACCESS INSTANCE FIELD
 //public  String prefix1 = "-";
//  public void show(){
//       String prefix = "-";
//       greet(message -> System.out.println(prefix +message+prefix1));  //access instance field
       
//      }
//      public static void greet(Printer printer) {
//          printer.print("Hello World");
//      }










    // //Variable Capture
    // public static String prefix1 = "-";
    // public static void show(){
    //      String prefix = "-";
    //      greet(message -> System.out.println(prefix +message+ prefix1));  //access local varable in lambda expression as well as staic field of inclosing class 
          
    //     }
    //     public static void greet(Printer printer) {
    //         printer.print("Hello World");
    //     }















         // public static void show(){
        // //LAMBDA EXPRESSION
        //  //greet((String message) -> {System.out.println(message);});//lambda expression
        //  greet(message -> System.out.println(message));   //lambda expression in more simplified format
        //  Printer printer = message -> System.out.println(message); //passing lambda expression to variable
        // }
        // public static void greet(Printer printer) {
        //     printer.print("Hello World");
        // }















    //Annonymous inner class
    // public static void show(){
    //         greet(new Printer(){
    //             @Override
    //             public void print(String message){
    //                 System.out.println(message);
    //             }
    //         });//Anonymous inner class
    //     }
    //     public static void greet(Printer printer) {
    //         printer.print("Hello World");
    //     }
















    //functional interface
    // public static void show(){
    //     greet(new ConsolePrinter());
    // }
    // public static void greet(Printer printer) {
    //     printer.print("Hello World");
    // }
}

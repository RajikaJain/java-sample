package JavaPart3.LambdaExpressions;

public class LambdasDemo {

//METHOD REFRENCE - CONSTRUCTOR
public LambdasDemo(String message) {}

public void show(){

greet(message -> new LambdasDemo(message)); 
greet(LambdasDemo::new);//constructor - new

}
public static void greet(Printer printer) {
  printer.print("Hello World");
}









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

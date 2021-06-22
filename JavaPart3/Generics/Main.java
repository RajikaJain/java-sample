package JavaPart3.Generics;

import javax.sound.midi.Instrument;

public class Main {




















    
    //ITERATABLE INTERFACE
// public static void main(String [] args){
//     var list = new GenericList<String>();
//     list.add("a");
//     list.add("b");
//     list.add("c");
//     //using for loop
//     for(var item :list)
//     System.out.println(item);

//     //using while loop
//     var iterator = list.iterator();
//     while(iterator.hasNext()){//read
//         var current = iterator.next();//give value
//         System.out.println(current);
//     }
// }












    
//     //cOLLECTIONS - ITERABLE INTERFACE
// public static void main(String[] args){
//     var list = new GenericList<String>();
//     list.add("a");
//     list.add("b");
//     for(var item: list.items)//we have exposed the internal implementation of the class to the outside
//     //in oop changing the internal implementation should not impact its public interface
//     System.out.println(item);
// }








//WILDCARD
// public static void main(String[] args){
// var instructors = new GenericList<Instructor>();
// var users = new GenericList<User>();
// //Utils.printUsers(instructors);
// Utils.printUsers(users);
// //Utils.printUsers(new GenericList<Integer>());
// //Utils.printUsers(new GenericList<String>());
// }



















//     //GENERIC CLASSES AND INHRITANCE

// public static void main(String[] args){
//     // User user = new Instructor(10);//if we have a variaable of type user we can set it to the instance of user class or any of iits derivatives like the instructor class  
//     // Utils.printUser(new Instructor(20));
//     // var users = new GenericList<User>();//if we change User to Instructor we get a compilation error
//     // //the generic list of instructor is not a sub type of generic list of user.
//     // // we olny have single generic list in a project and this class is not a subtype of itself 
//     // Utils.printUsers(users);
//     //below code is there to solve this problem
//     var instructors = new GenericList<Instructor>();
//     var users = new GenericList<User>();
//     Utils.printUsers(users);
// }













    
//     //MULTIPLE TYPE PARAMETER
//     public static void main(String[] args){
//     Utils.print(1,"raji");
// }










    
//     //GENERIC METHODS
// public static void main(String[] args){
//     var max =Utils.max(1,3);
//     System.out.println(max);
//     var max1 = Utils.max(new User(10), new User(20));
//     System.out.println(max1);

// }




















//     //COMPARABLE INTERFACE
// public static void main(String[] args){
//     var user1 = new User(10);
//     var user2 = new User(20);
//     int result = user1.compareTo(user2);
//     if(result < 0)
//     System.out.println("User1<user2");
//     else if(result == 0)
//     System.out.println("User1==user2");
//     else 
//     System.out.println("User1 > user2");

// }


















// //CONSTRAINTS
// public static void main(String[] args){
//     new GenericList<Float>();
//     new GenericList<User>();
// }













//     //GENERIC TYPES THAT WORK WITH PRIMITIVE VALUES
//        public static void main(String[] args){
//     GenericList<Integer> numbers = new GenericList<>();
//     numbers.add(1); //Boxing - java compile create instance of Integer class and put this value inside the box
//     int number = numbers.get(0);//Unboxing - extract the value which is stored in integer object
//    }








    
//   //GENERICS CLASS
//   public static void main(String[] args){
//       var list = new GenericList<Integer>();
//       list.add(1);
//       int number = list.get(0);
//       var list1 = new GenericList<User>();
//       list1.add(new User());
//       User user = list1.get(0);
//       //Our code become cleaner and we get compile time type safely so we can catch our mistake at compile time 
//   }














    // THE POOR SOLUTION
    // public static void main(String[] args){
    //     var list = new List();
    //         //list.add(1);
    //         list.add(Integer.valueOf(1));
    //         list.add("1");
    //         list.add(new User());

    //         int number = (int)list.get(1);// problem that we only get to know in run time
    //      }












    //THE NEED OF GENERICS
    // public static void main(String[] args){
    //     var list = new List();
    //     list.add(1);
    // }
}

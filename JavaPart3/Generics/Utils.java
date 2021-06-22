package JavaPart3.Generics;

public class Utils {
    //GENERIC CLASSES AND INHERITANCE
 public static void printUser(User user) { 
     System.out.println(user);
     //Since we get a user here we can pass an instance of user class or any of its derivatives 
 }
    // public static void printUsers(GenericList<User> users) {
    
    // }
    //class CAP#1 extends User{}
//  public static void printUsers
//     (GenericList<? extends User> users) {
// //TO SOLVE THIS PROBLEM REPLACE USER WITH ? called wildcard character
// User x = users.get(0);//return an instance of capture class
//    //with the extends keyword we only have right to read from generic list if we wan to add to it we should use super keyword
// }

public static void printUsers
(GenericList<? super User> users) {
GenericList<Object> temp = new GenericList<>();
users.add(new User(1));
users.add(new Instructor(2));
//if we use super keyword we cannot read from the list
//User x = users.get(0); error
Object x = users.get(0);
}












    
//MULTIPLE TYPE PARAMETER
// public static <K, V> void print(K key, V value) {
//     System.out.println(key+ " = "+value);
// }












    //GENERIC METHODS
    // public static <T extends Comparable<T>> T max(T first, T second) {
    //     return(first.compareTo(second)<0)?second:first;
    // }
    
}

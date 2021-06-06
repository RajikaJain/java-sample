package javaPackage;

import java.util.Scanner;

public class ReadingInput {
public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter Age:") ;
  // byte age = scanner.nextByte();
 //  System.out.println("Your age is "+age);
   System.out.print("Name");
   String name = scanner.nextLine().trim();
   System.out .println("Your name is "+name);
}    
}

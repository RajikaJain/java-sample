package ControlAndFlow;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
    for(int i=0;i<5;i++)
      System.out.println("Hello World" +(i+1));
     
    String input ="";
    Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.print("Input :");
        input= scanner.nextLine().toLowerCase();
       if(input.equals("pass"))
       continue;
        if(input.equals("quit"))
        break;
        System.out.println(input);
    }
    String input1="";
    do{
        System.out.print("Input :");
        input1= scanner.nextLine().toLowerCase();
        System.out.println(input1);
    } while(!input1.equals("quit"));
    }
    
}

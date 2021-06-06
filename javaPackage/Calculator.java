package javaPackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
      System.out.print("Principal :");
      Scanner scanner = new Scanner(System.in);
      int principal = scanner.nextInt();
      System.out.print("Rate :");
      Scanner scanner2 = new Scanner(System.in);
      double rate = scanner2.nextDouble();
      System.out.print("Time :");
      Scanner scanner3 = new Scanner(System.in);
      byte time = scanner3.nextByte();
      double result = (principal*rate*time)/100;
      String currency = NumberFormat.getCurrencyInstance().format(result);
      System.out.println("Simple Interest : "+currency);
      
    }
    
}

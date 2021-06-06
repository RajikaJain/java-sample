package javaPackage;

import java.text.NumberFormat;
import java.util.Scanner;


public class MortgageCalculator {
    public static void main(String[] args){
        final byte MonthInYear=12;
        final byte Percentage =100;
        System.out.print("Principal :");
      Scanner scanner = new Scanner(System.in);
      int principal = scanner.nextInt();
      System.out.print("Rate :");
      Scanner scanner2 = new Scanner(System.in);
      double rate = scanner2.nextDouble();
      rate = rate/Percentage/MonthInYear;
      System.out.print("Time :");
      Scanner scanner3 = new Scanner(System.in);
      byte time = scanner3.nextByte();
      int numberOfPayments = time*MonthInYear;
      double mortgage = principal*(rate*Math.pow(1+rate, numberOfPayments))/
                         (Math.pow(1+rate, numberOfPayments)-1);
     String result=NumberFormat.getCurrencyInstance().format(mortgage);
     System.out.println(result);
    }
    
}

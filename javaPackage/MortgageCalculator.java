package javaPackage;

import java.text.NumberFormat;
import java.util.Scanner;


public class MortgageCalculator {
    public static void main(String[] args){
        final byte MonthInYear=12;
        final byte Percentage =100;
        Scanner scanner = new Scanner(System.in);
        int principal;
        double rate;
        byte time;
        while(true){
      System.out.print("Principal ($1k - $1M) :");
       principal = scanner.nextInt();
      if(principal>=1000&&principal<=1000000)
      break;
      else System.out.println("Enter the number between 1,000 to 1,000,000");
    }
    while(true){
      System.out.print("Rate :");
       rate = scanner.nextDouble();
      if(rate>0&&rate<=30)
      break;
      else
      System.out.println("Enter the value greater than 0 and less than equal to 30 ");}
      rate = rate/Percentage/MonthInYear;
      while(true){
      System.out.print("Time :");
       time = scanner.nextByte();
       if(time>0&&time<=30)
       break;
       else
       System.out.println("Enter the value between 0 and 30");
    }
      int numberOfPayments = time*MonthInYear;
      double mortgage = principal*(rate*Math.pow(1+rate, numberOfPayments))/
                         (Math.pow(1+rate, numberOfPayments)-1);
     String result=NumberFormat.getCurrencyInstance().format(mortgage);
     System.out.println("Your monthly mortgage calculation is"+result);
    }
    
}

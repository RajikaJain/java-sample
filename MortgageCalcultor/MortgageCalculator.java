package javaPackage;
import java.text.NumberFormat;
import java.util.Scanner;


public class MortgageCalculator {
    final static byte MonthInYear=12;
    final static byte Percentage =100;
    public static void main(String[] args){
        
        int principal= (int)readNumber("Principal :", 1000, 1_000_000);
        double rate=readNumber("Rate :",1,30);
        byte time = (byte)readNumber("Time :",1,30);
        printMortgage(principal, rate, time);
        printPaymentSummary(principal, rate, time);
    }

    private static void printMortgage(int principal, double rate, byte time) {
        double result = calculateMortgage(principal, rate, time);
        String results=NumberFormat.getCurrencyInstance().format(result);
        System.out.println("MORTGAGE\n--------");
        System.out.println("Monthly Payments: "+results);
    }

    private static void printPaymentSummary(int principal, double rate, byte time) {
        System.out.println("\nPAYMENT SCHEDULE\n----------------");
        for(short month=1;month<=time*MonthInYear;month++)
        {
            double balance =calculateBalance(principal, rate, time, month);
            String balance_format =NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balance_format);
        }
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true){

            System.out.print(prompt);
             value = scanner.nextDouble();
             if(value>=min&&value<=max)
             break;
             else
             System.out.println("Enter the value between "+min +"and "+max);}
             return value;
    }
    public static double calculateMortgage(
    int principal,
    double rate,
    byte time){
       
        rate = rate/Percentage/MonthInYear;
        short numberOfPayments = (short)(time*MonthInYear);
        double mortgage = principal*(rate*Math.pow(1+rate, numberOfPayments))/
        (Math.pow(1+rate, numberOfPayments)-1);
        return mortgage;
    }
    public static double calculateBalance(
        int principal,
    double rate,
    byte time,
    short numberOfPaymentsMade
    ){
       
        rate = rate/Percentage/MonthInYear;
        short numberOfPayments = (short)(time*MonthInYear);    
        double balance = principal
        *(Math.pow(1+rate,numberOfPayments)-Math.pow(1+rate, numberOfPaymentsMade))/
        (Math.pow(1+rate,numberOfPayments)-1);
        return balance;
    }
}

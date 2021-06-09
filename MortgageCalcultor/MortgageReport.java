package MortgageCalcultor;

import java.text.NumberFormat;

public class MortgageReport {
     private  final static byte MonthInYear=12;
     final static byte Percentage =100;
    private static MortgageCalculation calculator;
    public static void printMortgage(int principal, double rate, byte time) {
        calculator = new MortgageCalculation(principal, rate, time);

        double result = calculator.calculateMortgage(principal, rate, time);
        String results=NumberFormat.getCurrencyInstance().format(result);
        System.out.println("MORTGAGE\n--------");
        System.out.println("Monthly Payments: "+results);
    }

    public static void printPaymentSummary(int principal, double rate, byte time) {
        System.out.println("\nPAYMENT SCHEDULE\n----------------");
        for(short month=1;month<=time*MonthInYear;month++)
        {
            double balance =calculator.calculateBalance(principal, rate, time, month);
            String balance_format =NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balance_format);
        }
    } 
}

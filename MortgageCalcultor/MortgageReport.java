package MortgageCalcultor;

import java.text.NumberFormat;

public class MortgageReport {
    // private final static byte MonthInYear=12;
    // private final static byte Percentage =100;
    private final NumberFormat currency;
     private MortgageCalculation calculator;
     public MortgageReport(MortgageCalculation calculator) {this.calculator=calculator;
    currency= NumberFormat.getCurrencyInstance();
    } 

    public void printMortgage(int principal, double rate, byte time) {
        calculator = new MortgageCalculation(principal, rate, time);

        double result = calculator.calculateMortgage();

        String results=currency.format(result);
        System.out.println("MORTGAGE\n--------");
        System.out.println("Monthly Payments: "+results);
    }

    public void printPaymentSummary() {
        System.out.println("\nPAYMENT SCHEDULE\n----------------");
        for(double balance:calculator.getRemainingBalance())
       // String balance_format =NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(currency.format(balance));
       
    } 
}

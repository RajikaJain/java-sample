package MortgageCalcultor;

public class MortgageCalculation {

    private int principal;
    private float rate;
    private byte time;

    public MortgageCalculation
    (int principal, float rate, byte time)
    {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }
    public double calculateMortgage(
       ){
        
            rate = rate/MortgageCalculator.Percentage/MortgageCalculator.MonthInYear;
            short numberOfPayments = (short)(time*MortgageCalculator.MonthInYear);
            double mortgage = principal*(rate*Math.pow(1+rate, numberOfPayments))/
            (Math.pow(1+rate, numberOfPayments)-1);
            return mortgage;
        }
    
        public double calculateBalance(
       
        short numberOfPaymentsMade
        ){
        
            rate = rate/MortgageCalculator.Percentage/MortgageCalculator.MonthInYear;
            short numberOfPayments = (short)(time*MortgageCalculator.MonthInYear);    
            double balance = principal
            *(Math.pow(1+rate,numberOfPayments)-Math.pow(1+rate, numberOfPaymentsMade))/
            (Math.pow(1+rate,numberOfPayments)-1);
            return balance;
        }
           
}

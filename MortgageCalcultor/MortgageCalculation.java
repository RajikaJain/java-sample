package MortgageCalcultor;

public class MortgageCalculation {
    private final static byte MonthInYear=12;
    private final static byte Percentage =100;
    private int principal;
    private double rate;
    private byte time;

    public MortgageCalculation(int principal, double rate, byte time){
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }
    public double calculateMortgage(){
            double rate1 = getMonthlyRate();
            int numberOfPayments = numberOfPayments();
            double mortgage = principal*(rate1*Math.pow(1+rate1, numberOfPayments))/
            (Math.pow(1+rate1, numberOfPayments)-1);
            return mortgage;
    }
    private double getMonthlyRate() {
        return rate/Percentage/MonthInYear;
    }
    
        public double calculateBalance(short numberOfPaymentsMade){
            double rate1 = getMonthlyRate();
            short numberOfPayments = numberOfPayments();    
            double balance = principal*(Math.pow(1+rate1,numberOfPayments)-Math.pow(1+rate1, numberOfPaymentsMade))/
            (Math.pow(1+rate1,numberOfPayments)-1);
            return balance;
           
        }
        private short numberOfPayments() {
            short numberOfPayments = (short)(time*MonthInYear);
            return numberOfPayments;
        }
        public double[] getRemainingBalance() {
            double [] balances = new double[numberOfPayments()];
            for(short month=1;month<=numberOfPayments();month++)
            balances[month-1]=calculateBalance(month);
            return balances;        
        }
}

package MortgageCalcultor;

public class MortgageCalcMain {
  public static void main(String[] args){
       var console = new Console();
        int principal= (int)console.readNumber("Principal :", 1000, 1_000_000);
        double rate=console.readNumber("Rate :",1,30);
        byte time = (byte)console.readNumber("Time :",1,30);

        var calculator = new MortgageCalculation(principal, rate, time);
        var report = new MortgageReport(calculator);

        report.printMortgage(principal, rate, time);
        report.printPaymentSummary();
    
  }  
}

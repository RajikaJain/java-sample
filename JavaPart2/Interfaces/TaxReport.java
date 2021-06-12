package JavaPart2.Interfaces;

public class TaxReport {
    private TaxCalculator calculator;
    
    
    //Constructor injection -> only work with interface this is called programming against interfaces
    // public TaxReport(TaxCalculator calculator) {
    //     this.calculator=calculator;
    // }
    
    //Method injection
    public void show(TaxCalculator calculator){
       var tax = calculator.calculateTax();
        System.out.println(tax);
    }
    //setter injection->allow dependency of class change during runtime
    // public void setCalculator(TaxCalculator calculator) {
    //     this.calculator = calculator;
    // }
    
}

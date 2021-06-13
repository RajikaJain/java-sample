package JavaPart2.Interfaces;

public abstract class AbstractTaxCalc implements TaxCalculator {
   
   protected double getTaxableIncome(double income, double expenses){
    return income - expenses;} 
}

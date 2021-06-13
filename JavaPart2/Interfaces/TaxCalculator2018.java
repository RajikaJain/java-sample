package JavaPart2.Interfaces;

public class TaxCalculator2018 extends AbstractTaxCalc{
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome)
    {
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double calculateTax(){
        //TaxCalculator.minimumTax=100;
        //getTaxableIncome(income, expenses)
        return taxableIncome*0.3;
    } 
    
}

package JavaPart2.Interfaces;

public class TaxCalcMain {
    public static void main(String[] args)
    {   //poorman dependency injection
        //for ease use dependency injection framework
        //constructor injection -responsible for inject concrete implementation
       
        // var calculator = new TaxCalculator2018(100_000);
        // var report = new TaxReport(calculator);
        // report.show();
        
        //setter injection code-> change the dependency throughout lifetime of a class
        // report.setCalculator(new TaxCalculator2019());
        // report.show();
        
        // Method dependency -pass dependency to the method which need that dependency
           var calculator = new TaxCalculator2018(100_000);
           var report = new TaxReport();
           report.show(calculator);
           report.show(new TaxCalculator2019());
    }    
}

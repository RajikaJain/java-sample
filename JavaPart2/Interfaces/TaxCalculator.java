package JavaPart2.Interfaces;

public interface TaxCalculator {
    //small and light weight
    //public static final field  
    //bad feature
    // float minimumTax=100;//bad
    //are this field are constants and final so we cannot change there value in future
     double calculateTax(); //good

     /*static methods in interface
     bad feature
     static double getTaxableIncome(double income, double expenses){
     return income - expenses;}
     instead of above logic define it in abstract class that can be used by all its children*/

     /*private methods in Interface
      */
}

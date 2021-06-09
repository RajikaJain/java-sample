package MortgageCalcultor;

public class MortgageCalcMain {
  public static void main(String[] args){
      var console = new Console("Principal :", 1000, 1_000_000);
     double value = console.getValue();
     System.out.println(value);
  }  
}

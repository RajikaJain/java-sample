package ControlAndFlow;

public class LogicalOperator {
    public static void main(String[] args){

      int temperature = 22;
      boolean isWarm = temperature>20&&temperature<30;
      System.out.println(isWarm); 
      boolean hasHighIncome = true;
      boolean hasGoodCredit = false;
      boolean hasCriminalRecord = true;
      boolean isEligible =( hasGoodCredit||hasHighIncome)&& !hasCriminalRecord;
      System.out.println(isEligible);
    }
    
}

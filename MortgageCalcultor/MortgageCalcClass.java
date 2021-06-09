package MortgageCalcultor;

import java.util.Scanner;

public class MortgageCalcClass {
   // final private byte MonthInYear=12;
   // final private byte Percentage =100;
   // private double value;
    
    public double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true){

            System.out.print(prompt);
             value = scanner.nextDouble();
             if(value>=min&&value<=max)
             break;
             else
             System.out.println("Enter the value between "+min +"and "+max);}
             return value;
    }
}

package MortgageCalcultor;

import java.util.Scanner;

public class Console {

    //private double result;
    private Scanner scanner = new Scanner(System.in);
    public double readNumber(String prompt, double min, double max){
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
    public double readNumber(String prompt){
        System.out.print(prompt);
        double value =scanner.nextDouble();
        return value;
    }

}
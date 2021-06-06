package ControlAndFlow;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int temperature = scanner.nextInt();
    if (temperature>30)
    {
        System.out.println("It's a hot day");
        System.out.println("Drink plenty of water");
    }
    else if (temperature>20)
    System.out.println("Its a nice day");
    else
    System.out.println("Its cold");

    int income = 120_000;
    boolean hasHighIncome =(income>100_000);
    
    

    }
    
}

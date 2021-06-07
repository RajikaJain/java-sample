package DebugAndDeploy;

public class debugging {
 public static void main(String[] args){
     System.out.println("Start");
     printNumber(4);
     System.out.println("Finish");

 }   
 public static void printNumber(int limit){
     for(int i=0;i<=limit;i++)
     System.out.println(i);
 }
}

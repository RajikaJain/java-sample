package javaPackage;

import java.util.Date;


import java.awt.*;

public class Main {
    public static void main(String[] args){

    byte age = 30;
        System.out.println(age);
        System.out.println("Hello World!");
        //primitive data type
        
    int viewsCount = 123_456_789;
    long viewcounts= 3_123_456_789L;
    float price = 10.99F;
    char letter = 'A';
    boolean isEligible = false;
    //refrence type
    Date now = new Date();
    System.out.println(now);
    //primitive types vs refrence types
    byte x =1;
    byte y =x;
    //x=2;
    System.out.println(y);
    Point point1 = new Point(x,y);
    Point point2 = point1;
    point1.x=2;
System.out.println(point2);
//string
String message ="Hello world"+"!!";
System.out.println(message.replace("!","*")
);
//message.endwith("!!")
String escape = "Hello\"Raji\" ";
System.out.println(escape);
String address = "C:\\Windows\\...";
System.out.println(address);
    }
}

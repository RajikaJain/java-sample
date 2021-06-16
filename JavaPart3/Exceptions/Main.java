package JavaPart3.Exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        // rethrowing exceptions,custom exceptions,chaining  exceptions
    try {
        ExceptionDemo.show();
    } catch (Throwable e) {
        // TODO Auto-generated catch block
        System.out.println("an unexpected error occured.");
    }
}
}

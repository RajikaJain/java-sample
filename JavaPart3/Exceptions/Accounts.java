package JavaPart3.Exceptions;

import java.io.IOException;
import java.lang.reflect.InaccessibleObjectException;

public class Accounts {
    //  UNCHECKED_EXCEPTIONS
    // public void deposit(float i) {
    //     if(i<=0)
    //     throw new IllegalStateException();//defensive programming
    // }

    //  CHECKED_EXCEPTIONS
    private float balance;
    public void deposit(float value) throws IOException{
        if(value<=0)
        throw new IOException();

     }
     //Custom exceptions
     public void withdraw(float value) throws AccountExceptions {
       if(value>balance){
     
        // throw new InsufficientFundsException();// this case belongs to a custom exception which we should anticipate and recover from
     // var fundsExceeded = new InaccessibleObjectException();
    // var accountExceptions = new AccountExceptions( new InaccessibleObjectException());
      //accountExceptions.initCause(fundsExceeded);
     // throw accountExceptions;
     throw new AccountExceptions( new InaccessibleObjectException());
    }
     }
    
}

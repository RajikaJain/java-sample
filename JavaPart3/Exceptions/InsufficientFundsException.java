package JavaPart3.Exceptions;
//checked -> Exception 
//unchecked -> RuntimeException
public class InsufficientFundsException extends Exception{
public InsufficientFundsException(){
    super("Insufficient funds in your Account.");
}
 public InsufficientFundsException(String message){
     super(message);
 }   
}

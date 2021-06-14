package JavaPart3.Exceptions;

public class Accounts {

    public void deposit(float i) {
        if(i<=0)
        throw new IllegalStateException();//defensive programming
    }
    
}

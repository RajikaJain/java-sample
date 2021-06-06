package CleanCoading;

public class CreatingMethods {
    public static void main(String[] args){
        String string =greetUser("Rajika", "Jain");
        System.out.println(string);
    }
    public static String greetUser(String firstName, String lastName){
       return "Hello " +firstName+" " +lastName;
    }
    
}

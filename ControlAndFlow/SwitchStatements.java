package ControlAndFlow;

public class SwitchStatements {
    public static void main(String[] args){
        String role = "fghjkl";
    switch (role){
        case "admin":
        System.out.println("You are an admin");
        break;
        case "moderator":
        System.out.println("You are moderator");
        break;
        default:
        System.out.println("You are a guest");

    }
    }
}

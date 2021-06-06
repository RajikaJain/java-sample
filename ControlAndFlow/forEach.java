package ControlAndFlow;

public class forEach {
    public static void main(String[] args){
    String[] fruits ={"Apple","Mango","Banana","Papaya"};
    for(int i = 0; i < fruits.length;i++)
    System.out.println(fruits[i]);
    for (String string : fruits) {
        System.out.println(string);
        
    }

    }
    
}

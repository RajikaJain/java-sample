package JavaPart2.ClassesAndObjects;

public class Main {
    public static void main(String[] args){
    var textbox1 = new Textbox();
  //  var textbox2 = textbox1;

    textbox1.setText("Box 1");
    System.out.println(textbox1.text.toUpperCase());
   var textbox2 = new Textbox();
    textbox2.setText("Hello world");
    System.out.println(textbox2.text.toUpperCase());
}
}

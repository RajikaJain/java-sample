package JavaPart3.Exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ExceptionDemo {
  //RETHROWING EXCEPTIONS
  public static void show() {
    var account = new Accounts();
    try {
      account.withdraw(10);
    } catch (AccountExceptions e) {
      // TODO Auto-generated catch block
   //  System.out.println(e.getMessage());
     var cause = e.getCause();
     System.out.println(cause.getMessage());
   //e.printStackTrace();
    }
    //  var account = new Accounts();

    //  try {
    //   account.deposit(-1);
    // } catch (IOException e) {
    //   System.out.println("Logging");
    //   throw e;
      // TODO Auto-generated catch block}
    }
  
 // public static void show(){
            //THROWING EXCEPTIONS
            //  var account = new Accounts();
            //  try {
            //   account.deposit(-1);
            // } catch (IOException e) {
            //   // TODO Auto-generated catch block
            //   e.printStackTrace();
            // }





              // THE TRY WITH RESOURCES STATEMENTS
              // try(
              //   var reader = new FileReader("file.txt");
              //   var writer = new FileWriter("...");
              // ){
              //   var value = reader.read();
              // } catch (IOException e) {
              //   System.out.println("Could not read data");
              //   e.printStackTrace();
              // }
    



//        THE FINALLY BLOCK
//      FileReader reader = null;
//     try {
//          reader = new FileReader("file.txt");
//          var value =reader.read();
//         System.out.println("File opened!");
//       } catch (FileNotFoundException ex) {
//         System.out.println("File not exist.");
//         System.out.println(ex.getMessage());
//         ex.printStackTrace();
//       } //checked exceptions
//  catch (IOException e) {
//         System.out.println("Could not read data");
//         e.printStackTrace();
//       }
//  finally{
//    if(reader != null){
//      try {
//        reader.close();
//   } catch (IOException e) {
//         e.printStackTrace();
//   }
// }
//  }




    // Catch multiple exceptions
    // try {
    //       var reader = new FileReader("file.txt");
    //       var value = reader.read();
    //       new SimpleDateFormat().parse("");
    //     }
    //      catch (FileNotFoundException ex) {
    //       ex.printStackTrace();
    //     } 

    //     catch (IOException e) {
    //      // IOException ex = new FileNotFoundException(); file not found exceptions extends IOexception
    //       System.out.println("Could not read data");
    //       e.printStackTrace();
    //     } 
    //     catch (ParseException e) {
        
    //       e.printStackTrace();
    //     }
   // catch (IOException | ParseException e) {Message}

      //sayHello(null); //exception -> null pointer exception//unchecked exception

    //  Catching exceptions checked exception
    //   try {
    //     var reader = new FileReader("file.txt");
    //     System.out.println("File opened!");
    //   } catch (FileNotFoundException ex) {
    //     System.out.println("File not exist.");
    //     System.out.println(ex.getMessage());
    //     ex.printStackTrace();
    //   } //checked exceptions
  //}

private static void sayHello(String message) {
System.out.println(message.toUpperCase());
} } 


import java.util.Scanner;


public class NumberInsanity {


   public NumberInsanity() { }


   public void go() {
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int num = myScanner.nextInt();
       String msg = result(num); // call helper method and store result 
       System.out.println(msg);
   }


   // helper method that returns string containing message to be printed
   private String result(int num) {
    return num<=0 ? "That isn't positive!" : num%2==1 ? num%5==0 ? num%7==0 ? "Divisible by 5 and 7!" : "Divisible by 5!" : num%7==0 ? "Divisible by 7!" : "Not divisible by 5 or 7!" : num<50 ? "Small even number!" : num>=50 ? num>=100 ? "Big even number!" :"Medium even number!" : "" ;

       // complete the code for this method;
       // make no other changes to the program
   }
}

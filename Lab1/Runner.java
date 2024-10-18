import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Runner {
   public static void main(String[] args) {

     // Tell the user to enter a question
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to the Magic 8 Ball!");
     System.out.print("Enter a yes-no question and I will answer it: ");
     String question = scan.nextLine();
     // Write a little program here to randomly choose
     // one of six responses to the user's yes-no question!
     ArrayList<String> tList = new ArrayList<String>();
     tList.add("It is certain");
     tList.add("It is decidedly so");
     tList.add("As I see it, yes");
     ArrayList<String> fList = new ArrayList<String>();
     fList.add("My reply is no");
     fList.add("Very doubtful");
     fList.add("Don't count on it");
     boolean tf = Math.random()<0.5;
     if(tf){
      System.out.println(tList.get((int)(Math.random() * (3 - 1) + 1)));
     }else{
      System.out.println(fList.get((int)(Math.random() * (3 - 1) + 1)));
     }
   }
}

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a lowercase word: ");
        String word = myScanner.nextLine();
        String first = word.substring(0, 1);  // get first letter

        if ( first.toLowerCase() == "a"|| first.toLowerCase() == "e"|| first.toLowerCase() == "i"|| first.toLowerCase() == "o"|| first.toLowerCase() == "u" ) {
            System.out.println("Your word begins with a vowel");
        } else {
            System.out.println("Your word begins with a consonant");
        }

        myScanner.close();

    }
}

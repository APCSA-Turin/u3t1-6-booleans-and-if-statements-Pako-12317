import java.util.ArrayList;
import java.util.Collections;
public class SelectionMadness {

    // no instance variables //
    
    public SelectionMadness() { }
  
    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
       ArrayList<String> lst = new ArrayList<String>();
       lst.add("You will have a good day.");
       lst.add("You will have a bad day.");
       lst.add("Today will be sunny.");
       lst.add("You will succeed.");
       lst.add("IDK");
       return lst.get((int)(Math.random()*4)+1);
    }
  
    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
       ArrayList<Integer> lrg = new ArrayList<Integer>();
       lrg.add(num1);
       lrg.add(num2);
       lrg.add(num3);
       return Collections.max(lrg);
    }
  
  }
  
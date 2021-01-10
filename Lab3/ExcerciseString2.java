/*
 * Author- @Ananya
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol 
 */
import java.util.Scanner;

public class ExcerciseString2 {
	 public String getImage(String str)
     {
            StringBuffer sbr = new StringBuffer(str);
            sbr.append('|');
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            sbr.append(sb);
            return sbr.toString();
     }

	public static void main(String[] args) {
		ExcerciseString2 p = new ExcerciseString2();
         Scanner s = new Scanner(System.in);
         System.out.println("Enter a String");
         String str = s.next();
         System.out.println(p.getImage(str));
	}


}

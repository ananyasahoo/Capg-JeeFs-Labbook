import java.util.Scanner;

/*
 * Author-@Ananya
 * . A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. 
 */
public class ExcerciseString8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    String str=scanner.next();
	    
	    if(checkString(str))
	    	System.out.print("Positive string");
	    else
	    	System.out.print("Negative string");
		}
		private static boolean checkString(String str)
		{
			char []arr=str.toCharArray();
			for(int index=0;index<str.length()-1;index++)
			{
				if(arr[index]>arr[index+1])
					return false;
			}
			return true;
		
	}

}

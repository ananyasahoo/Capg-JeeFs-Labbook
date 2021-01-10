/*
 * Author-@Ananya
 * Create a method which accepts a String and replaces all the consonants in the String with the next alphabet
 */
public class ExcerciseString3 {
	static boolean isVowel(char ch) 
    { 
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u')  
        { 
            return false; 
        } 
        return true; 
    } 

	private static String alterString(char [] input) {
		 for (int i = 0; i < input.length; i++) 
	        { 
	            if (!isVowel(input[i])) 
	            { 
	            	 if (input[i] == 'z')  
	                 { 
	                     input[i] = 'b'; 
	                 } 
	            	  else
	                  { 
	    
	                      
	                      input[i] = (char) (input[i] + 1);
	                      if (isVowel(input[i]))  
	                      { 
	                          input[i] = (char) (input[i] + 1); 
	                      } 
	                  } 
	              } 
	          } 
	          return String.valueOf(input); 
	      } 
	    
	           
	  
	   
	public static void main(String[] args) {
		String input="Digital";
		 System.out.println(alterString(input.toCharArray())); 
		

	}


}

/*
*Ananya Priyadarshini
* Date- 04/01/2021
* To check a number is power of two or not
*/


package checkNumber;

public class power {

	
	
		static boolean checkNumber (int n)
		{
			if(n==0)
			return false;

		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == 
			(int)(Math.floor(((Math.log(n) / Math.log(2)))));
		}

	
		public static void main(String[] args)
		{
			if(checkNumber (8))
			System.out.println("Yes");
			else
			System.out.println("No");
			
			
		}
		


	}



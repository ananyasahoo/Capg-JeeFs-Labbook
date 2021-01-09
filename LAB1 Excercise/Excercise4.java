/*
 * Date- 04/01/2021
 * a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer
 */
public class Excercise4 {
	public static void main(String[] args) {
		int n=5;
		Checkprime(n);
		
	}

	public static int Checkprime(int n) {
		
		int prime;
		
      	for(int i=2;i<n;i++)
		{
			prime=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
			    prime=1;
				
			}
			if(prime==0)
				System.out.println(i);
		}
     return 0;
	}
	
	
}

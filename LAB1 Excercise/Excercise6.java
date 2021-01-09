/*
*Ananya Priyadarshini
* Date- 04/01/2021
* calculate the difference between the sum of the squares and the square of the sum of the first n natural numbers.
*/

package calculateDiffreence;

     public class squareDifference {
		

		static int calculateDifference (int n){ 

		int sum=0,sum1=0,diff=0;
		
			for(int i=1;i<=n;i++)
			{
				sum=sum+(i*i);
				sum1=sum1+i;
				
			}
			diff=sum-(sum1*sum1);
			return diff;
		} 

		
		public static void main(String s[]) 
		{ 
			int n = 2; 
			System.out.println(calculateDifference (n));	 
			
		} 
		
		



	

}

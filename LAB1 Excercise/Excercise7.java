/*
*Ananya Priyadarshini
* Date- 04/01/2021
* To check a number is increasing or not
*/


public class IncreasingNum {

	public static void main(String[] args) {
	
		        
		        
		       int num=12345;
		       boolean flag = false;
		       int currentDigit = num % 10;
		       num = num/10;
		        
		      
		       while(num>0){
		           
		           if(currentDigit <= num % 10){
		               flag = true;
		               break;
		           }

		           currentDigit = num % 10;
		           num = num/10;
		       }
		        
		     
		       if(flag){
		           System.out.println("Digits are not in increasing order.");
		       }else{
		           System.out.println("Digits are in increasing order.");
		       }
		    }
		}

/*
 *: Create a method to accept date and print the duration in days, months and years with regards to current system date 
 * Author- @Ananya
 */
import java.time.*;

public class ExcerciseString9 {

	public static void main(String[] args) {
		 LocalDate pdate = LocalDate.of(2022, 01, 01);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.printf("\nDuration is %d years, %d months and %d days \n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());

		
		

	}

}

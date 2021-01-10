import java.util.Scanner;
import java.lang.Math;
public class ExcerciseString4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    String str=scanner.next();
	    System.out.print(modifyNumber(str));
		}
		private static String modifyNumber(String str)
		{
			StringBuilder st = new StringBuilder("");
			char []ch=str.toCharArray();
			int len=str.length();
			int digit1,digit2,dif;
			
			for(int index=0;index<len-1;index++)
			{
				digit1=(int)(ch[index]);
				digit2=(int)(ch[index+1]);
				dif=Math.abs(digit1-digit2);
				
				
				st=st.append(dif);
			}
			st.append(ch[len-1]);
			return st.toString();
		}
		

	}

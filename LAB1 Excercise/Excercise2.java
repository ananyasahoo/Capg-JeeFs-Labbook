
public class Excercise2 {
	public static void  Trafficlight(String str) {
		if (str=="red") {
			System.out.print("Stop");
		}
		if(str=="green") {
			System.out.print("Go");
		}
		if(str=="yellow"){
			System.out.print("Ready");
		}
		
		
	}

	public static void main(String[] args) {
		
		String str1 ="red";
		String str2="green";
		String str3="yellow";
		
		Trafficlight(str3);
		

	}

}

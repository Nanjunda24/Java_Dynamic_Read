package Input.functions;
import java.util.Scanner;

public class Substraction {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		

		System.out.print("Enter a value1 : ");
		int value1=s.nextInt();
		System.out.print("Enter a value2 : ");
		int value2=s.nextInt();
		
		int substraction=value1-value2;
		System.out.println("Thye substration value is = "+substraction);
		s.close();
		
	}
	
	

}

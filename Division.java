package Input.functions;
import java.util.Scanner;
public class Division {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		//Division 
		
		System.out.print("Enter a number1: ");
		float number1=s.nextFloat();
		System.out.print("Enter tghe number 2: ");
		float number2=s.nextFloat();
		
		float division=number1/number2;
		System.out.println("The division of two number is :" +division );
		s.close();
	}

}

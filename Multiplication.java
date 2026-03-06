package Input.functions;
import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter a value 1: ");
		int value1=s.nextInt();
		System.out.print("Enetr a value 2: ");
		int value2=s.nextInt();
		
		int multplication=value1*value2;
		
		System.out.println("The multiplication of two number="+multplication);
		s.close();
	}
	

}

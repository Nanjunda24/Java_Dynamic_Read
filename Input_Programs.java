package Input.functions;
import java.util.Scanner;

public class Input_Programs {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		//Enter your Age 
		
		System.out.println("Eneter your age : ");
		int age =s.nextInt();
		System.out.println("User age is : "+age );
		System.out.println("-----------------------------------------");
		
		//Enter your name .
		
		System.out.println("Enter your name :");
		
		String name=s.next();
		
		System.out.println("User name is : "+name);
		System.out.println("------------------------------------------");
		
		//Addition Operation 
		
	System.out.println("Enter a value1: ");
	int value1=s.nextInt();
	
	System.out.println("Enter a value2 : ");
	int value2=s.nextInt();
	
	int sum=value1+value2;
	
	System.out.println("Sum of two value is :"+sum);
	System.out.println("----------------------------------------------");
	
	//Substraction 
	
	int substraction=value1-value2;
	System.out.println("The substraction of two values is : "+substraction);
	System.out.println("----------------------------------------------------");
		
		
	s.close();	
	}

}

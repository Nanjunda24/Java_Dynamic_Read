package Input.functions;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter a number to check even or odd:  ");
		int num= s.nextInt();
		
		if(num%2==0) {
			System.out.println("The entered number is even :"+num);
		}
		else {
			System.out.println("Entered number is odd: "+num);
		}
		s.close();
	}

}

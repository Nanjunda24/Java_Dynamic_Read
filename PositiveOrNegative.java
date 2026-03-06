package Input.functions;
import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int num=s.nextInt();
		
		if(num>0) {
			System.out.println("Entered number is Positive :"+num);
		}
		else {
			System.out.println("Entered number is Negative :"+num);
		}
		s.close();
	}

}

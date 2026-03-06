package Input.functions;
import java.util.Scanner;
public class Scholarship {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter your percentage : ");
		float percentage=s.nextFloat();
		if(percentage>80) {
			System.out.println("Congratulation you are eligible to scholarship ");
		}
		else {
			System.out.println("Sorry you are not eligiblle to scholaship");
		}
		s.close();
		
	}

}

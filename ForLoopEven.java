package Input.functions;
import java.util.Scanner;

public class ForLoopEven {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		//even or odd from 1 to n 
		
		System.out.print("Enter a number :");
		int n=s.nextInt();
		for(int i=1; i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			else {
			}
		}
		s.close();
	}

}

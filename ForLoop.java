package Input.functions;
import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		
		//even or odd from 1 to n 
		
		System.out.print("Enter a starting number :");
		int start=s.nextInt();
		System.out.print("Enter a ending number: ");
		int n=s.nextInt();
		for(int i=start; i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
	}
		s.close();

}
}
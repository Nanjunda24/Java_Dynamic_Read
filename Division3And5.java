package Input.functions;
import java.util.Scanner;

public class Division3And5 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		//WAJP divided by 3 and  5 for number 
		
		System.out.println("Enter starting numkber : ");
		int num=s.nextInt();
		System.out.println("Enter a ending number : ");
		int n=s.nextInt();
		for(int i=num; i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+ " ");
			}
		}
		s.close();
	}

}

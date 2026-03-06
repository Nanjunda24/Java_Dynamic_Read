package Input.functions;
import java.util.Scanner;

public class VoweOrConsonant {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a character : ");
		char ch=s.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Entered character is vowel :"+ch);
		}
		else {
			System.out.println("Entered character is consonant :"+ch);
		}
		s.close();
	}

}

package Input.functions;
import java.util.Scanner;


public class MethodsInputFunction {
	
		public static void arithmeticOperations(int num1, int num2) {
			System.out.println("Addition: "+(num1+num2));
			System.out.println("Substraction: "+(num1-num2));
			System.out.println("Multiplication: "+(num1*num2));
			System.out.println("Division: "+(num1/num2));
			System.out.println("Remainder: "+(num1%num2));
		}
		
		public static void add(int a,int b) {
			System.out.println(a+b);
		}
		public static void sub(int a ,int b) {
			System.out.println(a-b);
		}
		public static void mul(int a, int b) {
			System.out.println(a*b);
		}
		public static void div(int a,int b) {
			System.out.println(a/b);
		}
		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			System.out.println("Enter two   numbers :");
			int x=s.nextInt();
			int y=s.nextInt();
			System.out.print("Adding two numbers :");
			add(x,y);                                         // Here not need to create object we can directly call the method because these are static method.
			System.out.print("Substraction of two number :");
			
			sub(x,y);
			System.out.print("Multiplication of two numbers: ");
			mul(x,y);
			System.out.print("Division of two numbers :");
			div(x,y);
			System.out.println("------------------All Operations------------------");
			arithmeticOperations(12,6);
			s.close();
			
		}
	}


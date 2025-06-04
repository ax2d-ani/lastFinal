package ranLab;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'a' value: ");
		int a=sc.nextInt();
		System.out.println("The factorial of "+a + " is: "+factorial(a));
	}
	
	public static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}

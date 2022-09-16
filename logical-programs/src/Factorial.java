import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int num,fc=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for factorial:");
		num=sc.nextInt();
		for(int i=num;i>0;i--) {
			fc *=i;
		}
		System.out.println("Factorial of "+num+" is : "+fc);
	}
}

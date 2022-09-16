import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int num,rn,nm;
		String num1="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		nm=num;
		while(num>0) {
			rn=num%10;
			num1=num1+rn;
			num=num/10;
		}
		int num2=Integer.parseInt(num1);
		if(nm==num2) {
			System.out.println("Number is palindrome");
		}
		else
			System.out.println("Number is not palindrome");
	}
}

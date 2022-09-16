import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int num,rn,sm=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		num=sc.nextInt();
		int nm=num;
		while(num>0) {
			rn=num%10;
			sm=sm+(rn*rn*rn);
			num=num/10;
		}
		if(sm==nm)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");
	}
}

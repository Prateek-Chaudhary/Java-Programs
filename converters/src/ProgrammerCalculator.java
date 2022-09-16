import java.util.Scanner;

public class ProgrammerCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String hex="",oct="",bin="";
		int dec;
		boolean condition=true;
		while(condition) {
			System.out.println("Choose the number format:");
			System.out.println("1. Decimal   2. Binary   3.Octal   4. Hexadecimal");
			int num=sc.nextInt();
			if(num==1) {
				System.out.println("Enter the Decimal Number");
				dec=sc.nextInt();
				boolean condition3=true;
				while(condition3) {
					System.out.println("Select the Number System in which you want to convert");
					System.out.println("1. Binary   2. Octal   3. Hexadecimal");
					int num1=sc.nextInt();
					if(num1==1) {
						String res=Integer.toBinaryString(dec);
						System.out.println("Number in Binary : "+res);
						condition3=false;
					}
					else if(num1==2) {
						String res=Integer.toOctalString(dec);
						System.out.println("Number in Octal : "+res);
						condition3=false;
					}
					else if(num1==3) {
						String res=Integer.toHexString(dec);
						System.out.println("Number in HexaDecimal : "+res);
						condition3=false;
					}
					else {
						System.out.println("Please enter the valid input");
						continue;
					}
				}
			}
			else if(num==2) {
				System.out.println("Enter the Binary Number");
				sc.nextLine();
				bin=sc.nextLine();
				boolean condition3=true;
				while(condition3) {
					System.out.println("Select the Number System in which you want to convert");
					System.out.println("1. Decimal   2. Octal   3. Hexadecimal");
					int num1=sc.nextInt();
					if(num1==1) {
						int res=Integer.parseInt(bin, 2);
						System.out.println("Number in Decimal : "+res);
						condition3=false;
					}
					else if(num1==2) {
						String res=Integer.toOctalString(Integer.parseInt(bin, 2));
						System.out.println("Number in Octal : "+res);
						condition3=false;
					}
					else if(num1==3) {
						String res=Integer.toHexString(Integer.parseInt(bin, 2));
						System.out.println("Number in HexaDecimal : "+res);
						condition3=false;
					}
					else {
						System.out.println("Please enter the valid input");
						continue;
					}
				}
			}
			else if(num==3) {
				System.out.println("Enter the Octal Number");
				sc.nextLine();
				oct=sc.nextLine();
				boolean condition3=true;
				while(condition3) {
					System.out.println("Select the Number System in which you want to convert");
					System.out.println("1. Binary   2. Decimal   3. Hexadecimal");
					int num1=sc.nextInt();
					if(num1==1) {
						String res=Integer.toBinaryString(Integer.parseInt(oct, 8));
						System.out.println("Number in Binary : "+res);
						condition3=false;
					}
					else if(num1==2) {
						int res=Integer.parseInt(oct, 8);
						System.out.println("Number in Decimal : "+res);
						condition3=false;
					}
					else if(num1==3) {
						String res=Integer.toHexString(Integer.parseInt(oct, 8));
						System.out.println("Number in HexaDecimal : "+res);
						condition3=false;
					}
					else {
						System.out.println("Please enter the valid input");
						continue;
					}
				}
			}
			else if(num==4) {
				System.out.println("Enter the HexaDecimal Number");
				sc.nextLine();
				hex=sc.nextLine();
				boolean condition3=true;
				while(condition3) {
					System.out.println("Select the Number System in which you want to convert");
					System.out.println("1. Binary   2. Decimal   3. Octal");
					int num1=sc.nextInt();
					if(num1==1) {
						String res=Integer.toBinaryString(Integer.parseInt(hex, 16));
						System.out.println("Number in Binary : "+res);
						condition3=false;
					}
					else if(num1==2) {
						int res=Integer.parseInt(hex, 16);
						System.out.println("Number in Decimal : "+res);
						condition3=false;
					}
					else if(num1==3) {
						String res=Integer.toOctalString(Integer.parseInt(hex, 16));
						System.out.println("Number in Octal : "+res);
						condition3=false;
					}
					else {
						System.out.println("Please enter the valid input");
						continue;
					}
				}
			}
			else {
				System.out.println("Entered wrong input!!  Please enter again");
				continue;
			}
			
			boolean condition2=true;
			while(condition2) {
				System.out.println("Want to use again");
				System.out.println("1. Yes   2. No");
				int num1=sc.nextInt();
				if(num1==1) {
					condition=true;
					condition2=false;
				}
				else if(num1==2) {
					System.out.println("Thank You for using me..........");
					condition=false;
					condition2=false;
				}
				else {
					System.out.println("Wrong input please enter again");
					continue;
				}
			}
		}
	}
}

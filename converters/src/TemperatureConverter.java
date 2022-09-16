import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double cel,fah,kel;
		boolean condition=true;
		while(condition) {
			System.out.println("Please select the temperature from the given below:");
			System.out.println("1. Celcius   2. Fahrenheit   3. Kelvin");
			int temp1=sc.nextInt();
			if(temp1==1) {
				boolean condition2=true;
				while(condition2) {
					System.out.println("Please enter the temperature in Celcius:");
					cel=sc.nextDouble();
					System.out.println("In which temperature you want to convert:");
					System.out.println("1. Fahrenheit   2. Kelvin");
					int temp2=sc.nextInt();
					if(temp2==1) {
						fah=cel*9/5+32;
						System.out.println("Temperature in Fahrenheit : "+fah);
						condition2=false;
					}
					else if(temp2==2) {
						kel=cel+273.15;
						System.out.println("Temperature in Kelvin : "+kel);
						condition2=false;
					}
					else {
						System.out.println("Entered the wrong input please enter the valid input");
						continue;
					}
				}
			}
			else if(temp1==2) {
				boolean condition2=true;
				while(condition2) {
					System.out.println("Please enter the temperature in Fahrenheit:");
					fah=sc.nextDouble();
					System.out.println("In which temperature you want to convert:");
					System.out.println("1. Celcius   2. Kelvin");
					int temp2=sc.nextInt();
					if(temp2==1) {
						cel=(fah-32)*5/9;
						System.out.println("Temperature in Celcius : "+cel);
						condition2=false;
					}
					else if(temp2==2) {
						kel=(fah-32)*5/9+273.15;
						System.out.println("Temperature in Kelvin : "+kel);
						condition2=false;
					}
					else {
						System.out.println("Entered the wrong input please enter the valid input");
						continue;
					}
				}
			}
			else if(temp1==3) {
				boolean condition2=true;
				while(condition2) {
					System.out.println("Please enter the temperature in Kelvin:");
					kel=sc.nextDouble();
					System.out.println("In which temperature you want to convert:");
					System.out.println("1. Celcius   2. Fahrenheit");
					int temp2=sc.nextInt();
					if(temp2==1) {
						cel=kel-273.15;
						System.out.println("Temperature in Celcius : "+cel);
						condition2=false;
					}
					else if(temp2==2) {
						fah=(kel-273.15)*9/5+32;
						System.out.println("Temperature in Fahrenheit : "+fah);
						condition2=false;
					}
					else {
						System.out.println("Entered the wrong input please enter the valid input");
						continue;
					}
				}
			}
			else {
				System.out.println("You entered the wrong input please enter again");
				continue;
			}
			boolean condition3=true;
			while(condition3) {
				System.out.println("Do you want to use this again");
				System.out.println("1. Yes   2. No");
				int lp=sc.nextInt();
				if(lp==1) {
					condition=true;
					condition3=false;
				}
				else if(lp==2) {
					System.out.println("Thank You for using our Converter !!!!!!");
					condition=false;
					condition3=false;
				}
				else {
					System.out.println("Please select the valid input");
					condition3=true;
				}
			}
		}	
	}
}

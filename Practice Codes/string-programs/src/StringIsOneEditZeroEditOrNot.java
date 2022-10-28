public class StringIsOneEditZeroEditOrNot {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("pale");
		StringBuilder str2 = new StringBuilder("cabe");
		int count = 0;
		if(str1.length() - str2.length() == 1 || str2.length() - str1.length() == 1)
			System.out.println("String is one edit....");
		else if(str1.length() - str2.length() > 1 || str2.length() - str1.length() > 1)
			System.out.println("String is not one edit....");
		else {
			for(int i = 0; i < str1.length(); i++) {
				if(str1.charAt(i) != str2.charAt(i))
					count++;
			}
			if(count == 1)
				System.out.println("String is one edit....");
			else
				System.out.println("String is not one edit....");
		}
	}
}

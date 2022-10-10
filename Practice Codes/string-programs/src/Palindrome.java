public class Palindrome {
	public static void main(String[] args) {
		String str = "atco cta";
		str = str.replace(" ", "");
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		System.out.println(str.equals(str2.reverse().toString()));
	}
}
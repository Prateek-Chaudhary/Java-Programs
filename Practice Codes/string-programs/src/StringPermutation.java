public class StringPermutation {
	
	public String sortString(String str) {
		char ar[] = str.toCharArray();
		java.util.Arrays.parallelSort(ar);
		return new String(ar);
		
	}
	
	public static void main(String[] args) {
		String str1 = "string", str2 = "gnirts";
		StringPermutation sp = new StringPermutation();
		if(str1.length() == str2.length() && str1.equals(str2))
			System.out.println("permutable");
		else if(str1.length() == str2.length()) {
			if(sp.sortString(str1).equals(sp.sortString(str2)))
				System.out.println("Permutable.....");
			else
				System.out.println("not permutable.....");
		}
		else
			System.out.println("not");
	}
}

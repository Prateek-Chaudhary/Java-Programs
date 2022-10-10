public class PalindromePermutation {
	public static void main(String[] args) {
		String s = "tact coa";
		s = s.replace(" ", "");
		StringBuilder str = new StringBuilder();
		StringBuilder ref = new StringBuilder();
		StringBuilder result = new StringBuilder();
		str.append(s);
		for(int i = 0; i < str.length(); i++) {
			boolean flag = true;
			int count = 1;
			for(int j = 0; j < i; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				for(int j = i + 1; j < str.length(); j++) {				
					if(str.charAt(i) == str.charAt(j))
							count++;
				}
				if(count == 1)
					result.append(str.charAt(i));
				if(count > 1)
					ref.append(str.charAt(i));
			}
		}
		result.insert(0, ref);
		result.insert(result.length(), ref.reverse());
		result.insert(4, " ");
		System.out.println(result);
	}
}

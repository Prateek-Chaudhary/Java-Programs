public class StringDuplicate {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("appele");
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
				if(count > 1)
					System.out.println(str.charAt(i));
			}
		}
	}
}

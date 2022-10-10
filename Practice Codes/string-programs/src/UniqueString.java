public class UniqueString {
	public static void main(String[] args) {
		String str = "prateek";
		boolean isUnique = true;
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			if(!isUnique)
				break;
		}
		if(isUnique)
			System.out.println("String is unique");
		else {
			System.out.println("Is not unique");
		}
	}
}

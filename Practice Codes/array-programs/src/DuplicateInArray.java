public class DuplicateInArray {
	public static void main(String[] args) {
		int ar[] = {10, 20, 30, 10, 30, 10, 40};
		for(int i = 0; i < ar.length; i++) {
			int count = 1;
			boolean flag = true;
			for(int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				for(int j = i+1; j < ar.length; j++) {
					if(ar[i] == ar[j])
						count++;
				}
				if(count > 1)
					System.out.println(ar[i]);
			}
		}
	}
}

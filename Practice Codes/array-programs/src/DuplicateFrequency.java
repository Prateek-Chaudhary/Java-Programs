public class DuplicateFrequency {
	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 10, 30, 40, 50, 20, 20, 40, 20, 50, 60, 30, 60, 40, 60, 30, 10};
		String str = "0 ";
		for (int i = 0; i < ar.length; i++) {
			int freq = 1;
			boolean b = true;
			String ref[] = str.split(" ");
			for (int k = 0; k < ref.length; k++) {
				if (ar[i] == Integer.parseInt(ref[k])) {
					b = false;
					break;
				}
			}
			if (b) {
				for (int j = i + 1; j < ar.length; j++) {
					if (ar[j] == ar[i])
						++freq;
				}
				System.out.println("Frequency of "+ar[i]+" is : "+freq);
			}
			str += ar[i] + " ";
		}
	}
}
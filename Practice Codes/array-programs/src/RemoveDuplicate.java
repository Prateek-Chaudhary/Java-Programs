public class RemoveDuplicate {
	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 10, 30, 40, 50, 20, 20, 40, 20, 50, 60, 30, 60, 40, 60, 30, 10};
		String str = "0 ";
		StringBuilder dup = new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			int freq = 1;
			boolean b = true;
			String ref[] = str.split(" ");
			for (int k = 0; k < ref.length; k++) {
				if (ar[i] == Integer.parseInt(ref[k]))
					b = false;
			}
			if (b)
				dup.append(ar[i]+" ");
			str += ar[i] + " ";
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println(dup);
	}
}

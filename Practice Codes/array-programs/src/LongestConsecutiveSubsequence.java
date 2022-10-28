import java.util.ArrayList;

public class LongestConsecutiveSubsequence {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 19, 20};
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> ref = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(i+1 == arr.length) {
				ref.add(arr[i]);
				if(list.size() == 0) {
					list.addAll(ref);
					ref.clear();
				}
				else if(list.size() < ref.size()) {
					list.clear();
					list.addAll(ref);
					ref.clear();
				}
				break;
			}
			if(arr[i+1] - arr[i] == 1)
				ref.add(arr[i]);
			else {
				ref.add(arr[i]);
				if(list.size() == 0) {
					list.addAll(ref);
					ref.clear();
				}
				else {
					if(list.size() < ref.size()) {
						list.clear();
						list.addAll(ref);
						ref.clear();
					}
				}
			}
		}
		System.out.println(list);
	}
}

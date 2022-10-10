public class InfixToPostfix {

	private static boolean isOperator(char ch) {
		if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' || ch == '^')
			return true;
		return false;
	}

	private static int precedence(char ch) {
		if (ch == '+' || ch == '-')
			return 1;
		if (ch == '*' || ch == '/' || ch == '%')
			return 2;
		if (ch == '^')
			return 3;
		return 0;
	}

	public static void main(String[] args) {
		LinkedStack ls = new LinkedStack();
		String str = "a*b+c/d-x*y";
		int j = 0;
		char result[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if (!isOperator(str.charAt(i))) {
				result[j] = str.charAt(i);
				j++;
			} 
			else {
				if (ls.isEmpty())
					ls.push(str.charAt(i));
				else if (precedence(ls.peek()) < precedence(str.charAt(i)))
					ls.push(str.charAt(i));
				else {
					while (precedence(ls.peek()) > precedence(str.charAt(i))
							|| precedence(ls.peek()) == precedence(str.charAt(i))) {
						result[j] = ls.pop();
						j++;
						if (ls.peek() == ' ')
							break;
					}
					ls.push(str.charAt(i));
				}
			}
		}
		while (!ls.isEmpty()) {
			result[j] = ls.pop();
			j++;
		}
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i]);
	}
}

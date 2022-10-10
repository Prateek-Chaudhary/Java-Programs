public class PostfixToInfix {

	private static boolean isOperator(char ch) {
		if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' || ch == '^')
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		LinkedStack2 ls = new LinkedStack2();
		StringBuilder str = new StringBuilder("ab*cd/+xy*-");
		for(int i = 0; i < str.length(); i++) {
			if(!isOperator(str.charAt(i)))
				ls.push(String.valueOf(str.charAt(i)));
			else {
				String op2 = ls.pop();
				String op1 = ls.pop();
				String s = "";
				s += op1+str.charAt(i)+op2;
				ls.push(s);
			}
		}
		System.out.println(ls.pop());
	}
}

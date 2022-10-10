public class InnerClass {

	class Inner{
		
		class InnerInner {
			void method2() {
				System.out.println("method 2 is called.....");
			}
		}
		
		void method1() {
			System.out.println("Method 1 is called.....");
		}
	}
	
	public static void main(String[] args) {
		InnerClass cls = new InnerClass();
		InnerClass.Inner in = cls.new Inner();
		InnerClass.Inner.InnerInner inn = in.new InnerInner();
		in.method1();
		inn.method2();
	}
}
public class MthApp {
	public static void main(String[] args) {
		MultiThread mt=new MultiThread();
		MultiThread mt1=new MultiThread();
		MultiThread mt2=new MultiThread();
		mt.start();
		mt1.start();
		mt2.start();
	}
}

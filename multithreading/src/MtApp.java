public class MtApp {
	public static void main(String[] args) {
		MultiThreading mt=new MultiThreading();
		Thread th=new Thread(mt);
		Thread th1=new Thread(mt);
		Thread th2=new Thread(mt);
		th.start();
		th1.start();
		th2.start();
	}
}

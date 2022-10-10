public class ThreadClass implements Runnable {	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(3000);
				System.out.println("Thread is running......."+i);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadClass th = new ThreadClass();
		Thread tt1 = new Thread(th);
		Thread tt2 = new Thread(th);
		Thread tt3 = new Thread(th);
		tt1.run();
		tt2.start();
		System.out.println(tt1.getId());
	}
}

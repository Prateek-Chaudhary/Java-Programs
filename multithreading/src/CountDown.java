import java.applet.*;

public class CountDown extends Thread {
	public void run() {
		for(int i=10;i>=1;i--)
			try {
				System.out.println(i);
				AudioClip clp=Applet.newAudioClip(getClass().getResource("sounds/"+i+".wav"));
				clp.play();
				Thread.sleep(1000);
			}
		catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println("Let's Play");
	}
	public static void main(String[] args) {
		CountDown cd=new CountDown();
		cd.start();
	}
}

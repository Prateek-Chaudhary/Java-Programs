import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class StopWatch {
	JFrame fr=new JFrame("StopWatch");
	JLabel lb=new JLabel("00:00:00");
	JButton bt1=new JButton("Start");
	JButton bt2=new JButton("Stop");
	JPanel pa=new JPanel();
	int h,s,m;
	public StopWatch() {
		fr.setSize(350,250);
		fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		lb.setFont(new Font("Arial",Font.BOLD,50));
		fr.add(lb);
		fr.add(pa);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,0,40));
		pa.add(bt1);
		pa.add(bt2);
		bt1.addActionListener(new Start());
		bt2.addActionListener(new Stop());
		fr.setVisible(true);
	}
	class Watch extends Thread {
		public void run() {
			while(true) {
				String time=(h<10?"0"+h:h)+":"+(m<10?"0"+m:m)+":"+(s<10?"0"+s:s);
				lb.setText(time);
				try {
					sleep(1000);
				}
				catch(Exception ex) {}
				s++;
				if(s==60) {
					s=0;
					m++;
					if(m==60) {
						m=0;
						h++;
						if(h==24) {
							h=0;
						}
					}
				}
			}
		}
	}
	Watch wt=new Watch();
	class Start implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			wt.start();
			bt1.setEnabled(false);
		}
	}
	class Stop implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			wt.stop();
			bt1.setEnabled(true);
		}	
	}
	public static void main(String[] args) {
		new StopWatch();
	}
}

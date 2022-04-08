package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.stream.util.EventReaderDelegate;

class AAA1 extends Thread{
	public void run() {
		while(true) {
		
		JFrame frame = new JFrame("test");
		
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");
		c.add(label);
		
		frame.setLocation(1000, 200);
		
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();
		
		label.setFont(new Font(null, Font.ITALIC, 25));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label.setText("aaaaaa");
//		int i=0;
		for(int i=0;i<=10000000;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			long t = System.currentTimeMillis();
			SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd hh시 mm분 ss초");
			label.setText(s.format(t));
			}
		}
	}
}

public class Test {
public static void main(String[] args) {
	AAA1 a =new AAA1();
	System.out.println("main 시작");
	a.start();
	System.out.println("main 끝");
	
}
}

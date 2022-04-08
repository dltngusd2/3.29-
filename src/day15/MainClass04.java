package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass04 {
public static void main(String[] args) {
	JFrame frame = new JFrame("test");
	
	Container c = frame.getContentPane();
	JLabel label = new JLabel("Hello GUI");
	c.add(label);
	
	frame.setLocation(1000, 200);
	
	frame.setPreferredSize(new Dimension(500,200));
	frame.pack();
	
	label.setFont(new Font("Impact", Font.ITALIC, 25));
	label.setHorizontalAlignment(JLabel.CENTER);
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	label.setText("aaaaaa");
//	int i=0;
	for(int i=0;i<=10000000;i++) {
		label.setText(i+"");
		
		
		
	}
}
}

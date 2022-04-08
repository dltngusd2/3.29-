package day15;

import java.util.Scanner;

class A02 extends Thread{
	public void run() {
		for(;;) {
			System.out.println("A02");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class MainClass03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str;
	A02 a = new A02();
	a.setDaemon(true);
	a.start();
	while(true) {
		System.out.println("입력 : ");
		str = sc.next();
		System.out.println(str);break;
	}
}
}

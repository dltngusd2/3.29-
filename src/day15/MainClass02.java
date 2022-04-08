package day15;
/*
 thread
 - 프로세스의 단위
 - 하나의 메소드(기능)를 동작시키기 위한 일꾼 
 */
class A01 extends Thread{
	public void run() {
		for(int i=0; i<100 ; i++) {
			System.out.println("A01 : "+i);
		}
	}
}
class B01 extends Thread{
	public void run() {
		for(int i=0; i<100 ; i++) {
			System.out.println("B01 : "+i);
		}
}
}

public class MainClass02 {
public static void main(String[] args) {
	A01 a = new A01();
	B01 b = new B01();
//	a.run();
//	b.run();
	a.setDaemon(true);
	b.setDaemon(true);
	a.start();
	b.start();
	for(int i=0;i<10;i++) {
		System.out.println("main : "+i);
	}
}
}


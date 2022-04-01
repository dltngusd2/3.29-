package day11;

public class Test04 {
	public int cnt=100; //얘가 인스턴스 변수다 / 객체를 만들어야만 사용가능
	public void test1() {
		System.out.println("test1 : "+cnt);
		cnt+=10000;
		
	}
	public void test2() {
		System.out.println("test2 : "+cnt);
	}
}

package day12;
/*
 this
 - 자기 자신의 정보를 저장하는 매개변수
 - 따로 생성하지 않더라도 메소드의 0번째 매개변수로 생성됨
 */
public class Ex02 {
	int a = 10;
	public void setA(int a) {
		System.out.println(this);
		this.a = a;
		//this 클래스의 시작점이라 보면된다고 한다
	}
	public void print() {
		System.out.println("a: "+a);
	}
}

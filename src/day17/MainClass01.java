package day17;
/*
 제너릭
 - 가변 자료형이다.
 - 기본 8대 자료형으로는 사용할 수 없다.
 - wrapper자료형으로 사용해야 한다
 - 8대 자료형은 int, char, double......
 - wrapper
 	- Integer, Character, Double, Float....
 	- wrapper 자료형은 일반 자료형을 클래스 타입으로 변경한 것
 */
class AAA{
	public void sumFunc(int a, int b) {
		System.out.println(a+b);
	}
	public void sumFunc(double a, double b) {
		System.out.println(a+b);
	}
	public void sumFunc(String a, String b) {
		System.out.println(a+b);
	}
}

public class MainClass01 {
public static void main(String[] args) {
	AAA a = new AAA();
	a.sumFunc(10, 20);
	a.sumFunc(10.11, 20.11);
	a.sumFunc("aaa", "bbbb");
}
}

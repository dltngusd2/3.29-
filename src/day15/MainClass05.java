package day15;
/*
 오버라이딩
 - 상속받은 메소드의 내용을 변경하여 실행되는 것
 - 자신에 맞게 코드 변경
 조건
 - 부모의 메소드 이름, 매개변수, 반환타입이 같아야 한다
 - 자식의 접근제한자는 부모의 접근제한자보다 작을 수 없다
 private < package < protected < public
 */
class A{
	public void test() {
		System.out.println("2021년 기능");
	}
}
	class B extends A{
		public void test22() {
			System.out.println("그 외의 기능들");
		}
		public void test() {
			System.out.println("2022년 기능");
	}
	}
public class MainClass05 {
public static void main(String[] args) {
B b = new B();
b.test(); b.test22();






}
}

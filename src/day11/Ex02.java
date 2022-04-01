package day11;
/*
 메소드 오버로딩
 - 메소드의 이름이 같아야 한다
 - 매개변수의 개수나 자료형이 다르면 다른 메소드로 인식한다
 - 변형타입과는 무관하다
 */
public class Ex02 {
public static void main(String[] args) {
	Test02 t = new Test02();
	t.test();
	t.test(111);
	t.test('c');
}
}

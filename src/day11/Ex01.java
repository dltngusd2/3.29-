package day11;
/*
 -변수-
 - 클래스 변수 : 클래스 영역에서 만드는 변수
 - 인스턴스(객체) 변수 : 인스턴스(객체)가 생성될때 만들어 지는 변수
 - 지역 변수 : 특정 지역에서 생성되는 변수
 */
public class Ex01 {
public static void main(String[] args) {
	for(int i=0 ; i<5 ; i++) {
		System.out.println((int)(Math.random()*3)+10);
	}
}
}

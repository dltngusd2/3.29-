package day10;
/*
 method
 - 하나의 독립적인 기능
 function(함수) vs method(메소드)
 - 보통 함수라고 표현하는 곳은 객체를 사용하지 않는 경우
 - 메소드라고 표현하는 것은 클래스 내부 함수로 존재할때
 
 method 형식 - 
 접근제한자 반환자료형 메소드이름(매개변수(아규먼트)){
 	내용
 	return 사용 또는 사용안함
 	}
 	
 */
public class Ex02 {
public static void main(String[] args) {
	System.out.println("main시작");
	Test02 t02 = new Test02();
	t02.test();
	System.out.println("main끝");
}
}

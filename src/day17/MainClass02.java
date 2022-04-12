package day17;
/*
 T : type
 E : Element (객체)
 * */


class BBB<TTTT>{
	public void sumFunc(TTTT a, TTTT b) {
		System.out.println(a+","+b);
		System.out.println(a.getClass());//이 코드는 어떠한 타입을 가지고 있는지 알려줌
	}
}
public class MainClass02 {
public static void main(String[] args) {
	BBB<Integer> b = new BBB<>();
	b.sumFunc(100, 200);
	BBB<String> bb = new BBB<>();
	bb.sumFunc("안녕", "하세요");
}
}

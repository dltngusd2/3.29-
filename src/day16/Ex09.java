package day16;

interface Int01{
	public int num=100;
}

class A02{static int num=100;}

public class Ex09 implements CommonPath{
public static void main(String[] args) {
	System.out.println(Int01.num);
	System.out.println(A02.num);
	//A02.num = 12345;
	//Int01.num = 12345;
	System.out.println("저장합니다");
	System.out.println(path);
	System.out.println(path);
	System.out.println(path);
	System.out.println(path);
	System.out.println(path);
}
}

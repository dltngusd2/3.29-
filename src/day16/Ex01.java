package day16;

class A{
	public void aaa() {System.out.println("부모");}
}
class B extends A{
	public void aaa() {System.out.println("자식");}
	public void bbb() {System.out.println("bbb");}
}

public class Ex01 {
public static void main(String[] args) {
	A b = new B();
	b.aaa();
	B bb = (B)b;
	bb.bbb();
}
}

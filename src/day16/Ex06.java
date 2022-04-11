package day16;

class A사람{
	public void 지상군공격() {
		총알장전();
		System.out.println("돌격앞으로 총쏜다");
	}
	public void 총알장전() {
		System.out.println("총알 장전");
	}
}
class B사람{
	public void 비행기출격() {
		System.out.println("비행기 탑승합니다");
	}
	public void 공격() {
		비행기출격();
		System.out.println("비행기가 공격 합니다");
	}
}

public class Ex06 {
public static void main(String[] args) {
	A사람 a = new A사람();
	B사람 b = new B사람();
	a.지상군공격();
	b.공격();
	
	
}
}

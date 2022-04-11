package day16;

class A사람1 implements 공방{
	public void 지상군공격() {
	}
	public void 총알장전() {
		System.out.println("총알 장전");
	}
	public void attack() {
		총알장전();
		System.out.println("돌격앞으로 총쏜다");
		
	}
	public void defense() {
		
	}
}
class B사람1 implements 공방{
	public void 비행기출격() {
		System.out.println("비행기 탑승합니다");
	}
	public void 공격() {
	}
	public void attack() {
		비행기출격();
		System.out.println("비행기가 공격 합니다");
		
	}
	public void defense() {
		
	}
}

public class Ex07 {
	public static void main(String[] args) {
		
		B사람1 b = new B사람1();
		A사람1 a = new A사람1();
		공방 aaa = new B사람1();
		aaa.attack();
		aaa = new A사람1();
		aaa.attack();
		
	}
}

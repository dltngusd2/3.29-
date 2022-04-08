package day15;
class Ferrari{
	private int ye;
	private int speed;
	public Ferrari(int ye) {
		this.ye = ye;
	}
	public int getYe() {
		return ye;
	}
	public void speed() {
		System.out.println(ye+"년 페라리 속도 : 300km");
	}
}
class NewFerrari extends Ferrari{
	public NewFerrari(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드 시작");
	}
	}
class Ferrari2023 extends NewFerrari{
	public Ferrari2023(int ye) {
		super(ye);
	}
	public void flying() {
		System.out.println("비행 운전 모드 전환");
	}
	
	public void speed() {
		System.out.println(getYe()+"년 500km 달린다");
	}
}

public class MainClass06 {
public static void main(String[] args) {
	Ferrari2023 f = new Ferrari2023(2023);
	f.speed();
	f.autoSystem();
	f.flying();
	
}
}

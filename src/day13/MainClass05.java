package day13;
class 냉장고{
	int 냉장온도;
	int 냉동온도;
	public 냉장고(int 냉장온도, int 냉동온도) {
		this.냉장온도 = 냉장온도;
		this.냉동온도 = 냉동온도;
		
	}
	public int get냉장온도() {return 냉장온도;}
	public void set냉장온도(int 냉장온도) {this.냉장온도 = 냉장온도;}
	public int get냉동온도() {	return 냉동온도;}
	public void set냉동온도(int 냉동온도) {this.냉동온도 = 냉동온도;}
	
	
	
	
}
public class MainClass05 {
public static void main(String[] args) {
	냉장고 a = new 냉장고(5,-5);
	System.out.println("기본 설정 확인");
	System.out.println("냉장 : "+a.get냉장온도()+"도");
	System.out.println("냉동 : "+a.get냉동온도()+"도");
	
	System.out.println("냉장 온도 설정");
	int 냉장온도 = a.get냉장온도();
	//사용자가 설정
	냉장온도 += 5;
	a.set냉장온도(냉장온도);
	System.out.println("설정된 냉장온도 확인");
	System.out.println("냉장 : "+a.get냉장온도());
	
}
}

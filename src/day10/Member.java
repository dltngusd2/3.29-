package day10;

public class Member {
	public String name;
	public String addr;
	public int age;
	
	
	public void 회원정보출력() {
		System.out.println("회원정보출력");
	}
	public void 저장하는기능() {
		System.out.println("저장하는기능");
	}
	public void 수정하는기능() {
		System.out.println("수정하는기능");
	}
	private void 조회수증가() {
		System.out.println("관리자만접근");
	}
}

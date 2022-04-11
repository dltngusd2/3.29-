package day16;

import java.util.Scanner;

class Parents{
	public void familyName() {System.out.println("이");
}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
	}
}
public class Ex03 {
public static void main(String[] args) {
	Parents par = new Parents();
	par.name();
	
//	Daughter d = new Daughter();
//	d.name();
	par = new Daughter();
	par.name();
//	Son s = new Son();
//	s.name();
	par = new Son();
	par.name();
	
	
	Scanner sc = new Scanner(System.in);
	
	int num;
	System.out.println("1. 부모 이름");
	System.out.println("2. 딸 이름");
	System.out.println("3. 아들 이름");
	System.out.println("입력 : ");
	num = sc.nextInt();
	
	if(num ==1) {
		par = new Parents();
	}else if(num==2) {
		par = new Daughter();
	}else {
		par = new Son();
	}
	par.name();
}
}

package day16;

import java.util.Scanner;

class A지상군 implements 공방{
	@Override
	public void attack() {
		System.out.println("지상군 공격");
	}
	@Override
	public void defense() {
		System.out.println("지상군 방어");
	}
	
}

class B공군 implements 공방{

	@Override
	public void attack() {
		System.out.println("공군 공격");
	}
	@Override
	public void defense() {
		System.out.println("공군 방어");
	}
}

public class Ex08 {
	public static void main(String[] args) {
		  //A지상군 지상군 = new A지상군();
	      ///B공군 공군 = new B공군();
	      공방 par = null;
	      
	      System.out.println("적이 처들어왔습니다");
	      System.out.println("1.지상군  2.공군");
	      
	      Scanner sc = new Scanner(System.in);
	      int choice = sc.nextInt();
	      /*
	      if(choice == 1 ) {
	         System.out.println("지상군 선택하셨습니다");
	      }else {
	         System.out.println("공군 선택하셨습니다");
	      }
	      
	      System.out.println("1.공격 2.방어");
	      int num = sc.nextInt();
	      if(choice == 1 && num == 1) {
	         지상군.attack();
	      }else if(choice == 1 && num == 2) {
	         지상군.defense();
	      }else if(choice == 2 && num == 1) {
	         공군.attack();
	      }else if(choice == 2 && num == 2) {
	         공군.defense();
	      }
	      */
	      
	      if(choice == 1) {
	         System.out.println("지상군 선택");
	         par = new A지상군();
	      }else {
	         System.out.println("공군 선택");
	         par = new B공군();
	      }
	      System.out.println("1.공격 2.방어");
	      int num = sc.nextInt();
	      if(num == 1) {
	         par.attack();
	      }else if(num == 2) {
	         par.defense();
	      }
	   }
	}



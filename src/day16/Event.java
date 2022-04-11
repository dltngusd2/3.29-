package day16;

import java.util.Scanner;

class 이벤트 extends 전체이벤트{
	Scanner sc = new Scanner(System.in);
	public void event(){
		System.out.println("1. 이달의이벤트보기  2. 전체이벤트보기");
		int num = sc.nextInt();
		if(num == 1) {
			System.out.println(event1);
		}else {
			System.out.println(event2);
		}
	}
	
}


class 전체이벤트 extends 이달의이벤트{
	String event2 = "전체이벤트";
}

class 이달의이벤트{
	
	public String event1 = "이번달이벤트";
}
package day13;

import java.util.Scanner;

public class MainClass03 {
public static void main(String[] args) {
	int age;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("나이 입력 : ");
	try{
		age = sc.nextInt();
		System.out.println("당신의 나이는 "+age);
	}catch (Exception e){
		System.err.println("숫자만 입력하세요~~~");
	}
	
	System.out.println("다음 문장들 실행!!");
	System.out.println("다음 문장들 실행!!");
	System.out.println("다음 문장들 실행!!");
	System.out.println("다음 문장들 실행!!");
	System.out.println("다음 문장들 실행!!");
}
}

package day10;

import java.util.Scanner;

public class Quiz02_main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	Scanner sc = new Scanner(System.in);
//	int num1,num2;
//	System.out.println("첫번째 수 입력 : ");
//	num1=sc.nextInt();
//	System.out.println("두번째 수 입력 : ");
//	num2=sc.nextInt();
//	if(num1>num2) {
//		System.out.println("큰 수는"+num1);
//	}else
//		System.out.println("큰 수는"+num2);
//	
	Quiz02_class b = new Quiz02_class();
	int num1,num2;
	System.out.println("첫 번째 값 입력 : ");
	num1 = sc.nextInt();
	System.out.println("두 번째 값 입력 : ");
	num2 = sc.nextInt();
	int result = b.big(num1, num2);
	b.outPut(num1, num2, result);
	
	
}
}

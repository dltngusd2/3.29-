package day10;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	
//	int num=10;
//	if(true) {
//		num+=100;
//	}
	//	System.out.println(num);
//	if(true) {
//		int num=10;
//		num+=100;
//	}
//	System.out.println(num);
	
	
	
	
	
	
	Test03 t03 = new Test03();
	Scanner sc = new Scanner(System.in);
	int num1, num2, sum=0;
	System.out.print("수 입력 : ");
	num1 = sc.nextInt();
	System.out.print("수 입력 : ");
	num2 = sc.nextInt();
	
	//t03.sc();
	int a = t03.sumFunc(num1,num2);
	System.out.println("두 수 합 : "+a);
	
	t03.sc();
	int[] b = t03.sc();
	System.out.println("배열 0 : "+b[0]);
	System.out.println("배열 1 : "+b[1]);
	
	
	
	
	
}
}

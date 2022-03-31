package day10;

import java.util.Scanner;

public class Quiz03_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.println("수 입력 : ");
//		num=sc.nextInt();
//		if(num%2==0) {
//			System.out.println(num+"은 짝수");
//		}else {
//			System.out.println(num+"은 홀수");
//		}
		Quiz03_class a = new Quiz03_class();
		int num1;
		System.out.println("수 입력 : ");
		num1 = sc.nextInt();
		int result = a.JH(num1);
		a.outPut(num1, result);
		
		
		
	}
}

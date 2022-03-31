package day10;

import java.util.Scanner;

public class Quiz02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Quiz02_class b = new Quiz02_class();
	int num1 , num2;
	System.out.println("첫번째 값 입력 : ");
	num1=input.nextInt();
	System.out.println("두번째 값 입력 : ");
	num2 = input.nextInt();
	int result = b.Quiz02_class(num1, num2);
	b.outPut(num1, num2, result);
}
}

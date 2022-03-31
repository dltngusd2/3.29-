package day10;

import java.util.Scanner;

public class Test03 {
	public int sumFunc(int n1, int n2) {
		int sum=n1+n2;
		return sum;
	}

public int[] sc() {
	Scanner sc = new Scanner(System.in);
	int num1, num2, sum=0;
	System.out.print("수 입력 : ");
	num1 = sc.nextInt();
	System.out.print("수 입력 : ");
	num2 = sc.nextInt();
	int[] arr = new int[2];
	arr[0] = num1; arr[1]=num2;
	
	return arr;
}
















}
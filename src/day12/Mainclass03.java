package day12;

import java.util.Scanner;

//private: 정보 음닉 입니다
public class Mainclass03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Ex03 ex = new Ex03();
	ex.setting(100);
	
	int a = ex.getter();
	System.out.println(a-1);
	
	
}
}

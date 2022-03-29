package day08;

import java.util.ArrayList;

public class Ex02 {
public static void main(String[] args) {
	/*
	 컬렉션
	 - 자료구조
	 프레임워크
	 - 틀, 형식에 맞춰져 있음
	 */
	/*
	 ArrayList
	 - 순서가 유지 되는 자료형 String과 같이 자료형임
	 - 배열과 비슷하게 사용된다
	 - 가변적인 크기를 가지고 있다.
	*/
	ArrayList arr = new ArrayList();
	arr.add("aaa");
	arr.add("111");
	arr.add("222");
	System.out.println(arr.get(0));
	System.out.println(arr.get(1));
	System.out.println(arr.get(2));
	
	System.out.println(arr.size());
	System.out.println(arr.contains("aaa"));
	//boolean bool = arr.remove("aaa");
	//if(bool == true) 삭제성공
	System.out.println("remove : "+arr.remove("aaa"));
	System.out.println(arr.contains("aaa"));
	System.out.println("=====삭제후 확인=====");
	System.out.println(arr.size());
	System.out.println(arr.get(0));
	arr.clear();
	System.out.println(arr.size());
	System.out.println("=====================");
	arr.add("aaa");
	arr.add("111");
	arr.add("222");
	
	System.out.println(arr.indexOf("1"));
	System.out.println("=====================");
	arr.set(0, "안녕하세요");
	System.out.println(arr.get(0));
	
}
}

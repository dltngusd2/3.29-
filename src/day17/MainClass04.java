package day17;

import java.lang.reflect.Array;
import java.util.ArrayList;

class St{
	private String stNum;
	private String name;
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println(stNum);
		System.out.println(name);
	}
	
}

public class MainClass04 {
public static void main(String[] args) {
	ArrayList<St> st = new ArrayList<St>();
	St s = new St();
	s.setName("홍길동");
	s.setStNum("111");
	//s.print();
	
	st.add(s);
	
//	St ss = st.get(0);
//	ss.print();
	
	st.get(0).print();
	
	St s01 = new St();
	s01.setName("김개똥");
	s01.setStNum("112");
	
	st.add(s01);
	st.get(1).print();
	System.out.println("=================");
	for(int i = 0 ; i<st.size() ; i++) {
		St a = st.get(i);
		a.print();
	}
	System.out.println("=================");
	
	for(St b : st) {
		b.print();
	}
	System.out.println("=================");
	ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(111);
			arr.add(222);
			for(int num : arr) {
				System.out.println(num);
			}
}
}

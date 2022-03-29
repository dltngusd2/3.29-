package day08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {
public static void main(String[] args) {
	/*
	 HashSet
	 - 순서가 없으며, 중복을 허용하지 않는다.
	 
	 */
	HashSet set = new HashSet();
	ArrayList arr = new ArrayList();
	
	set.add("라면"); set.add("진미김밥질려");
	set.add("순대"); set.add("라면");
	
	arr.add("라면"); arr.add("진미김밥질려");
	arr.add("순대"); arr.add("라면");
	
	System.out.println("set : "+set);
	System.out.println("arr : "+arr);
	
	Iterator it = set.iterator();
//	System.out.print(it.hasNext()+" : ");
//	System.out.println(it.next());
//	System.out.print(it.hasNext()+" : ");
//	System.out.println(it.next());
//	System.out.print(it.hasNext()+" : ");
//	System.out.println(it.next());
//	System.out.print(it.hasNext()+" : ");
//	System.out.println(it.next());
//	System.out.print(it.hasNext()+" : ");
//	
	while(it.hasNext()) {
		
		Object o = it.next();
		String re = o+",결과"; //문자 연산
		System.out.println(re);
	}
	
	
	
	
}
}

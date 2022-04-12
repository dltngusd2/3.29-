package day17;

import java.util.ArrayList;
import java.util.Scanner;

class Name{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class MainClass05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name;
	
	ArrayList<Name> arr = new ArrayList<Name>();
	
	int num;
	while(true) {
		
		System.out.println("1. 저장");
		System.out.println("2. 모든 이름 출력");
		System.out.println("3. 이름 조회");
		num = sc.nextInt();
		switch(num){
		case 1: 
			System.out.println("이름 입력");
			name = sc.next();
			Name n = new Name();
			n.setName(name);
			
			arr.add(n);
			
			break;
		case 2:
			for(int i = 0 ; i<arr.size(); i++) {
				System.out.println(arr.get(i).getName());
			}
			System.out.println("=========================");
			for(Name nn : arr) {
				System.out.println(nn.getName());
			}
			break;
		case 3:
			System.out.println("검색 이름 입력");
			name = sc.next();
			int i;
			for(i=0;i<arr.size();i++) {
				Name nn = arr.get(i);
				if(name.equals(nn.getName()));
				System.out.println("존재함"); break;
			}
			if(i == arr.size()) {
				System.out.println("존재하지 않음");
			}
			break;
		}
	}
	
	
	
	
	
	
	
}
}

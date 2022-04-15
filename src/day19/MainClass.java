package day19;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

/* 
 1. driver 로드 : 오라클 관련된 기능을 사용할 수 있게 만든다
 2. Connection : 오라클과 자바와 연결을 시켜준다
 		-오라클의 위치 정보(ip, port)
 		-오라클의 계정 정보(id, pwd)
 3. PreparedStatement :  명령어를 수행 하는 객체
 		-sql문을 문자열로 만들어 줘야 한다
 4. ResultSet : 사용해도 되고 안해도 된다
 		-결과를 받아오는 객체
 		-select를 사용하는 경우에만 이용한다
 		-반복자 형태로 들어오게 된다
 * */


public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException {
		DB db = new DB();
		int num, result=0;
		Scanner sc=new Scanner(System.in);
		String userID,userName;
		int userAge;
		String inputID;
		
		while(true) {
			System.out.println("1. 모든 정보보기");
			System.out.println("2. 개인 정보보기");
			System.out.println("3. 개인 삭제");
			System.out.println("4. 회원가입");
			System.out.println("5. 개인정보 수정");
			System.out.print(">>> : ");
			num = sc.nextInt();
			switch(num) {
			case 5: 
				System.out.println("수정 아이디 : ");
				userID = sc.next();
				System.out.println("수정할 이름 : ");
				userName = sc.next();
				System.out.println("수정 나이 : ");
				userAge = sc.nextInt();
				
				Member member = new Member(userID,userName,userAge);
//				member.setId(userID);
//				member.setName(userName);
//				member.setAge(userAge);
				
				result = db.update(member);
				if(result == 1) {
					System.out.println("수정 성공");
				}else {
					System.out.println("수정 실패");
				}
				break;
			
			case 1:
//				db.selectAll();
//				db.selectAll2();
				ArrayList<Member> list = db.selectAll2();
				if(list.size() == 0) {
					System.out.println("저장 데이터 없음");
				}else {
					for(int i=0; i<list.size();i++) {
						Member m = list.get(i);
						System.out.println(m.getId());
						System.out.println(m.getName());
						System.out.println(m.getAge());
						System.out.println("=============");
					}
				}
				
				
				
				
				break;
			case 2:
				System.out.println("검색할 아이디 입력 : ");
				inputID = sc.next();
//				db.selectOne(inputID);
				Member m = db.selectOne2(inputID);
				if(m== null) {
					System.out.println("찾는 회원 없음");
				}else {
					System.out.println("id : "+m.getId());
					System.out.println("name : "+m.getName());
					System.out.println("age : "+m.getAge());
				}
				break;
				
			case 3:
				System.out.println("삭제 아이디 입력 : ");
				inputID = sc.next();
				
				result = db.delete(inputID);
				if(result == 0)
					System.out.println("삭제 실패");
				else
					System.out.println("삭제 성공");
					
				break;
				
			case 4:
				
				System.out.println("가입 아이디입력 : ");
				userID = sc.next();
				System.out.println("가입 이름입력 : ");
				userName = sc.next();
				System.out.println("가입 나이입력 : ");
				userAge = sc.nextInt();
				
				db.insert(userID,userName,userAge);
				
				break;
			}
			
			
			
		}
	}
}

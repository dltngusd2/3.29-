package day19;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

public class DB {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
public DB(){
	System.out.println("DB실행");
	try {
		//드라이브로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	// localhost = 127.0.0.1 = 192.168.7.109
	// port : 2byte. 65,535의 숫자로 표현된다
	//			-프로그램을 구분하기 위한 값
	// ip : pc의 위치를 알려주는 값
	//포트는 2바이트 크기를 가지고있다
	String url ="jdbc:oracle:thin:@192.168.7.109:1521:xe";
	String id="java", pwd="1234";
	//DB와 연결된 객체를 얻어온다
	con = DriverManager.getConnection(url, id, pwd);
	
	}catch (Exception e) {
		e.printStackTrace();
	}
}
public void selectOne(String inputID){
	String sql = "select * from newst where id='"+inputID+"'";
	System.out.println("sql : "+sql);
	PreparedStatement ps = null;
	ResultSet rs;
	try {
		//연결된 객체를 이용해서 전송객체를 얻어온다
		ps = con.prepareStatement(sql);
		//sql문을 실행해라
		rs = ps.executeQuery();
//		System.out.println(rs.next());
		if(rs.next()) {
			System.out.println("id"+rs.getString("id"));
			System.out.println("name"+rs.getString("name"));
			System.out.println("age"+rs.getInt("age"));
		}else {
			System.out.println("조회한 정보가 없습니다!!!");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			rs = ps.executeQuery();
			if(rs != null)
				rs.close();
			if(ps != null)
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

public Member selectOne2(String inputID){
	String sql = "select * from newst where id='"+inputID+"'";
	System.out.println("sql : "+sql);
	PreparedStatement ps;
	ResultSet rs;
	try {
		//연결된 객체를 이용해서 전송객체를 얻어온다
		ps = con.prepareStatement(sql);
		//sql문을 실행해라
		rs = ps.executeQuery();
//		System.out.println(rs.next());
		if(rs.next()) {
			
			Member mem = new Member();
			mem.setId(rs.getString("id"));
			mem.setName(rs.getString("name"));
			mem.setAge(rs.getInt("age"));
			
			return mem;
			
		}else {
			System.out.println("조회한 정보가 없습니다!!!");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
	dbClose();
}
	return null;
}
public void selectAll() {
	String sql = "select * from newst";
	try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		
		
		while(rs.next()) {
		System.out.println(rs.getString("id"));
		System.out.println(rs.getString("name"));
		System.out.println(rs.getInt("age"));
		System.out.println("=================");
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		dbClose();
	}
}

public void dbClose() {
	System.out.println("데이터베이스 닫음!!");
	try {
		if(rs != null)
			rs.close();
		if(ps != null)
		ps.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

public ArrayList<Member> selectAll2() {
	String sql = "select * from newst";
	ArrayList<Member> arr = new ArrayList<Member>();
	
	try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		/*
		System.out.println(rs.next());
		System.out.println(rs.getString("id"));
		System.out.println(rs.getString("name"));
		System.out.println(rs.getInt("age"));
		System.out.println("=================");
		*/
		while(rs.next()) {
		Member m1 = new Member();
		m1.setId(rs.getString("id"));
		m1.setName(rs.getString("name"));
		m1.setAge(rs.getInt("age"));
		arr.add(m1);
		}
		
//		Member m2 = new Member();
//		m1.setId(rs.getString("id"));
//		m1.setName(rs.getString("name"));
//		m1.setAge(rs.getInt("age"));
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		dbClose();
	}
	return arr;
}


	public int delete(String inputID) {
		String sql = "delete from newst where id=?";
		int result=0;
		
		try {
			ps = con.prepareStatement(sql); //ps는 전송개채
			
			ps.setString(1, inputID); //완성되어 있지 않으니 완성시켜줌
			
//			rs = ps.executeQuery(); //완성된것을 전송해라
			result = ps.executeUpdate();//삭제되면 1이 돌아오고 실패하면 0이 돌아옴
			
			
			
		} catch (Exception e) {
		}finally {
			dbClose();
		}
		
		
		
		return result;
		
		
	}
	
	public int insert(String userID,
					String userName,int userAge) {
		int result = 0;
		String sql = "insert into newst values(?,?,?)";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, userID);
			ps.setString(2, userName);
			ps.setInt(3, userAge);
			result = ps.executeUpdate();
		} catch (Exception e) {
		}finally {
			dbClose();
		}
		return result;
		
		
	}
	public int update(Member m) {
		int result=0;
		String sql = "update newst set name=?, age=? where id=?";
				
				try {
					ps= con.prepareStatement(sql);
					ps.setString(1, m.getName());
					ps.setInt(2, m.getAge());
					ps.setString(3, m.getId());
					
					result = ps.executeUpdate();
					
				} catch (Exception e) {
				}finally {
					dbClose();
				}
				
				
				
		return result;
	}
}

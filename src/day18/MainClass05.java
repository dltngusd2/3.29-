package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainClass05 {
public static void main(String[] args) {
	Test05 t = new Test05();
	t.setName("홍길동");
	t.setAge(20);
	String path = "E:/정보처리과정A_오전/이클립스/java_workspace/";
	path = path+t.getName()+".txt";
	File filepath = new File(path);
	try {
	if(filepath.createNewFile()) {
		FileOutputStream fos = new FileOutputStream(filepath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(t);
		oos.close();
		System.out.println("저장 되었습니다!!!");
	}else {
		System.out.println("해당 회원은 존재 합니다");
		System.out.println("다른 이름으로 가입하세요");
	}
	}catch (Exception e) {
		filepath.delete();
		System.out.println("문제가 발생했습니다");
	}
	Scanner sc = new Scanner(System.in);
	String name;
	
	
	while(true) {
		System.out.println("찾을 이름 입력 : ");
		path = "E:/정보처리과정A_오전/이클립스/java_workspace/";
		name = sc.next();
		path = path + name + ".txt";
		File file = new File(path);
		try {
		FileInputStream fi = new FileInputStream(file);
		//System.out.println("fi : "+fi);
		BufferedInputStream b = new BufferedInputStream(fi);
		ObjectInputStream o = new ObjectInputStream(b);
		Test05 a = (Test05)o.readObject();
		
		System.out.println("이름 : "+a.getName());
		System.out.println("나이 : "+a.getAge());
				
		
		}catch (Exception e) {
			System.out.println("해당파일은 존재하지 않습니다");
		}
				
		
		
	}
	
	
}
}

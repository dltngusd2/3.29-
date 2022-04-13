package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 FileOutputStream
 - 기본 값은 해당 위치에 파일이 존재하지 않으면 새롭게 생성
 - 해당 위치에 파일이 존재하면 해당 파일을 파괴하고 새롭게 생성
 - 그렇기 때문에 기존의 내용은 사라지고 새로운 내용으로 바뀐다.
 -  옵션으로 true를 넣으면 append가 된다. 기존의 내용 뒤에 이어 써준다
 */

public class MainClass01 {
public static void main(String[] args) throws IOException {
	String path = "E:\\정보처리과정A_오전\\이클립스\\java_workspace\\test.txt";
	File path01 = new File("E:\\정보처리과정A_오전\\이클립스\\java_workspace\\test.txt");
//	FileOutputStream out =	new FileOutputStream(path);
//	path01.mkdir();
//	path01.delete();
	FileOutputStream out01 = new FileOutputStream(path01,true);
	out01.write(98);
	out01.write('B');
	String str = "ㄱㄱㄱㄱㄱㄱ";
	out01.write(str.getBytes() );
	
	
	
	// 해당 위치에 파일이 존재하면 false
	// 해당 위치에 파일이 존재하지 않으면 파일을 생성하고 true
	if(path01.createNewFile()) {
		System.out.println("새로운 파일을 생성합니다");
		FileOutputStream out02 = new FileOutputStream(path01);
	}else {
		System.out.println("해당 파일이 존재 합니다");
	}
	out01.close();
	
	
}
}

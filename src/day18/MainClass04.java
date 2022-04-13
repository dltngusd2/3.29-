package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass04 implements CommonPath{
public static void main(String[] args) throws Exception{
	
	FileOutputStream fos = new FileOutputStream(path);
	
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	
	DataOutputStream dos = new DataOutputStream(bos);
	
	dos.writeUTF("한글처리 됩니까");
	dos.flush();
	dos.writeUTF("내용추가");
	dos.close();
	
	FileInputStream fis=
			new FileInputStream(path);
	
	BufferedInputStream bis = new BufferedInputStream(fis);
	
	DataInputStream dis = new DataInputStream(bis);
	
	String str = dis.readUTF();
	String str1 = dis.readUTF();
	
	dis.close();
	
	System.out.println(str+str1);
}
}

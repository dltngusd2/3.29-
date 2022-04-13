package day18;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MainClass03 implements CommonPath{
public static void main(String[] args) throws Exception {
	
	FileOutputStream fos = new FileOutputStream(path);
	
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	
	for(char i = '0' ; i<='9' ; i++) {
		Thread.sleep(2000);
		bos.write(i);
	}
	bos.close();
	
}
}

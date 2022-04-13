package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass02 {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream(CommonPath.path);
	
	while(true) {
		int res = fis.read();
		if(res<0) {
			System.out.println("res : "+res);
			break;
			}
		System.out.println( (char) res);
	}
	
	
	
	
	
	
}
}

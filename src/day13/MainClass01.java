package day13;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {
	public static void main(String[] args) {
		//int 형태와 비슷하다
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat simple =
				new SimpleDateFormat("yyyy년 MM월dd일hh시 mm분 ss초");
		String s = simple.format(time);
		System.out.println(s);
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(simple.format(date));
		
//		for(int i=0; i<5 ; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
		String ss = "calc";
		ProcessBuilder pb = new ProcessBuilder(ss);
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
				
			}
}

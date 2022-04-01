package day11;

public class Test03 {
public int test1() {
	int var = 100;
	System.out.println("test : "+var);
	return var;
}
public void test2(int var) {
	System.out.println("test2 : "+var);
}
public void test3() {
	for(int i=0 ; i<10000; i++) {
		System.out.println("test3 : "+i);
		if(i==3) 
//			break;
			return;
	}
	System.out.println("for 다음문장");
}
public int test4() {
	int num = 3;
	if(num%3==0) {
	}else if(num%2==0){
		return -1;
	}
	return 0;
}
}

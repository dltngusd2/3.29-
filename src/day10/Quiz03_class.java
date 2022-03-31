package day10;


public class Quiz03_class {
	public int JH(int n1) {
		if(n1%2==0) return 0;
		else return 1;
}
	public void outPut(int n1,int re) {
		if(re==0)
			System.out.println(n1+"는 짝수입니다");
		else System.out.println(n1+"는 홀수입니다");
	}
}

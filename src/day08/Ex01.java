package day08;

public class Ex01 {
public static void main(String[] args) {
	int [][]arr = new int[][] {{1,2},{10,20},{30,40}};
	//2차원 배열
	System.out.println(arr[2][1]);
	for(int i = 0 ; i<arr.length ; i++) {
		for(int j=0 ; j<2 ; j++) {
			System.out.println(arr[i][j]+", ");
		}
	}
	System.out.println("==================");
	for(int[] a : arr) {
		for(int k:a) {
			System.out.println(k+",");
		}
		System.out.println();
	}
	
	
}
}

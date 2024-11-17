import java.util.*;
/*
사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
*/
class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int test_case = 1; test_case <= T; test_case++){
			int n = sc.nextInt();
			int[][] arr = new int[100][100];
			
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int max = 0;			
			for(int i = 0; i < 100; i++) {
				int sum = 0;
				for(int j = 0; j < 100; j++) {
					sum += arr[i][j];
				}
				max = Math.max(sum, max);
			}
			for(int i = 0; i < 100; i++) {
				int sum = 0;
				for(int j = 0; j < 100; j++) {
					sum += arr[j][i];
				}
				max = Math.max(sum, max);
			}
			int sum1 = 0;
			for(int i = 0; i < 100; i++) {
				sum1 += arr[i][i];
			}
			max = Math.max(sum1, max);
			int sum2 = 0;
			for(int i = 99; i >= 0; i--) {
				sum2 += arr[i][i];
			}
			max = Math.max(sum2, max);
			System.out.println("#" + test_case + " " + max);
		}
	}
}









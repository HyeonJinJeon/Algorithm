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
			int n = sc. nextInt();
			int[] arr = new int[100];
			
			for(int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < n; i++) {
				Arrays.sort(arr);
				arr[0] += 1;
				arr[99] -= 1;
			}
			Arrays.sort(arr);
			int answer = arr[99] - arr[0];
			System.out.println("#" + test_case + " " + answer);
		}
	}
}









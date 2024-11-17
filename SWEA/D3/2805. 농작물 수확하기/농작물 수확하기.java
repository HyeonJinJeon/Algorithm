import java.util.*;
class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				String line = sc.next();
				for(int j = 0; j < n; j++) {
					arr[i][j] = line.charAt(j)-'0';
				}
			}
			
			int answer = 0;
            int center = n / 2; // 중심 좌표

            // 마름모 모양 수익 계산
            for (int i = 0; i < n; i++) {
                int start = Math.abs(center - i); // 시작 열
                int end = n - start;             // 끝 열
                for (int j = start; j < end; j++) {
                    answer += arr[i][j];
                }
            }
			System.out.println("#" + test_case + " " + answer);
		}
	}
}









import java.util.*;
class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            for (int i = 0; i <= n - m; i++) { // 수정: <= 사용
                for (int j = 0; j <= n - m; j++) { // 수정: <= 사용
                    int sum = 0;
                    for (int a = 0; a < m; a++) {
                        for (int b = 0; b < m; b++) {
                            sum += arr[i + a][j + b];
                        }
                    }
                    if (sum > max) { // 내부 루프가 끝난 후에 max 업데이트
                        max = sum;
                    }
                }
            }
            System.out.printf("#%d %d\n", test_case, max);
        }
    }
}
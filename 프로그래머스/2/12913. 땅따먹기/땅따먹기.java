import java.util.*;
class Solution {
    int solution(int[][] land) {

        int[][] dp = new int[land.length][4];

        for (int j = 0; j < 4; j++) {
            dp[0][j] = land[0][j];
        }

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                // 현재 열을 제외한 이전 행의 최대 점수 찾기
                int maxPrev = 0;
                for (int k = 0; k < 4; k++) {
                    if (k != j) {
                        maxPrev = Math.max(maxPrev, dp[i - 1][k]);
                    }
                }
                dp[i][j] = land[i][j] + maxPrev;
            }
        }

        int answer = 0;
        for (int j = 0; j < 4; j++) {
            answer = Math.max(answer, dp[land.length - 1][j]);
        }

        return answer;
    }
}
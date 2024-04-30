import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int end = score.length%m;
        int cnt = 0;
        for(int i = score.length-1; i >= end; i--){
            cnt++;
            if(cnt%m == 0){
                k = score[i];
                answer += k*m;
            }
        }
        return answer;
    }
}
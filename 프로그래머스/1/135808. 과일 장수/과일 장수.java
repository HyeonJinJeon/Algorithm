import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int end = score.length%m;
        for(int i = score.length-m; i >= end; i-=m){
                k = score[i];
                answer += k*m;
        }
        return answer;
    }
}
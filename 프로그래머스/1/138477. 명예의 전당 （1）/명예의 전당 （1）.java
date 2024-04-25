import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] kArr = new int[k];
        int min = score[0];
        for(int i = 0; i < score.length; i++){
            if(i < k){
                kArr[i] = score[i];
                if(min > score[i]){
                    min = score[i];
                    answer[i] = min;
                } else {
                    answer[i] = min;
                }
            }else {
                Arrays.sort(kArr);
                if(score[i] > kArr[0]){
                    kArr[0] = score[i];
                    Arrays.sort(kArr);
                    answer[i] = kArr[0];
                }else{
                    Arrays.sort(kArr);
                    answer[i] = kArr[0];
                }
            }
        }
        return answer;
        
        //매일 새로운 가수가 나올 때마다 크기가 k인 배열을 정렬을 시킨다
        //다음날 부슨 가수의 점수가 배열의 최하위 사람보다 높으면 정렬된 첫번째 요소를 새로운 점수로 변경한 후 정렬한다. 
    }
}
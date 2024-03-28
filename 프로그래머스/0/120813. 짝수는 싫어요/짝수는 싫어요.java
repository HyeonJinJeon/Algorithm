class Solution {
    public int[] solution(int n) {
        int[] answer;
        if(n % 2 == 0){
            answer = new int[n/2];
        }else {
            answer = new int[n/2+1];
        }
        answer[0] = 1;
        for(int i = 3; i <= n; i++){
            if(i % 2 != 0){
                answer[i/2] = i;
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(long n) {
        int cnt = 0;
        long copy = n;
        while(copy > 0){
            copy /= 10;
            cnt++;
        }
        int[] answer = new int[cnt];
        for(int i = 0; i < cnt; i++){
            answer[i] = (int)(n%10);
            n /= 10;
        }
        return answer;
    }
}
class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int a = slice;
        if(slice >= n){
            return 1;
        }else{
            while(a / n == 0){
                answer += 1;
                a = slice * answer;
            }
            return answer;
        }
    }
}
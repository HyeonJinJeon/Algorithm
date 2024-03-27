class Solution {
    public int solution(int n) {
        int answer = 0;
        int slice = 7;
        int resultSlice = slice;
        int cnt = 1;
        while(resultSlice < n){
            cnt++;
            resultSlice = slice * cnt;
        }
        answer = cnt;
        return answer;
    }
}
class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int remain = 0;
        while(chicken>=10){
            remain = chicken % 10;
            chicken /= 10;
            answer = answer + chicken;
            chicken += remain;
        }
        return answer;
    }
}
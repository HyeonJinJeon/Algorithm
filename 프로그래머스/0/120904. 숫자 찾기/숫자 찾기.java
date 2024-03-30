class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int n = 0;
        int length = 0;
        int cnt = 0;
        while(n > 0){
            n = num/10;
            length++;
        }
        while(num>0){
            cnt++;
            if(num%10 == k){
                answer = length-cnt+2;    
            }else{
                answer = -1;
            }
            num /= 10;
        }
        return answer;
    }
}
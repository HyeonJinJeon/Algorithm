class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt = 0;
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= (int)Math.sqrt(i); j++){
               if(j*j == i){
                   cnt += 1;
               }else if(i%j == 0){
                    cnt += 2;
                }
            }
            if(cnt > limit){
                answer += power;
            }else{
                answer += cnt;
            }
            cnt = 0;
        }
        return answer;
    }
}
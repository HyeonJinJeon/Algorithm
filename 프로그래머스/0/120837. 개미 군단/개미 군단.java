class Solution {
    public int solution(int hp) {
        //개미장군 : 5
        //병정개미 : 3
        //일개미 : 1
        int answer = 0;
        while(hp>0){
            if(hp >= 5){
                answer += hp / 5;
                hp %= 5;
            }else if(hp>=3){
                answer += hp / 3;
                hp %= 3;
            }else if(hp>=1){
                answer += hp / 1;
                hp %= 1;   
            }
        }
        return answer;
    }
}
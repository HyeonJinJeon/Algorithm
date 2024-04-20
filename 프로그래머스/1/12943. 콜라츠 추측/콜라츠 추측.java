class Solution {
    public int solution(int num) {
        int answer = 0;
        long copy = num;
        if(num == 1){
            answer = 0;
        }else {
            for(int i = 0; i <= 500; i++){
            if(copy % 2 == 0){
                copy /= 2;
                answer++;
                if(copy == 1){
                    break;
                }
            }else if(copy % 2 == 1){
                copy = copy * 3 + 1;
                answer++;
            }
            }
            if(answer == 501){
                answer = -1;
            }
        }
        return answer;
    }
}
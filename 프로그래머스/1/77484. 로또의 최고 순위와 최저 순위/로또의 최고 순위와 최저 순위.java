class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zeroCnt++;
            }
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    cnt++;
                }
            }
        }
        if(zeroCnt == 6){
            answer[0] = 1;
            answer[1] = 6;
        }else if(cnt == 0){
            answer[0] = 6;
            answer[1] = 6;
        }
        else{
            answer[0] = 7-(cnt+zeroCnt);
            answer[1] = 7-cnt;
        }
        return answer;
        //최대 : 일치하는거 + 0의 개수
        //최소 : 일치하는거
    }
}
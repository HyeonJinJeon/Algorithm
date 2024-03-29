class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int index1 = total;
        int index2 = total;
        int result = 0;
        while(total != result){
            result = 0;
            for(int i = 0; i < num; i++){
                result = result + index2;
                index2--;
            }
            index1--;
            index2 = index1;
        }
        if(total == 0){
            index2 = num / 2;
            for(int i = num-1; i >= 0; i--){
                answer[i] = index2 ;
                index2--;
        }
        }else{
            for(int i = num-1; i >= 0; i--){
                answer[i] = index2 + 1;
                index2--;
            }
        }
        return answer;
    }
}